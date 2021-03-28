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
같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)


출력
3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.


입력 예시   
3 7 9

출력 예시
63
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1093 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int sum = 0;
    	int q = scn.nextInt();
    	int w = scn.nextInt();
    	int e = scn.nextInt();
    	
    	
    	for(int i=1;i<=q*w*e;i++) {
    		
    			if(i%q==0&&i%w==0&&i%e==0) {
    				sum=i;
    				break;
    			}
    		
    		
    	}
    	str +=sum+" ";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
