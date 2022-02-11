package Dstructure;

public class array {
    public static void main(String[] args){
        CloneArray();
    }

    public static void CloneArray(){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3]  = 0;

        for(int i: a){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for(int i: b){
            System.out.println(i);
        }
    }
}
