package Dstructure;

public class min3 {
    public static void main(String[] args){
        System.out.println(min3(3, 5, 6));
        System.out.println(min3(3, 6, 6));
        System.out.println(min3(3, 5, 3));
        System.out.println(min3(3, 5, 1));
        System.out.println(min3(1, 1, 6));
    }

    /*Warning:(10, 16) Method name 'min3' is the same as its class name
    * 책 예제 이름을 그대로 차용*/
    static int min3(int a, int b, int c){

        /*Warning:(14, 13) Can be replaced with 'Math.min' call
        * 알고리즘 공부이기 때문에 직접 구현*/
        if(a >= c){
        // a >=c
            if(c >= b){
                // a >= c >= b
                return b;
            }
            else{
                // a >= c
                // b > c
                return c;
            }
        }
        // a < c
        else{
            if(b > a){
                // c > a
                // b > a
                return a;
            }else{
                // a < c
                // b <= a
                return b;
            }

        }
    }
}
