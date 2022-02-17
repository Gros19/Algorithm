package Dstructure;

import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   //평년
            {31, 29, 31, 31, 31, 30, 31, 31, 30, 31, 30, 31}    //윤년
    };

    // (윤년:1, 평년:0)
     static int isLeap(int year){
         if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
             return 1;
         }
         else{
             return 0;
         }
     }

     static int dayOfYear(int y, int m, int d){
         int days = d;
         for(int i = 1; i < m; i++){
             days += mdays[isLeap(y)][i-1];
         }
         return days;
     }

     public static void main(String[] args){
         Scanner scn  = new Scanner(System.in);

         int retry;
         do{
             System.out.println("년: ");
             int year = scn.nextInt();
             System.out.println("월: ");
             int month = scn.nextInt();
             System.out.println("일: ");
             int day = scn.nextInt();

             System.out.printf("그 해의 %d일째 날입니다." , dayOfYear(year, month, day));

             System.out.println("한 번 더 할까요?(1: 네, 2: 아니오): ");
             retry = scn.nextInt();
         }while(retry == 1);
     }


}
