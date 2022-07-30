package mentoring.inflearn;


import java.util.Scanner;

/*
1. 큰 수 출력하기
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.


예시 입력 1

6
7 3 9 5 6 12
예시 출력 1

7 9 6 12
* */
public class p0113 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        p0113 P = new p0113();
        int num = scn.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < num; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(P.solution(arr, num));
    }

    private String solution(int[] arr, int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < num; i++){
            if(arr[i-1]<arr[i]){
                sb.append(" ").append(arr[i]);
            }
        }


        return sb.toString();


    }

}
