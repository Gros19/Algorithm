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
  * 
  * 입력
다섯 자리로 이루어진 1개의 정수를 입력받는다.
(단, 10,000 <= 입력받는 수 <= 99,999 )


출력
각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.


입력 예시   
75254

출력 예시
[70000]
[5000]
[200]
[50]
[4]
  * 
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1025 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    	String word = s.nextLine();
    	char [] sarr = new char[word.length()];
    	
    	for (int i = 0; i<word.length();i++) {
    		sarr[i] = word.charAt(i);
    		System.out.print("["+sarr[i]);
    		for (int a = (sarr.length-1-i); a>0; a--)
    			System.out.print("0");
    		System.out.println("]");
    		
    	}
    
    	



    	
    	
//    	 
    }


}
