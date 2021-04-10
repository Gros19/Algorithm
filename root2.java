package Baekjoon;
import java.util.Scanner;
public class root2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long min = scn.nextLong();
		long max = scn.nextLong();
		int c=0;
		long i=1,root=3;
		int r ;
	/*	
		0 1
		1 3
		4 5 y
		9 7 y
		169 y 
		범위 설정 수정필요
	*/	
		while(i<=max) {
			r = 0;
			System.out.print(i+"의 약수: ");
				for(int j=1;j<=i; j++ ) {
					if(i%j==0) {
					System.out.print(j+" ");
					r++;
					}
					
					
				}
			System.out.print("\t root? " + r);
		System.out.println();
			i+=root;
			root+=2;
			
			
				
		}
		
		


	}

}