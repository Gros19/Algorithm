package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
기본 수학 2-터렛

문제
조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.



이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.

한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.

출력
각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.

예제 입력 1

3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

예제 출력 1
2
1
0


2
-2 3 8 1 2 5
0 0 8 3 -1 5

2
2
*/

public class Step9_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String[] str = br.readLine().split(" ");

            int x1, y1, r1, x2, y2, r2;

            x1 = Integer.parseInt(str[0]);
            y1 = Integer.parseInt(str[1]);
            r1 = Integer.parseInt(str[2]);
            x2 = Integer.parseInt(str[3]);
            y2 = Integer.parseInt(str[4]);
            r2 = Integer.parseInt(str[5]);

            sb.append(answer(x1, y1, r1, x2, y2, r2));
        }
        System.out.println(sb);
    }

    public static String answer(int x1, int y1, int r1, int x2, int y2, int r2){
        int d = (int) (Math.pow((y1 - y2), 2) + Math.pow(x1 - x2, 2));

        //중심이 같을 때
        if(x1==x2 && y1==y2){
            if(r1==r2)
                return "-1\n";
            else
                return "0\n";
        }
        //외접
        else  if(d == Math.pow(r1+r2,2))
            return "1\n";

        //내접
        else if(d==Math.pow(r2- r1,2))
            return "1\n";

        //외부 무접점
        else if(d > Math.pow(r1+r2,2))
            return "0\n";

        //내부 무접점
        else if(d < Math.pow(r1-r2,2))
            return "0\n";



        else
            return "2\n";

    }





}
