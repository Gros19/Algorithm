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
빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.


출력
만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.


입력 예시   
2 2 2

출력 예시
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
