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
w, h, b �� ������ �ΰ� �Էµȴ�.
��, w, h�� ��� �����̰� 1~1024 �̴�. b�� 40������ 4�� ����̴�.


���
�ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�.
�Ҽ��� ���� ��° �ڸ����� �ݿø��� ��° �ڸ����� ����� �� MB�� ����Ѵ�.


�Է� ����   
1024 768 24

��� ����
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
