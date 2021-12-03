
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
두 정수가 공백을 두고 입력된다.
-2147483648 ~ +2147483647


출력
두 정수 중 큰 값을 10진수로 출력한다.


입력 예시   
123 456

출력 예시
456
 * 
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1064 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		int b = Integer.parseInt(sarr[1]);
		int c = Integer.parseInt(sarr[2]);
//		System.out.printf("%d %d %d\n",a, b, c);
		if(a>b)
			if(b>c)
				System.out.println(c);
			else
				System.out.println(b);
		else if(a<c)
				System.out.println(a);
				
			else 
				System.out.println(c);
		
		
		
		
	}
	
	
	

}
