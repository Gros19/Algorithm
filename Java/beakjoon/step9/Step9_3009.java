package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.

예제 입력 1
5 5
5 7
7 5
예제 출력 1
7 7
예제 입력 2
30 20
10 10
10 20
예제 출력 2
30 10
 */
public class Step9_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        String[] strin = br.readLine().split(" ");
        int x = Integer.parseInt(strin[0]);
        int y = Integer.parseInt(strin[1]);

        strin = br.readLine().split(" ");
        int x2 = Integer.parseInt(strin[0]);
        int y2 = Integer.parseInt(strin[1]);


        strin = br.readLine().split(" ");
        int x3 = Integer.parseInt(strin[0]);
        int y3 = Integer.parseInt(strin[1]);



        if(x == x2){
            sb.append(x3).append(" ");
        }else if(x2 == x3){
            sb.append(x).append(" ");
        }else if(x == x3){
            sb.append(x2).append(" ");
        }

        if(y == y2){
            sb.append(y3);
        }else if(y2 == y3){
            sb.append(y);
        }else if(y == y3){
            sb.append(y2);
        }

        System.out.println(sb);


    }
}
