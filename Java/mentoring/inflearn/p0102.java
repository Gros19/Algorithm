package mentoring.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* 2. 대소문자 변환
설명

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.


예시 입력 1
StuDY
예시 출력 1
sTUdy
*
* */

public class p0102 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] input = br.readLine().toCharArray();
        for(int i : input){
            if(i < 91){
                sb.append(String.format("%c",i+32));
            }else{
                sb.append(String.format("%c",i-32));
            }
        }
        System.out.println(sb);

    }
}
