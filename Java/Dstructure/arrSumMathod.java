package Dstructure;

import java.util.Scanner;

public class arrSumMathod {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("요솟수: ");
        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("x[%d]: ",i);
            a[i] = scn.nextInt();
        }




        System.out.println("합 : " + sum(a));
    }


    static int sum(int[] a){
        int sum = 0;
        for(int i: a){
            sum += i;
        }

        return sum;
    }
}
