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
�������� ���� ����� ��, ���� 1���� �Է¹޴´�.
��, �ԷµǴ� �ڿ����� 100,000,000�����̴�.


���
1, 2, 3, 4, 5 ... ������� ��� ���ذ��ٰ�, �� ���� �Էµ� �������� Ŀ���ų� �������� ���,
�׶������� ���� ����Ѵ�.


�Է� ����   
57

��� ����
66
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


//


public class basic1087 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	int sum=0;
    	
    	int Max = scn.nextInt();
    	
    	for(int n=1;sum<Max;n++) {
    		
    		sum+=n;
    	}
    	str +=sum+"\n";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
