package Baekjoon;
/*
 * 
n���� ����
km
1km �� 1L
sum ����� ���� ����
ó�� �����ҿ��� �⸧�� �ְ� ���

������ ���� n
������ ���� km
������ ���ʹ� ���� wan
	�� �������� ����; ������ �ʿ䰡 �����ϱ�
 */
import java.util.Scanner;
public class Problem13305 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		long sum=0;								//���� ���� �����÷ο� ����	
		int n = scn.nextInt();					//n ���� ��
		int wan[] = new int[n];  				//wan ���ô� ����
		long km[] = new long[n-1];				//km �Ÿ�
		
		for(int i = 0;i<km.length;i++)
			km[i] = scn.nextInt();
		

		for(int i = 0;i<wan.length;i++)
			wan[i] = scn.nextInt();
		
		/*
		01 02 03 04 
		01 02 23 24
		01 12 13 14
		01 12 13 34
		01 12 23 34
		01 12 13 34
		0  1  2  3
		8
		2 3 5 6 9 4 3 
		7 5 7 3 1 4 7 4
		*/
//		14
//		15
//		25
//		18
//		9 
//		4
//		3
												//i�� wan[i] �����Ҵ� ���ݿ� ����
		int i =0, k =0;							//k�� km[k] �Ÿ��� ���������� �����ϱ� ����
		for(int j = 1; j<=km.length;j++) {		//j ���� ����
			sum+=(long)km[k]*wan[i];			//�����÷ο� ���� ���� ����ȯ
			
			if(wan[i] >= wan[j]) {	
			i=j;								//j�� �� ������ i�� j �Է�
			}
			
			k++;								//���� km�� �ҷ����� ���� ����
			
		}
		System.out.println(sum);
	}
  
}
