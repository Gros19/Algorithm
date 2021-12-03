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
한 단어가 입력된다.(단, 단어의 길이는 50자 이하이다.)

문자를 50개 저장하기 위해서는 char data[51] 로 선언하면 된다.

char data[51]="";
scanf("%s", data);

를 실행하면, data[51] 에 한 단어가 저장된다.


출력
입력된 단어를 그대로 출력한다.




입력 예시   
Informatics

출력 예시
Informatics
  * 
  */
package codeUp;

//

import java.util.Scanner;



//


public class basic1019 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);

    	
     	char carr[] = new char[50];
     	String str = s.nextLine();
    	
     	for(int i =0; i<str.length();i++) {
     		carr[i] = str.charAt(i);
     		System.out.print(carr[i]);
     	}
    	
    	
    	
    	

    	


    	
    	
//    	


      
    }


}
