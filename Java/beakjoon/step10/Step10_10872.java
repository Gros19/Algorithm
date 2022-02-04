package step10;

import java.util.Scanner;

/*
재귀-팩토리얼

문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

출력
첫째 줄에 N!을 출력한다.

예제 입력 1
10
예제 출력 1
3628800
예제 입력 2
0
예제 출력 2
1
 */
public class Step10_10872 {

    private static int sum = 1;

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println(factorial(n));


    }

    public static int factorial(int n){
        if (n > 1){
            sum *= n;
            n--;
            factorial(n);
        }
        return sum;
    }
}


