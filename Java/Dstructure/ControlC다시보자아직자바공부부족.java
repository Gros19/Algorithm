package Dstructure;

public class ControlC다시보자아직자바공부부족 {

    public static void copy(int[] a, int[] b) {
        int size = b.length;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = b[i];
        }
        a = arr;
    }

    public static void recopy(int[] a, int[] b) {
        int size = b.length;
        int[] arr = new int[size];
        for(int i = size-1; i > -1; i--){
            arr[i] = b[i];
        }
        a = arr;
    }

    public static void main(String[] args){
        int[] arr1 = {2, 3, 5, 6};

        int[] arr2 = new int[3];

        copy(arr2, arr1);

        for (int i : arr2) {
            System.out.print(i+ " ");
        }

        System.out.println();


        recopy(arr2, arr1);
        for (int i : arr2) {
            System.out.print(i+ " ");
        }

    }

}
