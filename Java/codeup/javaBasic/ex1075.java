
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
������ 1���� �Էµȴ�.
(a ~ z)


���
a���� �Է��� ���ڱ��� ������� ������ �ΰ� ����Ѵ�.


�Է� ����   
f
//f 111
//a 97
 *
 *
��� ����
a b c d e f
 */

package CodeUp;

import java.util.Scanner;

public class ex1075 {
	
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		char c = scn.nextLine().charAt(0);
		int a = 97;
		int v = (int)c-97;
		for(int b =0;b<=v; b++) {
			System.out.printf("%c\n",a);
			a++;
		}
		
	
		}
		
		
		


	}


