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
�Է�
���� ��(a), ����� ��(r), �� ��° ������ ��Ÿ���� ����(n)��
������ �ΰ� �Էµȴ�.(��� 0 ~ 10)


���
n��° ���� ����Ѵ�.


�Է� ����   
2 3 7

��� ����
1458
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1088 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int start = scn.nextInt();
    	int r = scn.nextInt();
    	int n = scn.nextInt();
    	long sum=start;
    	
    	for(int i=2;i<=n;i++) {
    		sum*=r;
    	}
    	str +=sum+"\n";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
