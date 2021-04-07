package Baekjoon;
import java.util.Scanner;
public class root {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for(int i=1; i<101; i++) {
			System.out.print(i+"ÀÇ Á¦°ö: "+i*i+"\t");
			System.out.println(((i+1)*(i+1))-i*i);
		}
		int min = scn.nextInt();
		int max = scn.nextInt();
		
		

	}

}
