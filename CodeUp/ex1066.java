
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

�� ���� a, b, c �� ������ �ΰ� �Էµȴ�.
0 <= a, b, c <= +2147483647


���
�Էµ� ������� ¦(even)/Ȧ(odd)�� ���� �ٲ� ����Ѵ�.


�Է� ����   
1 2 8

��� ����
odd
even
even
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1066 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		int b = Integer.parseInt(sarr[1]);
		int c = Integer.parseInt(sarr[2]);
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(b%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(c%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
	}
	
	
	

}
