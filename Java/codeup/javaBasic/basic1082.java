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
16������ �� �ڸ� ���� �Էµȴ�.
��, A ~ F ������ �Էµȴ�.


���
�Էµ� 16������ 1~F���� ������� ����, 16���� �������� ���� �ٲ� ����Ѵ�.
��� ����� 16������ ����ؾ� �Ѵ�.


�Է� ����   
B

��� ����
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
    	default:System.out.println("�� �Է��Ѱž�");
    	
    	}

    	for(int i=1; i<=15;i++)
    	{	
    		System.out.printf("%c*%X=%X\n",c,i,dan*i);
    		
    	}
    	
    	



    	
    	
//    	 
    }


}
