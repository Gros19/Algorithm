
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
정수 1개가 입력된다.
(1 ~ 100)

출력
1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다.


입력 예시   
5

출력 예시
4
3
2
1
0
 */

package CodeUp;

import java.util.Scanner;

public class ex1074 {
	
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		while(n>0) {
			System.out.println(n-1);
			n--;
		}
		
		
		}
		
		
		


	}


