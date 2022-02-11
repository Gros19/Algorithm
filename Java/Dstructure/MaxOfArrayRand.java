package Dstructure;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int[] height = new int[num];

        int max = 0;

        for (int i = 0; i < num; i++) {
            height[i] = rand.nextInt(90);
            if (height[i] > max) {
                max = height[i];
            }
            System.out.println(height[i]);
        }

        System.out.println("최댓값은 " + max);
    }



}
