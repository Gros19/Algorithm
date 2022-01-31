/*
A string is called balanced when every letter occurring in the string, appears both in upper- and lowercase
문자열에서 발생하는 모든 문자가 대문자와 소문자로 모두 나타날 때 문자열을 균형이라고 합니다.
. For example, the string "CATattac" is balanced ('a', 'c' and 't' occur in both cases),
but "Madam" is not ('d' and 'a' appear only in lowercase). Note that the number of occurrences does not matter.

Write a function:

class Solution { public int solution(String S); }

that, given a string S of length N, returns the length of the shortest balanced fragment of S. If S does not contain any balanced fragments, the function should return -1.

Examples:

1. Given S = "azABaabza", the function should return 5. The shortest balanced fragment of S is "ABaab".

2. Given S = "TacoCat", the function should return -1. There is no balanced fragment.

3. Given S = "AcZCbaBz", the function should return 8. The shortest balanced fragment is the whole string.

4. Given S = "abcdefghijklmnopqrstuvwxyz", the function should return -1.

Assume that:

N is an integer within the range [1..200];
string S consists only of letters ('a'−'z' and/or 'A'−'Z').
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

 */
public class Pi_codeQuiz3 {


        public static void main(String[] args){
            Solution3 a = new Solution3();
            System.out.println(a.solution("Sun",3));
        }

}

class Solution3 {
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