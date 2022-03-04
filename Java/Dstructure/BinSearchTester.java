package Dstructure;

import java.util.Arrays;
import java.util.Scanner;

/*Do it
자료구조와 함께 배우는 알고리즘 입문
------------------------------
이진 검색
------------------------------
Arrays.binarySearch로 이진 검색*/

public class BinSearchTester {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = scn.nextInt();

        int[] x = new int[num];
        System.out.println("오름차순으로 입력하세요: ");

        System.out.print("x[0]: ");
        x[0] = scn.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.printf("x[%d]: ", i);
                x[i] = scn.nextInt();
            }while(x[i] < x[i -1]);
        }

        System.out.println("검색할 값: ");
        int key = scn.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if(idx  < 0){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.printf("%d은(는) [%d]에 있습니다.",key, idx);
        }
    }

}
