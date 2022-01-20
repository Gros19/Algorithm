package step7;

import java.io.*;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

출력
첫째 줄에 A+B를 출력한다.

예제 입력 1
9223372036854775807 9223372036854775808
예제 출력 1
18446744073709551615

 */
public class Step7_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String strIn = br.readLine().trim();
        String[] left = (strIn.split(" ")[0]).split("");
        String[] right = (strIn.split(" ")[1]).split("");


        String res = "";


        int size = left.length<= right.length? left.length : right.length;
        int carry = 0;
        if(left.length == right.length){

            for(int i = size-1; i > -1; i--){
                int sum = Integer.parseInt(left[i])+Integer.parseInt(right[i])+carry;
                if(sum>9){
                    sum = sum - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                res =  sum + res;
            }

        }else if(left.length > right.length){

            for(int i = size-1, big = left.length -1; i > -1; i--, big--){
                int sum = Integer.parseInt(left[big])+Integer.parseInt(right[i])+carry;
                if(sum>9){
                    sum = sum - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                res =  sum + res;
            }
            size = left.length - size;

            for(int i = size-1; i > -1; i--){
                int sum = Integer.parseInt(left[i])+carry;
                if(sum>9){
                    sum = sum - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                res = sum + res;
            }

        }else if(left.length < right.length){

            for(int i = size-1,big = right.length-1; i > -1; i--,big--){
                int sum = Integer.parseInt(left[i])+Integer.parseInt(right[big])+carry;
                if(sum>9){
                    sum = sum - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                res =  sum + res;
            }
            size = right.length - size;

            for(int i = size-1; i > -1; i--){
                int sum = Integer.parseInt(right[i])+carry;
                if(sum>9){
                    sum = sum - 10;
                    carry = 1;
                }else{
                    carry = 0;
                }
                res = sum + res;
            }

        }
        if(carry == 1){
            res = carry + res;
        }



        System.out.println(res);


        br.close();

    }


}