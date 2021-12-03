
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
10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.


출력
성실한 개미가 이동한 경로를 9로 표시해 출력한다.


입력 예시   
1 1 1 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1
1 0 0 1 1 1 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 1 0 1 0 1
1 0 0 0 0 1 2 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1

출력 예시
1 1 1 1 1 1 1 1 1 1
1 9 9 1 0 0 0 0 0 1
1 0 9 1 1 1 0 0 0 1
1 0 9 9 9 9 9 1 0 1
1 0 0 0 0 0 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1
 */

package CodeUp;

import java.util.Scanner;

public class ex1099 {
	
	public static void main(String[]args){
		
		Scanner scn = new Scanner(System.in);
		int [][] arr= new int [10][10];
		
		for (int a1 = 0; a1<10;a1++) {
			for(int a2 = 0; a2<arr.length;a2++ ) {
				arr[a1][a2] = scn.nextInt();
			}
			
		}
		
		
		 //sdfsdfasd
		//asdfsadf
		
		
		
		for (int a1 = 0; a1<10;a1++) {
			for(int a2 = 0; a2<arr.length;a2++ ) {
				System.out.print(arr[a1][a2]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
	
		}
		
}
		



