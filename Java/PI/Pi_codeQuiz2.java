/*
Days of the week are represented as three-letter strings ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").

Write a function solution that, given a string S representing the day of the week and an integer K (between 0 and 500, inclusive), returns the day of the week that is K days later.

For example, given S = "Wed" and K = 2, the function should return "Fri".

Given S = "Sat" and K = 23, the function should return "Mon".



 */
public class Pi_codeQuiz2 {


        public static void main(String[] args){
            Solution2 a = new Solution2();
            System.out.println(a.solution("Sun",3));
        }

}

class Solution2 {
    public String solution(String S, int K) {
        String [] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int n = K;
        for(int i = 0; i< week.length; i++){
            if(S.equals(week[i])){

                n+=i;
                break;
            }
        }
        n%=7;
        return week[n];
    }
}