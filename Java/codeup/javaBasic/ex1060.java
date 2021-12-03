
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
2개의 정수가 공백을 두고 입력된다.
-2147483648 ~ +2147483647


출력
두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.


입력 예시   
3 5

출력 예시
1
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1060 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int b = Integer.parseInt(sarr[0]);
		int a = Integer.parseInt(sarr[1]);
		
		System.out.println(a & b);
		
	}
	
	
	

}
