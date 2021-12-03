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
 격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
막대를 놓는 방향(d:가로는 0, 세로는 1)과
막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,

격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.
  * 

첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
두 번째 줄에 놓을 수 있는 막대의 개수(n)
세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.

입력값의 정의역은 다음과 같다.

1 <= w, h <= 100
1 <= n <= 10
d = 0 or 1
1 <= x <= 100-h
1 <= y <= 100-w


출력
모든 막대를 놓은 격자판의 상태를 출력한다.
한다.
단, 각 숫자는 공백으로 구분하여 출력한다.


막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력
길이(l), 방향(d), 좌표(x, y)

입력 예시   
5 5
3
2 0 1 1
3 1 2 3
4 1 2 5

출력 예시
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
//  길이(l), 방향(d), 좌표(x, y)
//    		2 0 1 1
//    		3 1 2 3
//    		4 1 2 5
//    		1 1 5 4
    		
    		if(d==0) {//가로는 0
    			for(int a=0;a<l;a++) {
    				cool[x-1][y-1+a]=1;
    				
    			}
    		}
    			
    		else if(d==1) {// 세로는 1
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
	
