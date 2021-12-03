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
16진수로 한 자리 수가 입력된다.
단, A ~ F 까지만 입력된다.


출력
입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다.
계산 결과도 16진수로 출력해야 한다.


입력 예시   
B

출력 예시
B*1=B
B*2=16
B*3=21
B*4=2C
B*5=37
B*6=42
B*7=4D
B*8=58
B*9=63
B*A=6E
B*B=79
B*C=84
B*D=8F
B*E=9A
B*F=A5
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1082 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner scn = new Scanner(System.in);
    	char c = scn.next().charAt(0);
    	int dan=0;
    	
    	switch(c)
    	{
    	case 'A':dan =10;
    	break;
    	case 'B':dan =11;
    	break;
    	case 'C':dan =12;
    	break;
    	case 'D':dan =13;
    	break;
    	case 'E':dan =14;
    	break;
    	case 'F':dan =15;
    	break;
    	default:System.out.println("뭘 입력한거야");
    	
    	}

    	for(int i=1; i<=15;i++)
    	{	
    		System.out.printf("%c*%X=%X\n",c,i,dan*i);
    		
    	}
    	
    	



    	
    	
//    	 
    }


}
