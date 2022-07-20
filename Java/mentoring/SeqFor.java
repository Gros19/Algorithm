package mentoring;

public class SeqFor {
    public static void main(String[] args){
        for(int i = 2;i < 10;i++){ //단을 반복 2~9단
            for(int j = 1; j < 10;j++) { //1 ~ 9
                System.out.print(i+"*"+j+"="+i*j+"\n");
//                System.out.println(i+"*"+j+"="+i*j);
//                System.out.printf("%d * %d = %d\n",i, j, i*j);
            }
        }
    }
}
