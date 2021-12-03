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
정수 1개가 입력된다.
(0 ~ 100)


출력
1부터 입력된 수까지 짝수의 합을 출력한다.


입력 예시   
5

출력 예시
6

  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1079 {


    public static void main(String[]args){
//
    	
    	
    	int sum=0;	// 합 출력 떄 쓸 변수
    	Scanner scn = new Scanner(System.in);
    
    	int in = scn.nextInt();
    	for(int i=0; i<=in;i+=2)
    	{	
    		
    		sum+=i;
    		
    	}
    	System.out.println(sum);
    	



    	
    	
//    	 
    }


}
