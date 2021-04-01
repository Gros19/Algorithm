
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
평가 기준
점수 범위 : 평가
 90 ~ 100 : A
 70 ~   89 : B
 40 ~   69 : C
   0 ~   39 : D
로 평가되어야 한다.

정수(0 ~ 100) 1개가 입력된다.


출력
평가 결과를 출력한다.


입력 예시   
73

출력 예시
B
 * 
 */


package CodeUp;

import java.util.Scanner;

public class ex1068 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sarr[] = str.split(" ");
		int a = Integer.parseInt(sarr[0]);
		
		if (a>=90)
			System.out.println("A");
		else if (a>=70)
			System.out.println("B");
		else if (a>=40)
			System.out.println("C");
		else 
			System.out.println("D");
		
	}
	
	
	

}
