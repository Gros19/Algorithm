package Dstructure;

import java.util.Scanner;

/*Do it
자료구조와 함께 배우는 알고리즘 입문
------------------------------
이진 검색
------------------------------*/
public class BinSearchUseFor {
    /*요솟수가 n인 배열a 에서
    * key와 같은 요소를 이진 검색합니다.*/
    static int binSearch(int[] a, int n, int key){

        /*이진 검색 범위의 첫 인덱스*/
        int pl = 0;
        /*이진 검색 범위의 끝 인덱스*/
        int pr = n - 1;
        for(;pl <= pr;){
            /*중앙 요소의 인덱스*/
            int pc = (pl + pr) / 2;

            /*검색 성공*/
            if(a[pc] == key)
                return pc;
            /*검색 범위를 뒤쪽 절반으로 좁힘*/
            else if(a[pc] < key)
                pl = pc + 1;
            /*검색 범위를 앞쪽 절반으로 좁힘*/
            else
                pr = pc - 1;
        }

        /*검색 실패*/
        return -1;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println(" 요솟수 : ");
        int num = scn.nextInt();
        int[] x = new int[num];

        System.out.println(" 오름차순으로 입력하세요.");

        System.out.print("x[0] :");
        x[0] = scn.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.printf("x[%d] :",i);
                x[i] = scn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.println(" 검색할 값 : ");
        int ky = scn.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("ky은(는) x[%d]에 있습니다.",idx);
    }
}
