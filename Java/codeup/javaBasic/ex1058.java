
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
1 �Ǵ� 0�� ���� ������ 2���� ������ ������ �ΰ� �Էµȴ�.


���
�� �� ������ ��쿡�� 1�� ����ϰ�, �� ���� ��쿡�� 0�� ����Ѵ�.


�Է� ����   
0 1

��� ����
0
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1058 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		String strr[] = str.split(" ");
		int a = Integer.parseInt(strr[0]);
		int b = Integer.parseInt(strr[1]);
		
		
		
		
		if(a == b && b ==0)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	

}
