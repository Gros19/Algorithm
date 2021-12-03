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
첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.


출력
1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.


입력 예시   
10
1 3 2 2 5 6 7 4 5 9

출력 예시
1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

//


public class basic1092 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	//int r = 0;
    	int []c ;
    	c = new int[23];
    	
    	int n= scn.nextInt();
    	
    	
    	
    	
    	for(int i=0;i<n;i++) {

    		int r =scn.nextInt();
    		c[r-1] += 1;

    		//r=(int)(Math.random()*n);
    		
    	}
    	for(int i=0;i<c.length;i++) {
    		str +=c[i]+" ";
    	}
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
