package step1;

import java.util.Scanner;

public class Step1_10430 {
    public static void main(String[] args) {
        /*
       첫째 줄에 (A+B)%C, 
       둘째 줄에 ((A%C) + (B%C))%C, 
       셋째 줄에 (A×B)%C, 
       넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
         */
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        String[] ins = sb.toString().split(" ", 3);
        sb =null;
        int A = Integer.parseInt(ins[0]);
        int B = Integer.parseInt(ins[1]);
        int C = Integer.parseInt(ins[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}