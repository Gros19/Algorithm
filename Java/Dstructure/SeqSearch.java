package Dstructure;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while(i++ <= n){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println(" 요솟수: ");
        int num = scn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = scn.nextInt();
        }
        System.out.println("검색할 값: ");
        int ky = scn.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.printf("%d은(는) x[%d]에 있습니다.",ky, idx);
        }
    }
}
