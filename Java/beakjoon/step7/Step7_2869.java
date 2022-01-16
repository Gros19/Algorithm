package step7;

import java.io.*;

/*
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

예제 입력 1
2 1 5
예제 출력 1
4
예제 입력 2
5 1 6
예제 출력 2
2
예제 입력 3
100 99 1000000000
예제 출력 3
999999901
43 2 244
 */
public class Step7_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strin = br.readLine().split(" ");

        int a = Integer.parseInt(strin[0]);
        int b = Integer.parseInt(strin[1]);
        int v = Integer.parseInt(strin[2]);

        if(v - a == 0){
            bw.write(1+"");
        }else{
            int tmp = v-a;
            int ftmp = a-b;
            int res = 0;

            res += (tmp)/ftmp;

            if(tmp % ftmp == 0 ){
                res += 1;
            }else{
                res += 2;
            }
            bw.write(res+"");


        }

        bw.flush();
        bw.close();
        br.close();

    }


}
/*
public class Main {

    public static void main(String[] args) throws Exception {
//
//         * 달팽이는 올라가고 싶다 문제
//

    // 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
    // V까지 올라가는데 걸리는 일수는?

    // 5 1 60
    // 55 까지 4로 14번

    int A = read();
    int B = read();
    int V = read();

        if (A == V) {
                System.out.println(1);
                }  else {
                int a = (V - A)/(A - B);
                if ((V - A)%(A - B) == 0) {
                System.out.println(a + 1);
                } else {
                System.out.println(a + 2);
                }
                }
                }

private static int read() throws Exception {
        int c, n = System.in.read() & 15;
        boolean isNegative = n == 13;
        if (isNegative) {
        n = System.in.read() & 15;
        }
        while ((c = System.in.read()) > 32) {
        n = (n << 3) + (n << 1) + (c & 15);
        }
        return isNegative ? ~n + 1 : n;
        }
        }
 */