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
정수 1개를 입력받는다.
(1 ~ 100)


출력
1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
3의 배수는 출력하지 않는다.


입력 예시   
10

출력 예시
1 2 4 5 7 8 10
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1089 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int i = scn.nextInt();
    	
    	for(int n=1;n<=i;n++) {
    		if(n%3!=0) {
    			str +=n+" ";
    		}
    		
    	}
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
