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
h, b, c, s �� ������ �ΰ� �Էµȴ�.
h�� 48,000����, b�� 32����(��, 8�ǹ��), c�� 5����, s�� 6,000������ �ڿ����̴�.

 

���
�ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�.
��, �Ҽ��� ��° �ڸ����� �ݿø��� ù° �ڸ����� ����ϰ� MB�� ������ �ΰ� ����Ѵ�.

�Է� ����   
44100 16 2 10

��� ����
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
