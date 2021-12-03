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
주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
단, n, m은 10이하의 자연수


출력
나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.


입력 예시   
2 3

출력 예시
1 1
1 2
1 3
2 1
2 2
2 3
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1081 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner scn = new Scanner(System.in);
    
    	int in = scn.nextInt();
    	int nx = scn.nextInt();
    	
    	for(int i=1; i<=in;i++)
    	{	
    		for(int j=1; j<=nx;j++)
    		{
    			System.out.println(i+" "+j);
    		}
    		
    		
    		
    	}
    	
    	



    	
    	
//    	 
    }


}
