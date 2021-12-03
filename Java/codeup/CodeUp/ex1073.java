
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
 정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 개수는 알 수 없다.


출력
입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
(0은 출력하지 않는다.)


입력 예시   
7 4 2 3 0 1 5 6 9 10 8

출력 예시
7
4
2
3
 */

package CodeUp;

import java.util.Scanner;

public class ex1073 {
	
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		while(n!=0) {
			System.out.println(n);
			n = scn.nextInt();
		}
		
		
		}
		
		
		


	}


