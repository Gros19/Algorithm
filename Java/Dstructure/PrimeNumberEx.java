package Dstructure;

public class PrimeNumberEx {
    public static void main(String[] args){
        boolean[] arr = new boolean[1001];
        //0과 1은 소수 아님
        arr[0]= true; arr[1] = true;

        int end = (int)Math.sqrt(1000);

        int i, x;
        int mul ;
        int count = 0;
        for (i = 2; i < end; i++) {
            for (x = 2, mul = x*i ;  mul < 1001; x++) {
                arr[mul] = true;
                mul = i * x;
                count++;
            }
        }

        for (int a = 0; a < arr.length; a++) {
            if(!arr[a]){
                System.out.println(a);
            }
        }

        System.out.println("연산 횟수: " + count);
    }
}
