
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

public class ex1059bin {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();//정수 입력
		int k;
		int aa = a; //정수 저장
		
		int z = 0;	//비트로 변환시 크기 계산
		while(aa >= 2) {
			aa = aa/2;
			z++;
			
			
		}
		
		int arr[] = new int[z+1];	//01234 0부터니까  z+1

		
		for(int i=z; i>=0; i--) {	//마지막 자리부터 입력해서 z부터 1씩 뺌
			arr[i] = a%2;			//2로 나눈 나머지를 arr[i]에 저장
			a = a/2;				//a를 2로 나눈 몫을 a에 저장

			
		}
		
		for(int j = 0; j<=z; j++) {	//배열 정출력
//			if (arr[j]==1)
//				arr[j] = 0;
//			else
//				arr[j] = 1;
			k = arr[j];
			System.out.print(arr[j]);
			
		}
		
	}
	
	
	

}
