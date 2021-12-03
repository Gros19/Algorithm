package codeUp;

//
import java.util.*;
//


public class basic1014 {


    public static void main(String[]args){

    	Scanner s = new Scanner(System.in);
//    	방법1
//    	단점 두자리 정수는 호환 안됨
//    	char[] rb = new char[2];
//    	String j;
//   	
//    	j = s.nextLine();//1 2 공백 기준으로 입력받기
//    	rb[0] = j.charAt(0);
//    	rb[1] = j.charAt(2);
//    	System.out.println(rb[0]+" "+rb[1]);
    	
    	int a, b;
    	String st = s.nextLine();
    	String sarr [] = st.split(" ");
    	a = Integer.valueOf(sarr[0]);
    	b = Integer.valueOf(sarr[1]);
    	System.out.println(a+" "+b);
    

    	
    	
    	


      
    }


}
