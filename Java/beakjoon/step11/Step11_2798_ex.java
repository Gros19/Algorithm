package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
브루투포스-블랙잭
문제를 풀기 위한 기반
동적 계획 알고리즘 중 Knapsack 알고리즘을 구현해볼 필요성을 느낌
추가로 근사치를 반환하는 메서드도 구현
 */
public class Step11_2798_ex {
    /*
    배낭 용량 C
    n개의 물건
    각 물건 i
    각 물건의 무게 wi
    각 물건의 가치 vi
    K[i,0] = 0 //배낭의 용량이 0일 때
    K[0,w] = 0 //물건을 아무것도 안 담았을 때
    */

    public static void main(String[] args){
        int C = 10;
        int V[] = new int[]{0, 10, 40, 30, 50};
        int W[] = new int[]{0, 5, 4, 6, 3};
        int[][] K = new int[4+1][C+1];

        for(int i = 1; i < 5; i++){
            /*물건을 의미*/
            for(int w = 1; w < 11; w++){
                /*배낭의 임시용량을 의미*/
                if(W[i] > w){
                    K[i][w] = K[i-1][w];
                }else{
                    K[i][w] = Math.max(K[i-1][w],K[i-1][w-W[i]]+V[i]);
                }
            }
        }
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 11 ;j++){
                System.out.printf("%-3d",K[i][j]);
            }
            System.out.println();
        }
    }



}