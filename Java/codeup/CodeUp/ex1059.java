
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
정수 1개가 입력된다.
-2147483648 ~ +2147483647


출력
비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.


입력 예시   
2

출력 예시
-3
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1059 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		
		System.out.println(~i);
		
	}
	
	
	

}
