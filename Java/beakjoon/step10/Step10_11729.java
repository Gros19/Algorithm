package step10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        colum[0] = new ArrayList();
        colum[1] = new ArrayList();
        colum[2] = new ArrayList();


        int i = 3;
        while (i >= 1)
            colum[--i].add(21);

        int n = Integer.parseInt(br.readLine());

        while (n > 0)
            colum[0].add(0, n--);

        honoi(0, 2);
//        colum[0].remove(0);


    }

    public static void honoi(int now, int goTo) {

        List<Integer> dir = direction(now);

        //갈 수 있는 곳이 하나면
        if (dir.size() == 1)
            //일단 간다
            move(now, dir.get(0));

        //갈 수 있는 곳이 둘이면
        else if(dir.size() == 2) {
            //현재 열의 요솟수가 홀수면
            if (hereIsOdd(now) == 1)
                //그대로 들어가고
                move(now, goTo);

            //현재 열의 요솟수가 짝수면
            else {
                dir.remove(goTo);
                //목적지 반대편으로 들어간다
                move(now, dir.get(0));
            }
        }

        //갈 수 있는 곳이 없다면
        else {
            //불러오기
            //honoi(int 최솟값, int 중간값)
        }
    }

    public static List<Integer> direction(int now) {

        List<Integer> all = new ArrayList();
        int i = 0;

        while (i < 3)
            all.add(i++);
        all.remove(now);

        for (int a : all)
            if (colum[now].get(0) >= colum[a].get(0))
                all.remove(a);

        return all;
    }


    public static int hereIsOdd(int here) {
        if ((colum[here].size() - 1) / 2 == 0)
            return -1;
        else
            return 1;
    }

        public static void move ( int now, int goTo){
            System.out.println((now + 1) + " " + (goTo + 1));
            int tmp = colum[now].get(0);
            colum[now].remove(0);
            colum[goTo].add(0, tmp);
        }


}