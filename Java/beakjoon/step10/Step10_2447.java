package step10;

import java.util.*;

/*
재귀-별 찍기 - 10

문제
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.

예제 입력 1
27
예제 출력 1

***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************



n = 27/3 = 9 개의 반복
9 / 3 = 3   또 9개의 반복
-----81 개의 반복
3/ 3 = 1 9개의 반복 끝


 */
public class Step10_2447 {

    public static List<String> arr;
    public static int n = 9;
    public static String[] res = new String[n];
    public static int y = 0;
    public static int i = -1;
    public static int charge = 0;

    public static void main(String[]args){

//        for(int a=0; a<3; a++)
//            for(int aa=0; aa<3; aa++)
//                for(int aaa=0; aaa<3; aaa++)
//                    for(int aaaa=0; aaaa<3; aaaa++)



        Scanner scn = new Scanner(System.in);

        Arrays.fill(res, "");
        arr =  new ArrayList<>(Collections.nCopies(n,""));
        func(n);

        String a = "";


        int f = 0;
        int log = (int)(Math.log(n) / Math.log(3));

        for(int i = 0; ++i < n*n;){

        }

//        while(i <= log){
//            for(int v = 0; v <3; v++){
//                int w= 0;
//                while(w++ < 3 && ++i < n){
//                    res[++hori] += arr.get(i);
//                }
//                hori=ctr;
//            }
//        }
        now(3);



        a= "";
        for(String ss: res){
            a+=ss+"\n";
        }
        System.out.println(a);
    }

    public static void now(int n){
        if(n>0){
            for(int a = 0;a<3 ; a++){
                for(int aa = 0;aa<3 ; aa++){
                    now(n/3);
                }
                System.out.println();
            }
        }else{
            System.out.print("*");
        }



//        if(f++<log){
//            for(int q=0 ; q < 9; q++){
//
//                if(q==3 || q==6){
//
//                    y-=8;
//                }
//                now(f, log);
//
//
//            }
//        }else{
//            int su = y+3;
//            for(int k= 0; k < 3; k++){
//                //0 ~ 2
//                //3 ~ 5
//                //6 ~ 8...
//                for(int x=y; x<su; x++){
//                    res[x] += arr.get(++i);
//                }
//            }
//            if(i== n*n/3-1 || i==n*n/3*2-1){
//                y=0;
//            }else{
//                y+=3;
//            }

//        }



    }


     public static void func (int n){

         if(n/3 > 1){
             for(int i = 0; i < 9; i++)
                 if(i == 4)
                    funcSpace(n/3);
                 else
                    func(n/3);
         }
         else {
             for(int i = 0; i < 9; i++) {
                 arr.set(0, arr.get(0)+"***");
                 arr.set(1, arr.get(1)+"* *");
                 arr.set(2, arr.get(2)+"***");
             }

         }
     }


    public static void funcSpace (int n) {
        if(n/3 > 1)
            for(int i = 0; i < 9; i++)
                funcSpace(n/3);
        else
            for(int i=0; i<9; i++)
                arr.add(" ");
    }
}


