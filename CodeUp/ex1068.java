
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
�� ����
���� ���� : ��
 90 ~ 100 : A
 70 ~   89 : B
 40 ~   69 : C
   0 ~   39 : D
�� �򰡵Ǿ�� �Ѵ�.

����(0 ~ 100) 1���� �Էµȴ�.


���
�� ����� ����Ѵ�.


�Է� ����   
73

��� ����
B
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1068 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		
		if (a>=90)
			System.out.println("A");
		else if (a>=70)
			System.out.println("B");
		else if (a>=40)
			System.out.println("C");
		else 
			System.out.println("D");
		
	}
	
	
	

}
