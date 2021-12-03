/*
 * 첫째 줄에 식이 주어진다.
 *  식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고,
 *   가장 처음과 마지막 문자는 숫자이다. 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고,
 *    5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다. 
 *    입력으로 주어지는 식의 길이는 50보다 작거나 같다.

출력
첫째 줄에 정답을 출력한다.

예제 입력 1 
55-50+40

예제 출력 1 
-35
 */



package Baekjoon;
import java.util.Scanner;
public class problem1541 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		String s = scn.nextLine();
		
		String st[] = s.split("[-]");
		//st[55, 50+40+50, 30+20]
		
		int sum =0;
		
		String mi[] = new String[40];
		//-묶음 저장
		String plus [] = st[0].split("[+]");
		//+묶음 저장
		//st에서 -가 나오기 전까지인 st[0]을 +로 한 번 더 스트립
		
		
		for(int a=0; a<plus.length;a++)
			sum+=Integer.parseInt(plus[a]);
		//sum에 더해야 할 수를 더함
		
//		st[50+40+50, 30+20]		
		for(int p=1;p<st.length;p++)
		{
			 mi=st[p].split("[+]");
			 for(int e=0; e<mi.length;e++)
			 {
				  sum-=Integer.parseInt(mi[e]);
				  
			 }
		}
		
		System.out.println(sum);
		
	}

}
