
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
-2147483648 ~ +2147483647, 단 0은 입력되지 않는다.


출력
입력된 정수에 대해
첫 줄에 minus 나 plus 를 출력하고,
두 번째 줄에 odd 나 even 을 출력한다.


입력 예시   
-2147483648

출력 예시
minus
even
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1067 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		if(a>0)
			System.out.println("plus");
		else
			System.out.println("minus");
		
	}
	
	
	

}
