import java.util.Scanner;
/*
예제 입력 1
472
100
예제 출력 1
2360
3776
1416
181720
 */

public class Step1_2588 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int up = scn.nextInt();
        String[] down = scn.next().split("",3);

        int one = up*Integer.parseInt(down[0]);
        int two = up*Integer.parseInt(down[1]);
        int thr = up*Integer.parseInt(down[2]);

        sb.append(thr+"\n");
        sb.append(two+"\n");
        sb.append(one+"\n");
        sb.append(one*100+two*10+thr);
        System.out.println(sb);
        sb = null;
    }
}
