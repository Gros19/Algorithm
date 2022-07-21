package mentoring.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
a#b!GE*T@Sa#b!GE*T@Sa#b!GE*T@Sa#b!GE*T@Sa#b!GE*T@Sa#b!GE*T@Sa#b!GE*T@S
*
* 0127
*
예시 출력 1
S#T!EG*b@a
* */

public class p0105 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String instr = br.readLine();
        char[] charr = instr.toCharArray();
        int size = instr.length();
        char[] ans = new char[size];

        Arrays.fill(ans,'u');

        String spc = "`~!@#$%^&*()_-+=[]{ }\\|;:'\",.<>/?";

        String str = "";


        int from = 0;
        for(char c: charr){
            if(spc.indexOf(c)>-1){
                ans[instr.indexOf(c,from)] = c;
                from = instr.indexOf(c,from)+1;
            }
            else{
                str += c;
            }
        }

        int idx = str.length()-1;

        if(str.length() != 0){
            for(int i = 0; i < size; i++){
                if(ans[i] == 'u'){
                    ans[i] = str.charAt(idx--);
                }
            }
        }

        for(char a : ans){
            sb.append(a);
        }
        System.out.println(sb);
    }


}
