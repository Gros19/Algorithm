package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제
1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.

출력
각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.

제한
4 ≤ n ≤ 10,000
예제 입력 1
3
8
10
16
예제 출력 1
3 5
5 5
5 11

24
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50

4 = 2+2
6 = 3+3
8 = 3+5
10 = 3+7 = 5+5
12 = 5+7
14 = 3+11 = 7+7
16 = 3+13 = 5+11
18 = 5+13 = 7+11
20 = 3+17 = 7+13
22 = 3+19 = 5+17 = 11+11
24 = 5+19 = 7+17 = 11+13
26 = 3+23 = 7+19 = 13+13
28 = 5+23 = 11+17
30 = 7+23 = 11+19 = 13+17
32 = 3+29 = 13+19
34 = 3+31 = 5+29 = 11+23 = 17+17
36 = 5+31 = 7+29 = 13+23 = 17+19
38 = 7+31 = 19+19
40 = 3+37 = 11+29 = 17+23
42 = 5+37 = 11+31 = 13+29 = 19+23
44 = 3+41 = 7+37 = 13+31
46 = 3+43 = 5+41 = 17+29 = 23+23
48 = 5+43 = 7+41 = 11+37 = 17+31 = 19+29
50 = 3+47 = 7+43 = 13+37 = 19+31

 */
public class Step9_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            int n = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[n+1];
            Arrays.fill(arr,true);

            for(int i = 2;i < arr.length/2+1; i++){
                for(int j = 2; j*i < arr.length; j++){
                    arr[i*j] = false;
                }
            }

            if(arr[n/2]){
                sb.append(n / 2).append(" ").append(n / 2).append("\n");
                continue;
            }
            String res = "";
            for(int m = arr.length-2; m > 2 ; m--){
                if(arr[m]){
                    int s = 2;
                    while(s < m){
                        if(arr[s]){
                            if(m+s == n){
                                res = s + " " + m;
                                break;
                            }
                        }
                        s++;
                    }
                }
            }
            sb.append(res).append("\n");


        }
        System.out.println(sb);
    }


}
