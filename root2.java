package Baekjoon;
import java.util.Scanner;
public class root2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long min = scn.nextLong();
		long max = scn.nextLong();
		int c=0;
		long i=1,root=0;
	/*	
		0 1
		1 3
		4 5 y
		9 7 y
		169 y 
	*/	
		while(i<=max) {
			
			System.out.print(i+"ÀÇ ¾à¼ö: ");
			for(int j=1;j<=i; j++ ) {
				if(i%j==0)
				System.out.print(j+" ");
			}
		System.out.println();
			i++;
			
				
		}
		
		


	}

}