/*
You are given a string S consisting of N lowercase letters. In one move you can remove any substring (consistent fragment) from S, which starts and ends with the same letter and is at least two letters long. What is the minimum number of letters that may remain in S after any number of such moves?

Write a function:

class Solution { public int solution(String S); }

that, given a string S, returns the length of the shortest string that can be obtained from S by applying any number of moves as described above.

Examples:

1. Given S = "abcca c", the function should return 1. After removing the substring "abcca", there will be a single letter "c" remaining.

2. Given S = "abcda bc dabcd" ("abcd" stated three times), the function should return 2. To achieve that, you can, for example, remove the first five letters from S ("abcda") in the first move, and the last five letters ("dabcd") in the second move. The remaining fragment would be "bc".

3. Given S = "axaa byab", the function should return 0. It is possible to remove all letters by removing the substring "axaa" in the first move, and then "byab" in the second.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
string S consists only of lowercase letters (a−z).
 */
public class Pi_codeQuiz3 {


        public static void main(String[] args){
            Solution3 a = new Solution3();
            System.out.println(a.solution("abccac"));
            System.out.println(a.solution("abcdabcdabcd"));
            System.out.println(a.solution("axaabyab"));
        }

}
/*
"axaabyab"
 */
class Solution3 {
    public int solution(String S) {
/*
        "axby"
        a
        ax a a by a b

        x
        a x aabyab

        b
        axaa b ya b

        y
        axaab y ab

 */
        int i = 0;
        while(i++ < S.length()){
            char c = S.charAt(0);
            String sub = "";

            int idx = S.indexOf(c);
            if(idx > -1){
                sub = S.substring(idx+1);
                int lidx = sub.indexOf(c);
                sub = S.substring(idx, lidx+2);
            }
            if(!sub.equals("")){
                S = S.replace(sub, "");
            }
        }

        System.out.println("s ::" + S);
        return 0;
    }
}