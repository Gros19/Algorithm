
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
-2147483648 ~ +2147483647


���
��Ʈ ������ 1 -> 0, 0 -> 1�� �ٲ� �� �� ���� 10������ ����Ѵ�.


�Է� ����   
2

��� ����
-3
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1059bin {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();//���� �Է�
		int k;
		int aa = a; //���� ����
		
		int z = 0;	//��Ʈ�� ��ȯ�� ũ�� ���
		while(aa >= 2) {
			aa = aa/2;
			z++;
			
			
		}
		
		int arr[] = new int[z+1];	//01234 0���ʹϱ�  z+1

		
		for(int i=z; i>=0; i--) {	//������ �ڸ����� �Է��ؼ� z���� 1�� ��
			arr[i] = a%2;			//2�� ���� �������� arr[i]�� ����
			a = a/2;				//a�� 2�� ���� ���� a�� ����

			
		}
		
		for(int j = 0; j<=z; j++) {	//�迭 �����
//			if (arr[j]==1)
//				arr[j] = 0;
//			else
//				arr[j] = 1;
			k = arr[j];
			System.out.print(arr[j]);
			
		}
		
	}
	
	
	

}
