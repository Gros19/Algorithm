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


public class basic1097 {


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
    	
    	int n = scn.nextInt();
    	int arr[] = new int [n*2]; 
    	
    	
    	
    	for (int a = 0; a<arr.length;a++)
    		arr[a]=scn.nextInt();
    	
    	for (int w = 0; w<arr.length;w+=2)
    	{
    		for(int i=0;i<x.length;i++)
    		{	if(x[arr[w]-1][i]==0)
    				x[arr[w]-1][i] = 1;
    			else 
    				x[arr[w]-1][i] = 0;
    		}
    		
    	}
    
    	for (int w = 1; w<arr.length;w+=2)
    	{
    		for(int i=0;i<x.length;i++)
    		{	
    			if(x[i][arr[w]-1]==0)
    				x[i][arr[w]-1] = 1;
    			else
    				x[i][arr[w]-1] = 0;
    		}
    		
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
