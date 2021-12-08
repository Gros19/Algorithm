package step1;

import java.util.Scanner;

public class Step1_10998 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String in = scn.nextLine();
        String num[] = in.split(" ",2);
        System.out.println(Integer.parseInt(num[0])*Integer.parseInt(num[1]));
    }
}
