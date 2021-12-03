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
정수 2개가 공백을 두고 입력된다.


출력
첫 줄에 합
둘째 줄에 차,
셋째 줄에 곱,
넷째 줄에 몫,
다섯째 줄에 나머지,
여섯째 줄에 나눈 값을 순서대로 출력한다.
(실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)


입력 예시   
10 3

출력 예시
13
7
30
3
1
3.33

  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1045 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    
    	String str = s.nextLine();
    	String arr[] = str.split(" ");
    	int a = Integer.parseInt(arr[0]);
    	int b = Integer.parseInt(arr[1]);
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    	System.out.printf("%.2f",(float)a/b);
    	
    		
    	



    	
    	
//    	 
    }


}
