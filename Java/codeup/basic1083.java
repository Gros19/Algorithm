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
10 보다 작은 정수 1개가 입력된다.
(1 ~ 9)


출력
1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.


입력 예시   
9

출력 예시
1 2 X 4 5 X 7 8 X
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1083 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner scn = new Scanner(System.in);
    	int a = scn.nextInt();
    	
    	for(int i=1; i<=a;i++)
    	{	
    		if(i%3!=0)
    		{
    		System.out.print(i+" ");
    		}
    		else
    			System.out.print("X ");

    		
    	}
    	
    	



    	
    	
//    	 
    }


}
