
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
 두 정수 a, b가 공백을 두고 입력된다.
-2147483647 <= a, b <= +2147483648


출력
a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.


입력 예시   
0 1

출력 예시
1
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1052 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		int a, b;
		
		String str = s.nextLine();
		String[] sarr = str.split(" ");
		a = Integer.parseInt(sarr[0]);
		b = Integer.parseInt(sarr[1]);
		
		if(a!=b)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	
	
	

}
