package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
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

1
0 0 13 40 0 37

3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5
예제 출력 1
2
1
0
*/

public class Step9_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            List<String> strList = new ArrayList<>() ;
            Set<String> strSet = new HashSet<>();
            String[] str = br.readLine().split(" ");
            int x1, y1, r1, x2, y2, r2;

            x1 = Integer.parseInt(str[0]);
            y1 = Integer.parseInt(str[1]);
            r1 = Integer.parseInt(str[2]);
            x2 = Integer.parseInt(str[3]);
            y2 = Integer.parseInt(str[4]);
            r2 = Integer.parseInt(str[5]);


            int a1 = x1, a2 = x1+r1, a3 = x1, a4 = x1-r1;
            int b1 = y1+r1, b2 = y1, b3 = y1-r1, b4 = y1;



            for(int r = r1; r > -1; r--){
                strSet.add(String.format("%d %d",a1++,b1--));
                strSet.add(String.format("%d %d",a2--,b2--));
                strSet.add(String.format("%d %d",a3--,b3++));
                strSet.add(String.format("%d %d",a4++,b4--));
            }
            strList.addAll(strSet);
            strSet = new HashSet<>();


            int c1 = x2, c2 = x2+r2, c3 = x2, c4 = x2-r2;
            int d1 = y2+r2, d2 = y2, d3 = y2-r2, d4 = y2;

            for(int r = r1; r > -1; r--){
                strSet.add(String.format("%d %d",c1++,d1--));
                strSet.add(String.format("%d %d",c2--,d2--));
                strSet.add(String.format("%d %d",c3--,d3++));
                strSet.add(String.format("%d %d",c4++,d4--));
            }
            strList.addAll(strSet);
            strSet = new HashSet<>();
            strSet.addAll(strList);


            sb.append(strList.size()-strSet.size()).append("\n");
        }
        System.out.println(sb);
    }





}
