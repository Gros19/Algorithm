
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
 ������ ������� �Էµȴ�.
-2147483648 ~ +2147483647, �� ������ �� �� ����.


���
�Էµ� ������ ���� �ٲ� �ϳ��� ����ϴµ�, 0�� �ԷµǸ� �����Ѵ�.
(0�� ������� �ʴ´�.)


�Է� ����   
7 4 2 3 0 1 5 6 9 10 8

��� ����
7
4
2
3
 */

package CodeUp;

import java.util.Scanner;

public class ex1071 {
	
static void call(String st, int i) {
		
		
		int a;
		
		String [] sarr = st.split(" ");
		a =Integer.parseInt(sarr[i]);
		
		
		if(a!=0) {
			System.out.println(a);
			i++;
			call(st,i);
		}
		
		
	}
	

		
		public static void main(String[]args){
			Scanner s = new Scanner(System.in);
			String st = s.nextLine();
			call(st, 0);
		}
//		call();
		
		
//		Scanner s = new Scanner(System.in);
//		  for (;;) {
//		         int a = s.nextInt();
//		         if (a == 0)
//		            break;
//		         System.out.println(a);


//	}

}

