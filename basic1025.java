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
  * 
  * �Է�
�ټ� �ڸ��� �̷���� 1���� ������ �Է¹޴´�.
(��, 10,000 <= �Է¹޴� �� <= 99,999 )


���
�� �ڸ��� ���ڸ� �и��� �� �ٿ� �ϳ��� [ ]�ӿ� �־� ����Ѵ�.


�Է� ����   
75254

��� ����
[70000]
[5000]
[200]
[50]
[4]
  * 
  */
package codeUp;

//

import java.util.Scanner;


//


public class basic1025 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);
    	String word = s.nextLine();
    	char [] sarr = new char[word.length()];
    	
    	for (int i = 0; i<word.length();i++) {
    		sarr[i] = word.charAt(i);
    		System.out.print("["+sarr[i]);
    		for (int a = (sarr.length-1-i); a>0; a--)
    			System.out.print("0");
    		System.out.println("]");
    		
    	}
    
    	



    	
    	
//    	 
    }


}
