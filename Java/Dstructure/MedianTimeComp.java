package Dstructure;

import util.Timer;

/*
Do it - 중앙값
(자료구조와 함께 배우는 알고리즘 입문)
------------------------------
속도 비교
 */
public class MedianTimeComp {
    public static void main(String[] args){
        Timer t = new Timer();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }



        t.set();
        med3e(1, 5, 5);
        int med3e_time = (int)t.out();
        System.out.println("med3e time: "+ med3e_time);


        t.set();
        med3(1, 5, 5);
        int med3_time = (int)t.out();
        System.out.println("med3 time: "+ med3_time);


        System.out.println((float)med3e_time);


    }
    public static int med3e(int a, int b, int c){
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if((a > b && c > a) || (b > a && c < a))
            return a;
        else return c;
    }
    public static int med3(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }
            else if(a <= c){
                return a;
            }
            else{
                return c;
            }
        }
        else if(a > c){
            return a;
        }
        else if (b > c) {
            return c;
        }
        else{
            return b;
        }

    }


}


