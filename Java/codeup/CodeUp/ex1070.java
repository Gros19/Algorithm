
//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        
//					
//        
//    }
//}
//



/*
 * 
 * 
 * 
 12, 1, 2 : winter
  3, 4, 5 : spring
  6, 7, 8 : summer
  9, 10, 11 : fall
 */


package CodeUp;

import java.util.Scanner;

public class ex1070 {
	public static void main(String[]args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		
		
		switch(c) 
		{
		case 3:
		case 4:
		case 5: System.out.println("spring");
		break;
		
		case 6:
		case 7:
		case 8:System.out.println("summer");
		break;
		
		case 9:
		case 10:
		case 11:System.out.println("fall");
		break;
		
		
		default:System.out.println("winter");
		break;
		}
		
		
		
	}
	
	
	

}
