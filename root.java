package Baekjoon;
import java.util.Scanner;
public class root {

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
		while(root+i<=max) {
			
			root+=i;
			
			if(min<=root) {
				++c;
				//System.out.println(root);
				}
			i+=2;
			
				
		}
		System.out.println(((max-(min-1))-c));
		


	}

}