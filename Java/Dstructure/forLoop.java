import java.io.*;
import java.util.Scanner;

/*
Do it
자료구조와 함께 배우는 알고리즘 입문
------------------------------
loop
 */
public class forLoop {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(pyramid2());
        bw.flush();

        bw.close();

    }
    public static int fromSum(int a, int b){
        b++;
        int sum = 0;
        for(; a < b; a++ ){
            sum+=a;
        }
        return sum;
    }

    public static int gousSum(int n){
        return (n)*(n+1)/2;
        /*1 2 3 4 5
        *
        * 5 + 1 6
        * 2 + 4 6
        * 3
        * = 15
        * */
    }

    public static void sum() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int n = (br.read()&15)+1;
            int sum = 0;
            for(int i = 1; i < n; i++ ){
                sum+=i;
                if(i == n-1)
                    bw.write(i + " = "+ sum);
                else
                    bw.write(i + " + ");
            }

        }catch (IOException e){
            e.printStackTrace();

        }finally{
            bw.flush();
            br.close();
            bw.close();
        }
    }

    //Q12
    public static String eightyOne(){
    /*
                 | 1  2  3  4  5  6  7  8  9
                ----+---------------------------
                 1  | 1  2  3  4  5  6  7  8  9
                 2  | 2  4  6  8 10 12 14 16 18
                 3  | 3  6  9 12 15 18 21 24 27
                 4  | 4  8 12 16 20 24 28 32 36
                 5  | 5 10 15 20 25 30 35 40 45
                 6  | 6 12 18 24 30 36 42 48 54
                 7  | 7 14 21 28 35 42 49 56 63
                 8  | 8 16 24 32 40 48 56 64 72
                 9  | 9 18 27 36 45 54 63 72 81

    Process finished with exit code 0
    */


        StringBuilder s = new StringBuilder();
        for(int i = -1; i< 10; i++){
            int k = i;
            if(i== -1){
                k = 1;
            }
            for(int j = -1; j < 10; j++){
                if(i+j < -1){
                    s.append("   ");
                }else if(i * j == 0){
                    if(i+j == 0){
                        s.append("-+");
                    }
                    else if(j==0){
                        s.append(" |");
                    }else{
                        s.append("---");
                    }
                }else {
                    if(i*j < 0){
                        s.append(" ").append(k).append(" ");
                        k++;
                    }else{
                        s.append(String.format("%2s ", (k - 1) * j));
                    }
                }

            }
            s.append("\n");
        }
        return s.toString();

    }

    //Q13
    public static String eightyOnePlus(){
/*
                    | 1  2  3  4  5  6  7  8  9
                ----+---------------------------
                 1  | 2  3  4  5  6  7  8  9 10
                 2  | 3  4  5  6  7  8  9 10 11
                 3  | 4  5  6  7  8  9 10 11 12
                 4  | 5  6  7  8  9 10 11 12 13
                 5  | 6  7  8  9 10 11 12 13 14
                 6  | 7  8  9 10 11 12 13 14 15
                 7  | 8  9 10 11 12 13 14 15 16
                 8  | 9 10 11 12 13 14 15 16 17
                 9  |10 11 12 13 14 15 16 17 18

                 Process finished with exit code 0

*/
        StringBuilder s = new StringBuilder();
        for(int i = -1; i< 10; i++){
            int k = i;
            if(i== -1){
                k = 1;
            }
            for(int j = -1; j < 10; j++){
                if(i+j < -1){
                    s.append("   ");
                }else if(i * j == 0){
                    if(i+j == 0){
                        s.append("-+");
                    }
                    else if(j==0){
                        s.append(" |");
                    }else{
                        s.append("---");
                    }
                }else {
                    if(i*j < 0){
                        s.append(" ").append(k).append(" ");
                        k++;
                    }else{
                        s.append(String.format("%2s ", (k - 1) + j));
                    }
                }

            }
            s.append("\n");
        }
        return s.toString();

    }

    //Q14
    public static String rectangle(){
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scn.nextInt();
        for(int i = 0; i < n;i ++){
            sb.append(String.format("%"+n+"s","").replace(" ", "*"));
            sb.append("\n");
        }
        return sb.toString();
    }

    //Q15a
    public static String triangleA(){

        /*

        5
        *
        **
        ***
        ****
        *****

        Process finished with exit code 0
        */

        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scn.nextInt();
        int i = n;
        while(i-- > 0){
            sb.append(String.format("%"+(n-i)+"s","").replace(" ", "*"));
            sb.append("\n");
        }
        return sb.toString();
    }

    //Q15b
    public static String triangleB(){
        /*
        7
        *******
        ******
        *****
        ****
        ***
        **
        *

        Process finished with exit code 0

                    */
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int i = scn.nextInt();

        while(i > 0){
            sb.append(String.format("%"+(i)+"s","").replace(" ", "*"));
            i--;
            sb.append("\n");
        }
        return sb.toString();
    }

    //Q15c
    public static String triangleC(){
        /*
        6
        ******
         *****
          ****
           ***
            **
             *

        Process finished with exit code 0

        */
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scn.nextInt();
        int i = n;
        n = 0;
        while(i > 0){
            if(n!=0)
                sb.append(String.format("%"+n+"s",""));
            sb.append(String.format("%"+(i)+"s","").replace(" ", "*"));
            i--;
            n++;
            sb.append("\n");
        }
        return sb.toString();
    }

    //Q15d
    public static String triangleD(){
        /*
        8
               *
              **
             ***
            ****
           *****
          ******
         *******
        ********
        */
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scn.nextInt();
        int i = 1;
        while(n-- > 0){
            if(n!=0)
                sb.append(String.format("%"+n+"s",""));
            sb.append(String.format("%"+(i)+"s","").replace(" ", "*"));
            i++;
            sb.append("\n");
        }
        return sb.toString();
    }

    //Q16
    public static String pyramid(){
        /*

        4
           *
          ***
         *****
        *******

        Process finished with exit code 0
        */

        Scanner scn =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scn.nextInt();
        int star = 1;
        int space = n-1;

        while(n-- > 0){
            if(space!=0)
                sb.append(String.format("%"+space+"s", ""));
            sb.append(String.format("%"+star+"s\n", "").replace(" ", "*"));
            star+=2;
            space--;
//          or (star-1)*2+1

        }
        return sb.toString();
    }

    //Q17
    public static String pyramid2(){
        /*
6
     1
    222
   33333
  4444444
 555555555
66666666666

Process finished with exit code 0
        */

        Scanner scn =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scn.nextInt();
        int star = 1;
        int space = n-1;

        n++;
        for(int i = 1; i < n; i++){
            if(space!=0)
                sb.append(String.format("%"+space+"s", ""));
            sb.append(String.format("%"+star+"s\n", "").replace(" ", String.valueOf(i)));
            star+=2;
            space--;
//          or (star-1)*2+1

        }
        return sb.toString();
    }

}
