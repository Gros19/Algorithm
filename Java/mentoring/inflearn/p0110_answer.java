package mentoring.inflearn;


import java.util.Scanner;

/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0



teachermode e

t e a c h e r m o d e
1 0 1 2 1 0 1 2 2 1 0

a b c d e
 */
public class p0110_answer {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        p0110_answer P = new p0110_answer();
        String str = scn.next();
        char c = scn.next().charAt(0);
        P.solution(str, c);

    }

    private void solution(String s, char c) {

        int []  answer = new int[s.length()];
        int p = 1000;
        int slen = s.length();

        /*c(e)
        * -> t e a c h e r m o d e
        * */
        for(int i = 0; i < slen; i++){

            if(s.charAt(i) == c){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        /*c(e)
         * t e a c h e r m o d e <-
         * */
        while (--slen > -1){
            if(s.charAt(slen) == c){
                p=0;
                answer[slen] = p;
            }else{
                p++;
                answer[slen] = Math.min(answer[slen], p);
                /*
                아래와 같음
                if(answer[slen]>p)
                    answer[slen] = p;
                */
            }
        }
        for(int a: answer){
            System.out.print(a+" ");
        }
    }

}
