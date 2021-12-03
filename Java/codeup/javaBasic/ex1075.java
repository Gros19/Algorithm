
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
영문자 1개가 입력된다.
(a ~ z)


출력
a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.


입력 예시   
f
//f 111
//a 97
 *
 *
출력 예시
a b c d e f
 */

package CodeUp;

import java.util.Scanner;

public class ex1075 {
	
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		char c = scn.nextLine().charAt(0);
		int a = 97;
		int v = (int)c-97;
		for(int b =0;b<=v; b++) {
			System.out.printf("%c\n",a);
			a++;
		}
		
	
		}
		
		
		


	}


