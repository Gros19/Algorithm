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
년월일이 '.'(닷)으로 구분되어 입력된다.


출력
년월일을

일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.


입력 예시   
2014.07.15

출력 예시
15-07-2014 
  * 
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1027 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    	String ymd = s.nextLine();
    	String y = ymd.split("\\.")[0];
    	String m = ymd.split("\\.")[1];
    	String d = ymd.split("\\.")[2];
    	
    	System.out.printf("%02d-%02d-%04d",Integer.parseInt(d),Integer.parseInt(m),Integer.parseInt(y));
    
    	



    	
    	
//    	 
    }


}
