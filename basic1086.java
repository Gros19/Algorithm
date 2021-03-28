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
w, h, b 가 공백을 두고 입력된다.
단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.


출력
필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.


입력 예시   
1024 768 24

출력 예시
2.25 MB
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1086 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner scn = new Scanner(System.in);
    	int w = scn.nextInt();
    	int h = scn.nextInt();
    	int b = scn.nextInt();
    	int calB;
    	
    	calB=(w*b*h)/8;
    	System.out.printf("%.2f MB",(float)calB/1048576);

    	
    	
//    	 
    }


}
