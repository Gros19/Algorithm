//public class Main{
//    public static void main(String[]args){
        
//
//
//
//
//
//

//    }
//}

 /*
  * 입력
연, 월, 일이 ".(닷)"으로 구분되어 입력된다.


출력
입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)


입력 예시   
2013.8.5

출력 예시
2013.08.05
  * 
  * 
  */
package codeUp;

//

import java.util.Scanner;

//


public class basic1016 {


    public static void main(String[]args){
//
    	
    	
    	
    	Scanner s = new Scanner(System.in);

    	
     	String nmd = s.nextLine();
    	String [] aaa = nmd.split("\\.");
    	int [] a = new int[aaa.length];
    	
    	for(int i=0;i<aaa.length;i++) {
    		a[i] = Integer.parseInt(aaa[i]);
    	}
    	System.out.printf("%4d.%02d.%02d",a[0],a[1],a[2]);
    		
    	
//   	System.out.print(Arrays.toString(aaa));
    	
//    	String[] arr = new String[3];
    	
//    	
//    	
//    	arr = nmd.split(".");
//    	
//    	System.out.println(arr.length);
//    	//System.out.println(arr[arr.length -1]);
//    	System.out.println(arr[0]);
    	
    	
    	
    	;//Integer.parseInt(arr);
    	
//    	System.out.println(Integer.valueOf(arr[0]));
//    	System.out.println(Integer.valueOf(arr[1]));
//    	System.out.println(Integer.valueOf(arr[2]));
//    	System.out.println(arr);
    	
//    	int [] anser = new int[arr.length];
    	
    	
//    	anser[0] = Integer.valueOf(arr[0]);
//    	anser[1] = Integer.valueOf(arr[1]);
//    	anser[2] = Integer.valueOf(arr[2]);
    	
//    	System.out.printf("%4d.%02d.%02d",anser[0],anser[1],anser[2]);
    	
    	
    	
    

    	
    	
//    	


      
    }


}
