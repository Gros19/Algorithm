package mentoring.inflearn;

import java.util.Scanner;

public class p0101 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char[] str = scn.nextLine().toUpperCase().toCharArray();
        int com = scn.next().toUpperCase().charAt(0);
        int cnt = 0;

        for(int c: str){
            if(c == com){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
