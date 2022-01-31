public class Median {
    public static int med3(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }// b > a
        else if(a > c){
            return a;
        }// a <= c
        else if (b > c) {
            return c;
        }else{
            return b;
        }
    }
}
