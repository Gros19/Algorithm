package inflearn.array;

import java.util.Scanner;

/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
예시 출력 1

155
 */
public class P0209 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n  = scn.nextInt();
        int arr[][] = new int[n][n];
        int ans[] = new int[n*n];

        for(int i = 0; i< n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int choice = 2;

        for(int i = 0; i < n; i++){
            ans[0] += arr[n-1-i][i];
            ans[1] += arr[i][i];
            int col = 0;
            int row = 0;
            for(int j = n-1; j > -1; j--){
                col += arr[i][j];
                row += arr[j][i];
            }
            ans[choice++] = col;
            ans[choice++] = row;

        }
        int max = ans[0];
        int len = ans.length;
        for(int i = 1; i < len; i++){
            if(max < ans[i]){
                max = ans[i];
            }
        }
        System.out.println(max);
    }
}
