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
정수 3개가 공백을 두고 입력된다.
단, -2147483648 ~ +2147483647


출력
합과 평균을 줄을 바꿔 출력한다.
평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.


입력 예시   
1 2 3

출력 예시
6
2.0

  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1046 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    
    	String str = s.nextLine();
    	String arr[] = str.split(" ");
    	int a = Integer.parseInt(arr[0]);
    	int b = Integer.parseInt(arr[1]);
    	int c = Integer.parseInt(arr[2]);
    	System.out.println(a+b+c);
    	System.out.printf("%.1f",((float)a+b+c)/arr.length);
    	
    		
    	



    	
    	
//    	 
    }


}
