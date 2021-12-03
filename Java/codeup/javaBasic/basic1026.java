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
시 분 초가
시:분:초 형식으로 입력된다.


출력
분만 출력한다.


입력 예시   
17:23:57
23:00:00
출력 예시
23
  * 
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1026 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    	String hms = s.nextLine();
    	String H = hms.split(":")[0];
    	String M = hms.split(":")[1];
    	String S = hms.split(":")[2];
    	
    	System.out.printf("%d",Integer.parseInt(M));
    
    	



    	
    	
//    	 
    }


}
