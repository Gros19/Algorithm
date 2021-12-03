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
입력
단어(영어) 하나를 입력받는다.
(단, 단어의 길이는 20자 이하이다.)


출력
단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩
' '로 묶어서 출력한다.


입력 예시   
Boy

출력 예시
'B'
'o'
'y'
  * 
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1024 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    	String word = s.nextLine();
    	char [] sarr = new char[word.length()];
    	
    	for (int i = 0; i<word.length();i++) {
    		sarr[i] = word.charAt(i);
    		System.out.println("\'"+sarr[i]+"\'");
    	}
    
    	
    	
//    	System.out.println(sb.substring(2));
    	




    	
    	
//    	 
    }


}
