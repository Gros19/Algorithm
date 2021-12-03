package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hard3 {
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int first = scn.nextInt(); // 몇개 입력받을지
		int su[] = new int[first]; // 숫자들을 입력받기위한 배열 할당

		int tmp = 0; // 정렬을 위한 변수
		int B = 0, D = 0, Temp = 0, gcd = 0; // 호제법으로 최대공약수를 구할 때 쓸 변수
		String s = "";

		for (int i = 0; i < first; i++) //
		{
			su[i] = scn.nextInt(); // first만큼 숫자 입력받기
		}

		for (int i = 0; i < first; i++) // 숫자 오름차순 정렬
		{
			for (int j = i + 1; j < first; j++) {

				if (su[i] > su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp;
				}
			}
		}
		
		
		
		
		
		
		// 여러 수의 GDC최대공약수를 구해야 함
		// 선배가 알려준 방식으로 구현
		/*
		 * 
		 * 아래 반복문 예시
		 * 0 1 2 3 4 5
		 * 
		 * 1-0 
		 * 2-1 
		 * GCD 처음은 무조건 입력
		 * 3-2
		 * GCD?
		 * 4-3
		 * GCD?
		 * 4-5
		 * GCD?
		 * 
		 * GCD? 앞에 GCD와 비교해서 작은 값으로 바꿔치기
		 *최종적으로 가장 작은 GCD를 구해서 
		 *GCD의 약수를 출력 
		 */
		for (int i = 0; i < su.length - 1; i++) {
			D = su[i + 1] - su[i];
			
			for (int j = i + 1; j < su.length-2; j++) {
				B = su[j + 1] - su[j];
				i = j;
				
			}

				while (B % D != 0) { // 호제법 사용
					Temp = B % D;
					B = D;
					D = Temp;
					
				}
				if(gcd==0)			//처음 GCD는 무조건 넣고
					gcd = D;
				else if(gcd>D)		//전에 GCD보다 새로 나온 GCD가 더 작으면 작은걸로 갈아엎어
					gcd=D;

			
		}

		// GCD에 su에 있는 수들의 최대공약수가 남고

		for (int i = 2; i <= gcd; i++) { // GCD의 약수 구하는 부분
			if (gcd % i == 0) {
				s += i + " ";
			}
		}

		bw.write(s); // s작성
		bw.flush(); // 버퍼출력
		bw.close();

	}
}