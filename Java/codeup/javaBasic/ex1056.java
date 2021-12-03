
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
1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.


출력
참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.


입력 예시   
1 1

출력 예시
0
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1056 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		String strr[] = str.split(" ");
		int a = Integer.parseInt(strr[0]);
		int b = Integer.parseInt(strr[1]);
		
		
		
		
		if(a != b)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	

}
