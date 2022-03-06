package step10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
재귀-하노이 탑
하노이 탑 이동 순서
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	50416	24988	19406	49.189%
문제
세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.

아래 그림은 원판이 5개인 경우의 예시이다.



입력
첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.

출력
첫째 줄에 옮긴 횟수 K를 출력한다.

두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.

예제 입력 1
3
예제 출력 1
7
1 3
1 2
3 2
1 3
2 1
2 3
1 3

 */
public class Step10_11729 {
    public static ArrayList<Integer>[] colum = new ArrayList[3];
    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        colum[0] = new ArrayList();
        colum[1] = new ArrayList();
        colum[2] = new ArrayList();

        int i = 3;
        while (i >= 1)
            colum[--i].add(999);

        int n = Integer.parseInt(br.readLine());

        while (n > 0)
            colum[0].add(0, n--);

        int goal = colum[0].size();

        letUsHonoi(0, 2, goal);
        System.out.print(count+"\n"+sb);

        br.close();
    }

    public static List<Integer> dirSet(){
        List<Integer> all = new ArrayList();
        int i = 0;
        while (i < 3)
            all.add(i++);
        return all;
    }

    public static void letUsHonoi(int now, int goTo, int goal) throws IOException {
        while(goal > colum[goTo].size()){
            List<Integer> dir = direction(now, dirSet());

            //갈 수 있는 곳이 하나면
            if (dir.size() == 1) {
                //일단 간다
                move(now, dir.get(0));
                //갈 수 있는 곳이 둘이면
            }
            else if(dir.size() == 2) {
                /*
                * 0 1 <-
                * 1 2
                * 2 3 <-
                * 3 4*/
                //현재 열의 연속된 수가 홀수면
                if (Continuous(now)%2 == 0) {
                    //그대로 들어가고
                    move(now, goTo);
                }
                    //현재 열의 연속된 수가 짝수면
                else {
                    dir.remove((Object)goTo);
                    //목적지 반대편으로 들어간다
                    move(now, dir.get(0));
                }
            }
            //갈 수 있는 곳이 없다면
            else {
                //새로운 목적지 컬럼
                int newGoTo = whereMid();
                //새로운 출발지 컬럼
                int newNow = whereMin();
                //새로운 목표값
                int newGoal = Continuous(newNow)+1 + colum[newGoTo].size();
                letUsHonoi(newNow, newGoTo, newGoal);
            }

        }

    }

    //현재 위치에서 보낼 수 있는 곳은 어디인지
    public static List<Integer> direction(int now, List<Integer> all) {
        all.remove(now);
        List<Integer> del = new ArrayList<>();
        for (int a : all) {
            if (colum[now].get(0) >= colum[a].get(0)) {
                del.add(a);
            }
        }
        for(int d : del){
            all.remove((Object)d);
        }

        return all;
    }

    public static int whereMin(){
        int a = colum[0].get(Continuous(0));
        int b = colum[1].get(Continuous(1));
        int c = colum[2].get(Continuous(2));

        if(a < b){
            if(a < c){
                return 0;
                /* a<b */
                /* a<c */

            }
            else{
                return 2;
                /* a<b */
                /* a>=c */
            }
        }else{
            if(b < c){
                return 1;
                /* a>=b */
                /* b<c */

            }else{
                return 2;
                /* a>=b */
                /* b>=c */
            }
        }
    }
    //연속된 위층 마지막이 중간인 곳은 어디인지
    public static int whereMid(){
        int a = colum[0].get(Continuous(0));
        int b = colum[1].get(Continuous(1));
        int c = colum[2].get(Continuous(2));
        if(a >= b){
            //a >= b
            //b >= c
            if(b >= c){
                // a >= b >= c
                return 1;
            }
            //a >= b
            //c > b
            else if(a <= c){
                // c >= a >= b
                return 0;
            }
            // a >= b
            // c > b
            // a > c
            else{
                // a > c > b
                return 2;
            }
        }
        // b > a
        // a > c
        else if(a > c){
            //b > a > c
            return 0;
        }
        // b > a
        // a <= c
        // b > c
        else if (b > c) {
            // b > c >= a
            return 2;
        }
        // b > a
        // a <= c
        // b <= c
        else{
            // c >= b > a
            return 1;
        }
    }


    //요소들 중 연속된 수가 홀수인지 짝수인지 판별하기 위한
    //cnt 리턴
    public static int Continuous(int here) {
        int tmp = colum[here].get(0), cnt = -1;
        if(tmp == 999){
            return 0;
        }
        for(int a : colum[here]){
            if(a == tmp && a != 999){
                cnt++;
                tmp = a + 1;
            }else{
                break;
            }
        }
        return cnt;
    }

    //이동
    public static void move (int now, int goTo) throws IOException {
            int tmp = colum[now].get(0);
            if(tmp == 999 && colum[goTo].get(0) < tmp){
                return;
            }
            colum[now].remove(0);
            colum[goTo].add(0, tmp);
            sb.append((now + 1)+" "+(goTo + 1)+"\n");
            count++;
        }


}