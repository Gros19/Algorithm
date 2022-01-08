package step7;

import java.io.*;

/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1
Mississipi
예제 출력 1
?
예제 입력 2
zZa
예제 출력 2
Z
예제 입력 3
z
예제 출력 3
Z
예제 입력 4
baaa
예제 출력 4
A
 */
public class Step7_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strIn = br.readLine().toUpperCase();
        char[] strC = strIn.toCharArray();
        int[] al = new int[26];

        for(int i = 0 ; i < strC.length; i++){
            ++al[strC[i]%65];
        }
        bw.write(isMaxRes(al));


        bw.flush();
        bw.close();
        br.close();

    }
    public static String isMaxRes(int[] al){
        String res = "";
        int max=0,mi=0;
        int maxD=0;
        for (int i = 0; i < al.length; i++) {
            if(max < al[i]){
                max = al[i];
                mi = i;
            }else if(max == al[i]){
                maxD = al[i];
            }
        }

        if(max == maxD){
            res = "?";
        }else{
            res = String.valueOf((char)(mi+65));
        }
    return res;
    }

}
/*
fastcase
        int[] arr = new int[26];
        int c = System.in.read();
        while (c > 64) {
            if (c < 91) {
                arr[c - 65]++;
            } else {
                arr[c - 97]++;
            }
            c = System.in.read();
        }
        int max = -1;
        int ch = -2;
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = i;
            } else if (arr[i] == max) {
                ch = -2;
            }
        }
        System.out.print((char) (ch+65));
 */