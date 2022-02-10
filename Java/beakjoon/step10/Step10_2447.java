package step10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
재귀-별 찍기 - 10

문제
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

입력
첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.

예제 입력 1
27
예제 출력 1

***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************

 */
public class Step10_2447 {

    public static List<String> arr = new ArrayList<>();

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        arr.add("***");
        arr.add("* *");
        arr.add("***");

        int n = Integer.parseInt(br.readLine());

        func(n);

        for(String str : arr){
            bw.write(str);
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();

    }

     public static void func (int n){
        int size = arr.size();
        if(n > size){
            //세로 복사
            for(int k = 2; k >0; k--){
                for(int i = 0; i < size; i++){
                    arr.add(arr.get(i));
                }
            }
            int zeroPart = 0;
            int part = arr.size()/3;
            int thrSize = part;

            //가로 복사
            for(int i = 0; i < 3; i++){
                if(i == 1){
                    for(; zeroPart < part; zeroPart++){
                        String s = arr.get(zeroPart);
                        arr.set(zeroPart, s+String.format("%"+s.length()+"s","")+s);
                    }
                }else{ // 0 ~ 3
                    for(; zeroPart < part; zeroPart++){
                        String s = arr.get(zeroPart);
                        arr.set(zeroPart, s+s+s);
                    }
                }
                part += thrSize; // 3
            }
            func(n);
        }else{
            return ;
        }
     }

}


