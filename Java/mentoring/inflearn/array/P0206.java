package inflearn.array;

import java.util.Scanner;

/*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55   62 20  250  370 200  30 100
예시 출력 1

23 2 73 2 3
 */
public class P0206 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i ++){
            int rev = convertInt(String.valueOf(scn.nextInt()).toCharArray());
            if(isSosu(rev)){
                sb.append(rev+" ");
            }
        }

        System.out.println(sb);

    }

    static boolean isSosu(int num){
        if(num == 1 || num == 0){
            return false;
        }
        for(int i= 2; i <= Math.sqrt(num); i++){
            int j = 2;
            int mul = j*i;
            while(mul <=num){
                j++;
                if(num%mul == 0){
                    return false;
                }
                mul = j*i;
            }
        }
        return true;
    }
    static int convertInt(char[] arr){
        String res  = "0";
        for(int i = arr.length-1; i>-1; i--){
            res += arr[i];
        }
        return Integer.parseInt(res);


    }

}
