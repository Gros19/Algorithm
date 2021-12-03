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
입력
시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 10)


출력
n번째 수를 출력한다.


입력 예시   
2 3 7

출력 예시
1458
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1088 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int start = scn.nextInt();
    	int r = scn.nextInt();
    	int n = scn.nextInt();
    	long sum=start;
    	
    	for(int i=2;i<=n;i++) {
    		sum*=r;
    	}
    	str +=sum+"\n";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
