/*
 * ù° �ٿ� ���� �־�����.
 *  ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ְ�,
 *   ���� ó���� ������ ���ڴ� �����̴�. �׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�,
 *    5�ڸ����� ���� ���ӵǴ� ���ڴ� ����. ���� 0���� ������ �� �ִ�. 
 *    �Է����� �־����� ���� ���̴� 50���� �۰ų� ����.

���
ù° �ٿ� ������ ����Ѵ�.

���� �Է� 1 
55-50+40

���� ��� 1 
-35
 */



package Baekjoon;
import java.util.Scanner;
public class problem1541 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		String s = scn.nextLine();
		
		String st[] = s.split("[-]");
		//st[55, 50+40+50, 30+20]
		
		int sum =0;
		
		String mi[] = new String[40];
		//-���� ����
		String plus [] = st[0].split("[+]");
		//+���� ����
		//st���� -�� ������ �������� st[0]�� +�� �� �� �� ��Ʈ��
		
		
		for(int a=0; a<plus.length;a++)
			sum+=Integer.parseInt(plus[a]);
		//sum�� ���ؾ� �� ���� ����
		
//		st[50+40+50, 30+20]		
		for(int p=1;p<st.length;p++)
		{
			 mi=st[p].split("[+]");
			 for(int e=0; e<mi.length;e++)
			 {
				  sum-=Integer.parseInt(mi[e]);
				  
			 }
		}
		
		System.out.println(sum);
		
	}

}
