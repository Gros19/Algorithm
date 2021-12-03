package Baekjoon;

import java.util.Scanner;

public class root6 {

	/*
	 * x%2!=0 2부터 1증가시켜 3에서 +2씩 2로도 3으로도 5로도 7로도 11로도 13으로도 17로도 min부터 max까지 각각의
	 * 제곱으로 나눴을 떄 나머지가 0을 소수 하나 하나마다 카운트 단 소수제곱이 max보다 작거나 같을 때까지
	 * 
	 * 1의 제곱1 
	 * 2의 제곱4 
	 * 3의 제곱9 
	 * 5의 제곱25 
	 * 7의 제곱49 
	 * 11의 제곱121 
	 * 13의 제곱169 
	 * 17의 제곱289 
	 * 19의 제곱361
	 * 23의 제곱529 
	 * 29의 제곱841 
	 * 31의 제곱961 
	 * 33의 제곱1089 
	 * 37의 제곱1369 
	 * 39의 제곱1521 
	 * 41의 제곱1681
	 */
	
	// 소수를 구하는 반복문
	// 소수 2부터
	// 소수의 제곱의 배수들로 나누어 떨어지는 것 카운트
	// 소수제곱이 max보다 크면 반복 종료
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long min = scn.nextLong();
		long max = scn.nextLong();
		long count = max - (min - 1);
		long p = 2; // 1을 제외한 1과 자신만 약수로 갖는 수
		long root[] = new long[] {
				4, 9, 25, 49, 121, 169, 289, 361, 
				529, 841, 961, 1369, 1681, 1849, 2209, 
				2809, 3481, 3721, 4489, 5041, 5329, 6241, 
				6889, 7921, 9409, 10201, 10609, 11449, 11881, 
				12769, 16129, 17161, 18769, 19321, 22201, 22801, 
				24649, 26569, 27889, 29929, 32041, 32761, 36481, 
				37249, 38809, 39601, 44521, 49729, 51529, 52441, 
				54289, 57121, 58081, 63001, 66049, 69169, 72361, 
				73441, 76729, 78961, 80089, 85849, 94249, 96721, 
				97969, 100489, 109561, 113569, 120409, 121801, 124609, 
				128881, 134689, 139129, 143641, 146689, 151321, 157609, 
				160801, 167281, 175561, 177241, 185761, 187489, 192721, 
				196249, 201601, 208849, 212521, 214369, 218089, 229441, 
				237169, 241081, 249001, 253009, 259081, 271441, 273529, 
				292681, 299209, 310249, 316969, 323761, 326041, 332929, 
				344569, 351649, 358801, 361201, 368449, 375769, 380689, 
				383161, 398161, 410881, 413449, 418609, 426409, 434281, 
				436921, 452929, 458329, 466489, 477481, 491401, 502681, 
				516961, 528529, 537289, 546121, 552049, 564001, 573049, 
				579121, 591361, 597529, 619369, 635209, 654481, 657721, 
				674041, 677329, 683929, 687241, 703921, 727609, 734449, 
				737881, 744769, 769129, 776161, 779689, 786769, 822649, 
				829921, 844561, 863041, 877969, 885481, 896809, 908209, 
				935089, 942841, 954529, 966289, 982081, 994009};
	
		
		for(long x = min; x<= max; x++) {
		
			for (int i = 0; i <= root.length-1; i++) // p=3
			{
				if(x%root[i]==0) {
					count--;
					break;
				}
			}
	}
		System.out.println(count);
		//System.out.println(count);
		/*
		 * for (long s = min; s <= max; s++) {
							if (s % (p*p) == 0) { count--; }	//s가 소수로 나눠떨어지면 개수root3.java에서 1감
						}
		 * */
	}

}