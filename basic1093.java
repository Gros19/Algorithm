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
���� �� ���ÿ� ������ �ο� 3���� ��Ģ������ �湮�ϴ�,
�湮 �ֱⰡ ������ �ΰ� �Էµȴ�. (��, �Է°��� 100������ �ڿ����̴�.)


���
3���� �ٽ� ��� �Բ� �湮�� ������ Ǯ��� ��(���� ����/��� �� ��ĥ ��?)�� ����Ѵ�.


�Է� ����   
3 7 9

��� ����
63
  */
package codeUp;

//
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//


public class basic1093 {


    public static void main(String[]args) throws IOException{
//
    	BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner scn = new Scanner(System.in);
    	
    	String str = "";
    	
    	int sum = 0;
    	int q = scn.nextInt();
    	int w = scn.nextInt();
    	int e = scn.nextInt();
    	
    	
    	for(int i=1;i<=q*w*e;i++) {
    		
    			if(i%q==0&&i%w==0&&i%e==0) {
    				sum=i;
    				break;
    			}
    		
    		
    	}
    	str +=sum+" ";
    	bf.write(str);
    	bf.flush();
//    	 
    }


}
