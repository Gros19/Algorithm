
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
�� ������ ������ �ΰ� �Էµȴ�.
-2147483648 ~ +2147483647


���
�� ���� �� ū ���� 10������ ����Ѵ�.


�Է� ����   
123 456

��� ����
456
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1063 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int b = Integer.parseInt(sarr[0]);
		int a = Integer.parseInt(sarr[1]);
		int c = Integer.parseInt(sarr[2]);
		int m = 210000000;
		if (m >= a)
			m = a;
		else if(m>=b)
			m = b;
		else if(m>=c)
			m = c;
		System.out.printf("%d",m);
		
	}
	
	
	

}
