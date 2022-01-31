import java.util.Arrays;

public class Pi_codeQuiz {


        public static void main(String[] args){
            Solution a = new Solution();
            int[] arr = {4,3,2,1};
            System.out.println(a.solution(arr));
        }




}
class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);
        int asize = A.length;
        if(A[asize-1] < 0){
            return 1;
        }
        boolean[] boolA = new boolean[A[asize-1]+1];

        for(int i: A){
            if(i > 0){
                boolA[i] = true;
            }

        }

        int max=0;

        for(int a = 1; a < boolA.length;a++){
            if(!boolA[a]){
                System.out.println(a);
                max=a;
                break;
            }
        }



        if(max == 0){
            return A[asize-1]+1;
        }else{
            return max;
        }
    }

}