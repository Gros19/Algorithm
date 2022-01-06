package step7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*
문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1
joonbaek
jooooddd
joonbeak
예제 출력 1
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
joonbeak
 */
public class Step7_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        for (int i : new Step7_10809().solB(line)) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
    public int[] solA(String line){
        String[] charSp = line.split("");
        int[] arr = new int[26];
        String dic = "abcdefghijklmnopqrstuvwxyz";
        Arrays.fill(arr, -1);

        int size = charSp.length;
        for(int i = 0; i < size; i++){
            if(line.contains(charSp[i]) == true) {
                arr[dic.indexOf(charSp[i])] = line.indexOf(charSp[i]);
            }
        }
        return arr;
    }
    public int[] solB(String str){
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] num = new int[26];

        for (int i = 0 ; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 0 ; j < alpha.length; j++) {
                if (c == alpha[j]) {
                    num[j] = str.indexOf(alpha[j])+2;
                }

            }
        }

        for (int j = 0 ; j < num.length; j++) {
            if(num[j] == 0){
                num[j] = -1;
            }
            else{
                num[j] -=2;
            }

        }
        return num;

    }
}
