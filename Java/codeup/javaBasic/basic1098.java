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
  * 
  * 
  * 
 �������� ����(h), ����(w), ������ ����(n), �� ������ ����(l),
���븦 ���� ����(d:���δ� 0, ���δ� 1)��
���븦 ���� ������ ���� ���� �Ǵ� ������ ��ġ(x, y)�� �־��� ��,

�������� ä�� ������ ����� ����ϴ� ���α׷��� ������.
  * 

ù �ٿ� �������� ����(h), ����(w) �� ������ �ΰ� �Էµǰ�,
�� ��° �ٿ� ���� �� �ִ� ������ ����(n)
�� ��° �ٺ��� �� ������ ����(l), ����(d), ��ǥ(x, y)�� �Էµȴ�.

�Է°��� ���ǿ��� ������ ����.

1 <= w, h <= 100
1 <= n <= 10
d = 0 or 1
1 <= x <= 100-h
1 <= y <= 100-w


���
��� ���븦 ���� �������� ���¸� ����Ѵ�.
�Ѵ�.
��, �� ���ڴ� �������� �����Ͽ� ����Ѵ�.


���뿡 ���� ������ ��� 1, �ƴ� ��� 0���� ���
����(l), ����(d), ��ǥ(x, y)

�Է� ����   
5 5
3
2 0 1 1
3 1 2 3
4 1 2 5

��� ����
1 1 0 0 0
0 0 1 0 1
0 0 1 0 1
0 0 1 0 1
0 0 0 0 1

(1,1) (1,2) (1,3) (1,4) (1,5)
(2,1) (2,2) (2,3) (2,4) (2,5)
(3,1) (3,2) (3,3) (3,4) (3,5)
(4,1) (4,2) (4,3) (4,4) (4,5)
(5,1) (5,2) (5,3) (5,4) (5,5)
  */
package codeUp;

//

import java.util.Scanner;

//


public class basic1098 {


    public static void main(String[]args){
//
//    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	
    	String s = scn.nextLine();
    	int w = Integer.parseInt(s.split(" ")[0]);
    	int h = Integer.parseInt(s.split(" ")[1]);
    	int [][] cool = new int[w][h];
//    	System.out.println();
    	
    	
    	for(int ww=0;ww<w;ww++) { 
    		for(int hh=0;hh<h;hh++) { 
    			cool[ww][hh] = 0;
    		}
    	}
    	
    	
    	s = scn.nextLine();
    	int n = Integer.parseInt(s.split(" ")[0]);
    	
    	for (int nn=0;nn<n;nn++)
    		{
    		s = scn.nextLine();
    		
    		int l = Integer.parseInt(s.split(" ")[0]);
    		int d = Integer.parseInt(s.split(" ")[1]);
    		int x = Integer.parseInt(s.split(" ")[2]);
    		int y = Integer.parseInt(s.split(" ")[3]);
    		
//    		5 5
//    		4
//  ����(l), ����(d), ��ǥ(x, y)
//    		2 0 1 1
//    		3 1 2 3
//    		4 1 2 5
//    		1 1 5 4
    		
    		if(d==0) {//���δ� 0
    			for(int a=0;a<l;a++) {
    				cool[x-1][y-1+a]=1;
    				
    			}
    		}
    			
    		else if(d==1) {// ���δ� 1
    			for(int a=0;a<l;a++) {
    				cool[x-1+a][y-1]=1;
    				
    			}
    		}
   
    	
    }
    	for(int ww=0;ww<w;ww++) {
    		for(int hh=0;hh<h;hh++) {
    			System.out.print(cool[ww][hh]+" ");
    		}
    	System.out.println();
    	}
    }
    }
	
