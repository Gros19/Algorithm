//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[]args){
        
//
//
//
//
//
//

//    }
//}

 /*
h, b, c, s 가 공백을 두고 입력된다.
h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

 

출력
필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

입력 예시   
44100 16 2 10

출력 예시
1.7 MB
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1085 {


    public static void main(String[]args){
///
    	
    	
    	
    	Scanner scn = new Scanner(System.in);
    	int h = scn.nextInt();
    	int b = scn.nextInt();
    	int c = scn.nextInt();
    	int s = scn.nextInt();
    	long calB;
    	
    	calB=(h*b/8)*c*s;
    	System.out.printf("%.1f MB",(float)calB/1048576);

    	
    	
//    	 
    }


}
