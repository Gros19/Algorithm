public class min4 {
    public static void main(String[] args){
        System.out.println(min4(3, 5, 6, 2));
        System.out.println(min4(3, 6, 6, 4));
        System.out.println(min4(3, 5, 3, 7));
        System.out.println(min4(3, 5, 1,3));
        System.out.println(min4(1, 1, 6,7));
    }

    /*Warning:(10, 16) Method name 'min3' is the same as its class name
    * 책 예제 이름을 그대로 차용*/
    static int min4(int a, int b, int c, int d){

        /*Warning:(14, 13) Can be replaced with 'Math.min' call
        * 알고리즘 공부이기 때문에 직접 구현*/
        if(a >= c){
        // a >=c
            if(c >= b){
                // a >= c >= b

                if(d >= b)
                    return b;
                else
                    return d;
            }
            else{
                // a >= c
                // b > c

                if(d >= c)
                    return c;
                else
                    return d;
            }
        }
        // a < c
        else{
            if(b > a){
                // c > a
                // b > a
                if(d >= a)
                    return a;
                else
                    return d;
            }else{
                // a < c
                // b <= a
                if(d >= b)
                    return b;
                else
                    return d;
            }

        }
    }
}
