
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

���� 1���� �Էµȴ�.
-2147483648 ~ +2147483647, �� 0�� �Էµ��� �ʴ´�.


���
�Էµ� ������ ����
ù �ٿ� minus �� plus �� ����ϰ�,
�� ��° �ٿ� odd �� even �� ����Ѵ�.


�Է� ����   
-2147483648

��� ����
minus
even
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1067 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(a>0)
			System.out.println("plus");
		else
			System.out.println("minus");
		
	}
	
	
	

}
