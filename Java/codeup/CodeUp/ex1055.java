
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
�ϳ��� ���� ��� 1�� ����ϰ�, �� ���� ��쿡�� 0�� ����Ѵ�.


�Է� ����   
1 1

��� ����
1
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1055 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		String strr[] = str.split(" ");
		int a = Integer.parseInt(strr[0]);
		int b = Integer.parseInt(strr[1]);
		
		
		
		
		if(a == 1 || b == 1)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	

}
