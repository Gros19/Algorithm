package mentoring.inflearn;

import java.util.Scanner;

public class p0101_another {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().toUpperCase();
        String com = scn.next().toUpperCase();

        int maxSize = str.length();
        int minSize = str.replaceAll(com, "").length();

        System.out.println(maxSize-minSize);

    }
}
