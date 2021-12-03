//import java.util.Scanner;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//public class Main{
//    public static void main(String[]args) throws IOException{
        
//
//
//
//
//
//

//    }
//}

 /*
번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.


출력
출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.


입력 예시   
10
10 4 2 3 6 6 7 9 8 5
0  1 2 3 4 5 6 7 8 9

출력 예시
5 8 9 7 6 6 3 2 4 10
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1094 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	//int r = 0;
    	
    	
    	int n= scn.nextInt();
    	int []c = new int[n];
    	
    	
    	
    	for(int i=1;i<=n;i++) {

    		int r = scn.nextInt();
    		c[n-i] = r;

    		//r=(int)(Math.random()*n);
    		
    	}
    	for(int i=0;i<n;i++) {
    		str +=c[i]+" ";
    	}
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
