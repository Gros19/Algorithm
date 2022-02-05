/*
Do it
자료구조와 함께 배우는 알고리즘 입문
------------------------------
3 요소 중앙값
 */
public class Median {
    public static void main(String[] args){
        System.out.println(med3(1, 1, 4));
    }
    public static int med3(int a, int b, int c){
        if(a >= b){
            //a >= b
            //b >= c
            if(b >= c){
                // a >= b >= c
                return b;
            }
            //a >= b
            //c > b
            else if(a <= c){
                // c >= a >= b
                return a;
            }
            // a >= b
            // c > b
            // a > c
            else{
                // a > c > b
                return c;
            }
        }
        // b > a
        // a > c
        else if(a > c){
            //b > a > c
            return a;
        }
        // b > a
        // a <= c
        // b > c
        else if (b > c) {
            // b > c >= a
            return c;
        }
        // b > a
        // a <= c
        // b <= c
        else{
            // c >= b > a
            return b;
        }
    }
}
