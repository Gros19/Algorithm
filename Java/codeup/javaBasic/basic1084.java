//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[]args){

//
//
//
//
//
//

//    }
//}

/*
������(r, g, b) �� ���� ���࿡ ���� ������(0 ~ 128))�� ������ ���̿� �ΰ� �Էµȴ�.
���� ���, 3 3 3 �� �� ���� ���� ���ؼ� �� ���࿡ ���� 0~2���� 3������ ���� ������ �ǹ��Ѵ�.


���
���� �� �ִ� rgb ���� ������ ��������(����� �ö󰡴� ��, 12345... abcde..., �����ٶ�...)����
���� �ٲ� ��� ����ϰ�, �������� �� ������ ����Ѵ�.


�Է� ����   
2 2 2

��� ����
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
8
 */
package codeUp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class basic1084 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int g = scn.nextInt();
		int b = scn.nextInt();
		int i = 0, j = 0, k = 0, c;
		for (c = 0; c < r * g * b; c++) {
			String str = "";
			str += k + " " + j + " " + i + "\n";
			i++;
			if (i == b) {
				i = 0;
				j++;}
			

			if (j == g) {
				j = 0;
				k++;
			}
			bf.write(str);
			
		}
		bf.flush();
		System.out.println(c);
	}
}
