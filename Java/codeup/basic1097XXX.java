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
�ٵϾ��� ��� �ִ� ��Ȳ�� 19 * 19 ũ���� ���������� �Էµȴ�.
���� ������ Ƚ��(n)�� �Էµȴ�.
���� ������ ��ǥ�� Ƚ��(n) ��ŭ �Էµȴ�. ��, n�� 10������ �ڿ����̴�.


���
���� ������ ����� ����Ѵ�.


�Է� ����   
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
2
10 10
12 12

��� ����
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1097XXX {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int[][] x;
    	x =new int[19][19];
    	for (int i=0; i<x.length;i++)
    	{
    		for(int j=0;j<x.length;j++)
    			x[i][j]= scn.nextInt(); 
    	}
    	int rev=0;
    	int n = scn.nextInt();
    	for(int a = 0;a<n;a++)
    	{
    		int X = scn.nextInt();
    		int Y = scn.nextInt();
    		
    		for(int i=0;i<x.length;i++)
    		{	
    			x[X-1][i] = rev;
    			x[i][Y-1] = rev;
    		}
    		
    		if (rev==0)
    			rev=1;
    		else
    			rev=0;
    	}
    	
    	
    	for(int i=0;i<x.length;i++) {
    		for(int j=0;j<x.length;j++) {
    			str +=x[i][j]+" ";
    		}
    		str +="\n";

    		
    		
    	}
    	
    		
    		
    	
    	
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
