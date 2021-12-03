package Baekjoon;
/*
 * 
n개의 도시
km
1km 당 1L
sum 출력할 내용 저장
처음 주유소에서 기름을 넣고 출발

도시의 개수 n
도로의 길이 km
주유소 리터당 가격 wan
	맨 마지막은 제외; 주유할 필요가 없으니까
 */
import java.util.Scanner;
public class Problem13305 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		long sum=0;								//최종 가격 오버플로우 방지	
		int n = scn.nextInt();					//n 도시 수
		int wan[] = new int[n];  				//wan 도시당 가격
		long km[] = new long[n-1];				//km 거리
		
		for(int i = 0;i<km.length;i++)
			km[i] = scn.nextInt();
		

		for(int i = 0;i<wan.length;i++)
			wan[i] = scn.nextInt();
		
		/*
		01 02 03 04 
		01 02 23 24
		01 12 13 14
		01 12 13 34
		01 12 23 34
		01 12 13 34
		0  1  2  3
		8
		2 3 5 6 9 4 3 
		7 5 7 3 1 4 7 4
		*/
//		14
//		15
//		25
//		18
//		9 
//		4
//		3
												//i는 wan[i] 주유소당 가격에 접근
		int i =0, k =0;							//k은 km[k] 거리를 순차적으로 접근하기 위함
		for(int j = 1; j<=km.length;j++) {		//j 숫자 증감
			sum+=(long)km[k]*wan[i];			//오버플로우 방지 강제 형변환
			
			if(wan[i] >= wan[j]) {	
			i=j;								//j가 더 작으니 i에 j 입력
			}
			
			k++;								//다음 km를 불러오기 위해 증가
			
		}
		System.out.println(sum);
	}
  
}
