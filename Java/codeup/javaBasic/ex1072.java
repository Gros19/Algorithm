
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
 * 
 * 
 첫 줄에 정수의 개수 n이 입력되고,
두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.


출력
n개의 정수를 한 개씩 줄을 바꿔 출력한다.


입력 예시   
5
1 2 3 4 5

출력 예시
1
2
3
4
5
 */

package CodeUp;

import java.util.Scanner;

public class ex1072 {
	
	
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		
		for(int i=1; i<=a;i++) {
			int b = s.nextInt();
			System.out.println(b);
		}
		
		
		


	}

}
