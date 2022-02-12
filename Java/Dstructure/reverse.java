package Dstructure;

public class reverse {
    public static void main(String[] args){
        int size = args.length;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt( args[i]);
        }

        for(int i = 0; i < size/2; i++){
            int tmp;
            /*
            첫번째 요소 arr[0]
            */
            tmp = arr[i];
            /*
            맨 마지막 요소 arr[size-1]
            */
            arr[i] = arr[size-(i+1)];

            arr[size-(i+1)] = tmp;
            /*
            홀수일 때 정 가운데 요소는 바꿀 필요가 없기 때문에
            size/2로 충분
            */
        }
        for(int a : arr){
            System.out.println(a);
        }
//        return arr;
    }
}
