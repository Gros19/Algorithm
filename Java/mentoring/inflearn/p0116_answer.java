package inflearn;

import java.util.Scanner;

public class p0116_answer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;
        
        int l = 0;
        int res = 1;
        int e = 1;
        StringBuilder sb = new StringBuilder();


        while(i++ < n){
            sb.append(res+" ");
            l = res;
            res = e;
            e = l + res;

        }
        System.out.println(sb.toString());

    }

}
