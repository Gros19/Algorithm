package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Hard {
	public static void main(String[]args) throws IOException {
		Scanner scn = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int first = scn.nextInt();
		int su[] = new int[first];
		int tmp=0;
		int na =2;
		int cp;
		String s ="";
		
		for(int i = 0; i<first; i++) 
		{
			su[i] = scn.nextInt();
		}
		
		for(int i = 0;i<first;i++) {
			for(int j = i+1; j<first;j++) {
				
				if(su[i]>su[j]) {
					tmp=su[j];
					su[j]=su[i];
					su[i]=tmp;
				}
			}
		}
		
		
		while(su[1]%na!=su[1]) {
			cp=su[0]%na;
			for(int i = 1; i<first; i++) 
			{
				if(cp!=su[i]%na) {
					break;
				}
				else if(i==first-1) {
					s += na +" ";
					
				}
			}
			na++;
		}		
		bw.write(s);
		bw.flush();
		bw.close();
		
		
	}

}