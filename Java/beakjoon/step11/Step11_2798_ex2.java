package step11;

/*
브루투포스-블랙잭
문제를 풀기 위한 기반
동적 계획 알고리즘 중 Knapsack 알고리즘을 구현해볼 필요성을 느낌
추가로 근사치를 반환하는 메서드도 구현
 */
public class Step11_2798_ex2 {
    public static void main(String[] args){
        int  comp = 5;
        int standard = 6;
        int tmp = 999;
        if(Math.abs(comp-standard) < Math.abs(tmp-standard)){
            tmp = comp;
        }
        System.out.println(tmp);
    }



}