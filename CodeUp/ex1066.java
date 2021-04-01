
//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        
//					
//        
//    }
//}
//



/*
 * 

세 정수 a, b, c 가 공백을 두고 입력된다.
0 <= a, b, c <= +2147483647


출력
입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.


입력 예시   
1 2 8

출력 예시
odd
even
even
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1066 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		int b = Integer.parseInt(sarr[1]);
		int c = Integer.parseInt(sarr[2]);
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(b%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(c%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
	}
	
	
	

}
