package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1
4
1 3 5 7
예제 출력 1
3
 */
public class Step9_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        boolean[] arr = new boolean[1001];
        Arrays.fill(arr,true);
        arr[1] = false;


        for(int i = 2; i < 501; i++){
            for(int a = 2; a*i<1001;a++){
                arr[a*i] = false;
            }
        }



        br.readLine();
//        while(N-- > 0){
            String[] strnum = br.readLine().split(" ");
            for(String a: strnum){
                int tmpnum = Integer.parseInt(a);
                if(arr[tmpnum]){
                    cnt++;
                }
            }
//        }
        System.out.println(cnt);
    }


}
