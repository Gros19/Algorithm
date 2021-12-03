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
두 정수 a, b가 공백을 두고 입력된다.
-2147483648 <= a, b <= +2147483647


출력
a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.


입력 예시   
9 1

출력 예시
1

  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1049 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    
    	String str = s.nextLine();
    	String [] arr = str.split(" ");
    	
    	int a = Integer.parseInt(arr[0]);
    	int v =Integer.parseInt(arr[1]);
    	if (a>v)
    		System.out.print(1);
    	else
    		System.out.println(0);
    	



    	
    	
//    	 
    }


}
