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
ù ��° �ٿ� �⼮ ��ȣ�� �θ� Ƚ���� ���� n�� �Էµȴ�. (1 ~ 10000)
�� ��° �ٿ��� �������� �θ� n���� ��ȣ(1 ~ 23)�� ������ �ΰ� ������� �Էµȴ�.


���
1������ ��ȣ�� �Ҹ� Ƚ���� ������� �������� �����Ͽ� �� �ٷ� ����Ѵ�.


�Է� ����   
10
1 3 2 2 5 6 7 4 5 9

��� ����
1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

//


public class basic1092 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	//int r = 0;
    	int []c ;
    	c = new int[23];
    	
    	int n= scn.nextInt();
    	
    	
    	
    	
    	for(int i=0;i<n;i++) {

    		int r =scn.nextInt();
    		c[r-1] += 1;

    		//r=(int)(Math.random()*n);
    		
    	}
    	for(int i=0;i<c.length;i++) {
    		str +=c[i]+" ";
    	}
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
