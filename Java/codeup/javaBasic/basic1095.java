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
��ȣ�� �θ� Ƚ��(n, 1 ~ 10000)�� ù �ٿ� �Էµȴ�.
n���� ���� ��ȣ(k, 1 ~ 23)�� �� ��° �ٿ� ������ ���̿� �ΰ� ������� �Էµȴ�.


���
�⼮�� �θ� ��ȣ �߿� ���� ���� ��ȣ�� 1���� ����Ѵ�.


�Է� ����   
20
10 4 2 3 6 6 7 9 8 5 1 4 2 3 6 0 7 9 8 5

��� ����
2
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1095 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int n= scn.nextInt();
    	int []c = new int[n];
    	
    	
    	
    	for(int i=0;i<n;i++) {

    		int r = scn.nextInt();
    		
    		if(i==0||c[0]>r)
    		{
    			c[0] = r;
    		}
    	}
    	
    		
    		str +=c[0]+" ";
    	
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
