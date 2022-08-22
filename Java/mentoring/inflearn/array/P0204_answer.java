package inflearn.array;

import java.util.Scanner;

public class P0204_answer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        int l = 0;
        int res = 1;
        int e = 1;
        StringBuilder sb = new StringBuilder();


        for(int i = 1; i < n; i++){

            l = res;
            res = e;
            e = l + res;
            sb.append(res+" ");

        }
        System.out.println(1+" "+sb);

    }

}
