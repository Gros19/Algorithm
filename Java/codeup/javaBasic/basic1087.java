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
언제까지 합을 계산할 지, 정수 1개를 입력받는다.
단, 입력되는 자연수는 100,000,000이하이다.


출력
1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
그때까지의 합을 출력한다.


입력 예시   
57

출력 예시
66
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


//


public class basic1087 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	int sum=0;
    	
    	int Max = scn.nextInt();
    	
    	for(int n=1;sum<Max;n++) {
    		
    		sum+=n;
    	}
    	str +=sum+"\n";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
