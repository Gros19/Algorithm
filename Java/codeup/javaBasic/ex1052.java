
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
 �� ���� a, b�� ������ �ΰ� �Էµȴ�.
-2147483647 <= a, b <= +2147483648


���
a�� b�� �ٸ� ��� 1��, �׷��� ���� ��� 0�� ����Ѵ�.


�Է� ����   
0 1

��� ����
1
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1052 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		int a, b;
		
		String str = s.nextLine();
		String[] sarr = str.split(" ");
		a = Integer.parseInt(sarr[0]);
		b = Integer.parseInt(sarr[1]);
		
		if(a!=b)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	

}
