package mentoring.inflearn;


import java.util.Scanner;

/*
9. 숫자만 추출
설명

문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.


입력
첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.


출력
첫 줄에 자연수를 출력합니다.


예시 입력 1

g0en2T0s8eSoft
예시 출력 1

208
 */
public class p0109_answer_2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        p0109_answer_2 P = new p0109_answer_2();
        String str = scn.nextLine();
        System.out.println(P.solution(str));

    }

    private Integer solution(String str) {

        String answer = "";

        /*
        * g0en2T0s8eSoft 입력받은 문자열의 문자 하나씩 반복복*/
       for(char c : str.toCharArray()){
            /*숫자라면*/
            if(Character.isDigit(c)){
                answer = answer + c;
            }
        }
        return Integer.parseInt(answer);
    }

}
