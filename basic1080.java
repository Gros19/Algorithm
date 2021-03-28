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


출력
1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.


입력 예시   
55

출력 예시
10
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1080 {


    public static void main(String[]args){
//
    	
    	
    	int num=1,i=2;	
    	Scanner scn = new Scanner(System.in);
    
    	int sum = scn.nextInt();
    	for(; num<sum ;i++)
    	{	
    		
    		
    		num+=i;
    			
    	}
    	i--;
    	System.out.println(i);



    	
    	
//    	 
    }


}
