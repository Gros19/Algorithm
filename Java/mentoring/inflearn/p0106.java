package mentoring.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
문자열- 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1

ksekkset
예시 출력 1

kset
* */


/*Time Limit Exceeded*/
public class p0106 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String poket = "";
        String res="";

        int inchar = br.read();
        char c = (char) inchar;

        while("\n ".indexOf(c)==-1){
            if(poket.indexOf(c)==-1){
                poket += c;
                res += c;
            }

            inchar = br.read();
            c = (char)inchar;
        }



        System.out.println(res);
    }


}
