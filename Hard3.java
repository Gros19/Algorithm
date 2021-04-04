package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hard3 {
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int first = scn.nextInt(); // � �Է¹�����
		int su[] = new int[first]; // ���ڵ��� �Է¹ޱ����� �迭 �Ҵ�

		int tmp = 0; // ������ ���� ����
		int B = 0, D = 0, Temp = 0, gcd = 0; // ȣ�������� �ִ������� ���� �� �� ����
		String s = "";

		for (int i = 0; i < first; i++) //
		{
			su[i] = scn.nextInt(); // first��ŭ ���� �Է¹ޱ�
		}

		for (int i = 0; i < first; i++) // ���� �������� ����
		{
			for (int j = i + 1; j < first; j++) {

				if (su[i] > su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp;
				}
			}
		}
		
		
		
		
		
		
		// ���� ���� GDC�ִ������� ���ؾ� ��
		// ���谡 �˷��� ������� ����
		/*
		 * 
		 * �Ʒ� �ݺ��� ����
		 * 0 1 2 3 4 5
		 * 
		 * 1-0 
		 * 2-1 
		 * GCD ó���� ������ �Է�
		 * 3-2
		 * GCD?
		 * 4-3
		 * GCD?
		 * 4-5
		 * GCD?
		 * 
		 * GCD? �տ� GCD�� ���ؼ� ���� ������ �ٲ�ġ��
		 *���������� ���� ���� GCD�� ���ؼ� 
		 *GCD�� ����� ��� 
		 */
		for (int i = 0; i < su.length - 1; i++) {
			D = su[i + 1] - su[i];
			
			for (int j = i + 1; j < su.length-2; j++) {
				B = su[j + 1] - su[j];
				i = j;
				
			}

				while (B % D != 0) { // ȣ���� ���
					Temp = B % D;
					B = D;
					D = Temp;
					
				}
				if(gcd==0)			//ó�� GCD�� ������ �ְ�
					gcd = D;
				else if(gcd>D)		//���� GCD���� ���� ���� GCD�� �� ������ �����ɷ� ���ƾ���
					gcd=D;

			
		}

		// GCD�� su�� �ִ� ������ �ִ������� ����

		for (int i = 2; i <= gcd; i++) { // GCD�� ��� ���ϴ� �κ�
			if (gcd % i == 0) {
				s += i + " ";
			}
		}

		bw.write(s); // s�ۼ�
		bw.flush(); // �������
		bw.close();

	}
}