//import java.util.Scanner;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//public class Main{
//    public static void main(String[]args) throws IOException{
        
//
//
//
//
//
//

//    }
//}

 /*
���� 1���� �Է¹޴´�.
(1 ~ 100)


���
1���� �Է��� �������� �۰ų� ���� ������ 1�� �������� ����ϵ�
3�� ����� ������� �ʴ´�.


�Է� ����   
10

��� ����
1 2 4 5 7 8 10
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1089 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int i = scn.nextInt();
    	
    	for(int n=1;n<=i;n++) {
    		if(n%3!=0) {
    			str +=n+" ";
    		}
    		
    	}
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
