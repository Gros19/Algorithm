
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
������ ���ڵ� : what?

������ 1���� �Էµȴ�.
(A, B, C, D ���� �� ���ڰ� �Էµȴ�.)


���
�򰡳��뿡 ���� �ٸ� ������ ��µȴ�.


�Է� ����   
A

��� ����
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
