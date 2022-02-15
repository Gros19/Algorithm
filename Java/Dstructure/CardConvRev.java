package Dstructure;

import java.util.Scanner;

public class CardConvRev {
    public static int cardCOnvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x%r); //r로 나눈 나머지를 저장
            x /= r;
        }while(x != 0);
        return digits;
    }

    public static int cardConv(int x, int r, char[] d){
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int digits = 1; // 변환될 기수의 크기
        int nr = r;



        while (x >= nr) {
            digits++;
            nr*=r;
        }
        int size = digits;

        do{
            d[--digits] = dchar.charAt(x%r); //r로 나눈 나머지를 저장
            x /= r;
        }while(x != 0);

        return size;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int no;
        // 변환하는 정수
        int cd;
        // 기수
        int dno;
        // 변환 후의 자릿수
        int retry;
        // 반복 설정
        char[] cno = new char[32];
        // 변환 후 각 자리의 숫자를 넣어두는 배열

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.println("변환할 양의 정수: ");
                no = scn.nextInt();
            } while (no < 0);

            do {
                System.out.println("어떤 진수로 변환할까요? ");
                cd = scn.nextInt();
            } while (cd < 2 || cd > 36);

            //역변환
            dno = cardCOnvR(no, cd, cno);
            System.out.print(cd+ "진수로 변환 결과: ");
            for(int i = --dno; i >= 0; i--){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            StringBuilder res = new StringBuilder();

            //정변환
            dno = cardConv(no, cd, cno);
            for(int i = 0; i < dno; i++){
                res.append(cno[i]);
            }
            System.out.printf("%d진수로 변환 결과: %s입니다.",cd, res);

            System.out.println("한 번 더 하려면 1, 아니면 0을 눌러주세요.");
            retry = scn.nextInt();
        } while (retry == 1);
    }
}
