
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
2���� ������ ������ �ΰ� �Էµȴ�.
-2147483648 ~ +2147483647


���
�� ������ ��Ʈ����(bitwise)�� and ����� ������ ����� 10������ ����Ѵ�.


�Է� ����   
3 5

��� ����
1
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1060 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int b = Integer.parseInt(sarr[0]);
		int a = Integer.parseInt(sarr[1]);
		
		System.out.println(a & b);
		
	}
	
	
	

}
