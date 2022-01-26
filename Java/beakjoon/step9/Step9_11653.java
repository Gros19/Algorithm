package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
소인수분해

문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

예제 입력 1
72
예제 출력 1
2
2
2
3
3
예제 입력 2
3
예제 출력 2
3
예제 입력 3
6
예제 출력 3
2
3
예제 입력 4
2
예제 출력 4
2
예제 입력 5
9991
예제 출력 5
97
103
 */
public class Step9_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int a = 2; a<=N; a++){
            while(N%a==0){
                N = N/a;
                sb.append(a).append("\n");
            }
        }
        System.out.println(sb);
    }


}
