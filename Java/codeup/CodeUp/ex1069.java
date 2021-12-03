
//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        
//					
//        
//    }
//}
//



/*
 * 
 * 
 * 
 * A : best!!!
B : good!!
C : run!
D : slowly~
나머지 문자들 : what?

영문자 1개가 입력된다.
(A, B, C, D 등의 한 문자가 입력된다.)


출력
평가내용에 따라 다른 내용이 출력된다.


입력 예시   
A

출력 예시
best!!!
 */


package CodeUp;

import java.util.Scanner;

public class ex1069 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String sc = s.nextLine();
		char c = sc.charAt(0);
		
		switch(c) 
		{
		
		case 'A': System.out.println("best!!!");
			break;
		
		case 'B':System.out.println("good!!");
				
		break;
		
		case 'C':System.out.println("run!");
		
		break;
			
		case 'D':System.out.println("slowly~");
		
		break;
		
		default:System.out.println("what?");
		}
		
		
		
	}
	
	
	

}
