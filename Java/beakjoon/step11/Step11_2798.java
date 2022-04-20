package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
브루투포스-블랙잭
문제
카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.

한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.

김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.

이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.

N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

입력
첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.

합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

출력
첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

예제 입력 1
5 21
5 6 7 8 9
예제 출력 1
21
예제 입력 2
10 500
36 93 138 181 185 214 216 245 295 315
*                      *   *
예제 출력 2
497
 */
public class Step11_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] var = br.readLine().split(" ");
        String[] Strcards = br.readLine().split(" ");
        int[] cards = Arrays.stream(Strcards).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(var[1]);
        Arrays.sort(cards);

        int i;

        /*카드가 3장이면 바로 출력*/
        if(cards.length==3){
            System.out.println(cards[0]+cards[1]+cards[2]);
            return;
        }else if(cards.length>=100){
            i= 99;
        }else{
            i = cards.length -1 ;
        }

        int max=0;
        for(; i >1;i--){
            for(int j = i-1; j >0; j--){
                for(int k = j-1; k>-1; k--){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum <= m){
                        if(sum > max){
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}