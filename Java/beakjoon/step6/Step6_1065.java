package step6;

import java.util.Scanner;

/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

예제 입력 1
110
예제 출력 1
99
예제 입력 2
1
예제 출력 2
1
예제 입력 3
210
예제 출력 3
105
예제 입력 4
1000
예제 출력 4
144
예제 입력 5
500
예제 출력 5
119
 */
public class Step6_1065 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N =scn.nextInt();

        int han = 0;

        for(int i = 1; i < N + 1; i++){
            if(i < 100){
                han++;
            }else{
                han += checkH(i);
            }
        }

        System.out.println(han);

    }
    static int checkH(int n){
        int fir, sec, thr, comp1, comp2;
        if(n < 1000){
            //999
            fir = n/100;
            sec = n/10%10;
            thr = n%10;
            comp1 = fir - sec;
            comp2 = sec - thr;
            if(comp1 == comp2) {
                return 1;
            }
        }
        return 0;

    }

}
