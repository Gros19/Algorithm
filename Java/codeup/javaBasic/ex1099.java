
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
10*10 ũ���� �̷� ������ ������ ������ ��ġ�� �Էµȴ�.


���
������ ���̰� �̵��� ��θ� 9�� ǥ���� ����Ѵ�.


�Է� ����   
1 1 1 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1
1 0 0 1 1 1 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 1 0 1 0 1
1 0 0 0 0 1 2 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1

��� ����
1 1 1 1 1 1 1 1 1 1
1 9 9 1 0 0 0 0 0 1
1 0 9 1 1 1 0 0 0 1
1 0 9 9 9 9 9 1 0 1
1 0 0 0 0 0 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1
 */

package CodeUp;

import java.util.Scanner;

public class ex1099 {
	
	public static void main(String[]args){
		
		Scanner scn = new Scanner(System.in);
		int [][] arr= new int [10][10];
		
		for (int a1 = 0; a1<10;a1++) {
			for(int a2 = 0; a2<arr.length;a2++ ) {
				arr[a1][a2] = scn.nextInt();
			}
			
		}
		
		
		 //sdfsdfasd
		//asdfsadf
		
		
		
		for (int a1 = 0; a1<10;a1++) {
			for(int a2 = 0; a2<arr.length;a2++ ) {
				System.out.print(arr[a1][a2]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
	
		}
		
}
		



