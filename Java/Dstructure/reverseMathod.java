package Dstructure;

import java.util.Scanner;

public class reverseMathod {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("요솟수: ");
        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("x[%d]: ",i);
            a[i] = scn.nextInt();
        }

        reverse(a);

        System.out.println("요소를 역순으로 정렬했습니다. ");
        for(int i : a){
            System.out.printf("x[%d]: ",i);
            System.out.print(i + " ");
        }
    }

    static void swap(int[] a, int idx1, int idx2){
        System.out.printf("\na[%d]와 a[%d]를 교환 합니다.\n", idx1, idx2);
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){

        for(int i = 0; i < a.length/2; i++){
            for(int j : a){
                System.out.print(j +" ");
            }
            swap(a, i, a.length - i -1);
        }
    }
}
