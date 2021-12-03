//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[]args){
        
//
//
//
//
//
//

//    }
//}

 /*
문자들이 1개씩 계속해서 입력된다.


출력
'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.


입력 예시   
x b k d l q g a c

출력 예시
x
b
k
d
l
q
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1078 {


    public static void main(String[]args){
//
    	
    	Scanner scn = new Scanner(System.in);
    	char c;
    	while(true) {
    		c = scn.next().charAt(0);	//c에 문자를 입력받아
    		System.out.println(c);
    		if(c=='q')					//q를 입력하면 멈춤
    		{
    			break;
    		}
    				//다른 문자는 입력받는 족족 계속 출력
    	}
    	



    	
    	
//    	 
    }


}
