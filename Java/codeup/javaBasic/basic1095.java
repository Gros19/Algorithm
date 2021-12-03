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
출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.


입력 예시   
20
10 4 2 3 6 6 7 9 8 5 1 4 2 3 6 0 7 9 8 5

출력 예시
2
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1095 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int n= scn.nextInt();
    	int []c = new int[n];
    	
    	
    	
    	for(int i=0;i<n;i++) {

    		int r = scn.nextInt();
    		
    		if(i==0||c[0]>r)
    		{
    			c[0] = r;
    		}
    	}
    	
    		
    		str +=c[0]+" ";
    	
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
