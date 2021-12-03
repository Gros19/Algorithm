
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

 *세 정수 a, b, c 가 공백을 두고 입력된다.
0 ~ +2147483647 범위의 정수들이 입력되며 적어도 1개는 짝수이다.


출력
짝수만 순서대로 줄을 바꿔 출력한다.


입력 예시   
1 2 4

출력 예시
2
4
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1065 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		int b = Integer.parseInt(sarr[1]);
		int c = Integer.parseInt(sarr[2]);
		
		if(a%2==0)
			System.out.println(a);
		if(b%2==0)
			System.out.println(b);
		if(c%2==0)
			System.out.println(c);
		
	}
	
	
	

}
