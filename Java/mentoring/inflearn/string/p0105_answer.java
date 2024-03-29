package inflearn.string;

import java.io.IOException;
import java.util.Scanner;

/*
*
문자열-특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1
S#T!EG*b@a
예시 출력 1
a#b!GE*T@S

* */

public class p0105_answer {
    public static void main(String[] args) throws IOException {

        p0105_answer P = new p0105_answer();
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(P.solution(str));
    }

    private String solution(String str) {
        String ans;
        char[] s = str.toCharArray();

        int lt = 0, rt =str.length()-1;
        while (lt<rt){
            /*알파벳이냐*/
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        ans = String.valueOf(s);
        return ans;
    }


}
