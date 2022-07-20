package Dstructure;

import java.util.Scanner;
/*Do it
자료구조와 함께 배우는 알고리즘 입문
------------------------------
선형 검색 개선(보초)
------------------------------*/
public class SeqSearchSentinel {
    static int seqSearchSentinel(int[] a, int n, int key){
        int i = -1;
        a[n] = key;

        while(true){
            if(a[++i] == key){
                if(i == n){
                    return -1;
                }else{
                    return i;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println(" 요솟수: ");
        int num = scn.nextInt();

        int[] x = new int[num+1];

        for(int i = 0; i < num; i++){
            System.out.printf("x[%d] : ", i);
            x[i] = scn.nextInt();
        }
        System.out.println("검색할 값: ");
        int ky = scn.nextInt();

        int idx = seqSearchSentinel(x, num, ky);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.printf("%d은(는) x[%d]에 있습니다.",ky, idx);
        }
    }
}
