package util;

public class Timer {
    //인스턴스 생성 후 바로 카운트 시작
    public static long beforeTime = System.nanoTime();
    // 디폴트로 ns 단위로 출력
    // scale = 1000000 하면 ms
    public static int scale = 1;

    //기준 시간을 다시 세팅합니다.
    public void set(){
        beforeTime = System.nanoTime();
    }

    //s 단위를 변경합니다.
    public void ScaleSet(int a){
        scale = a;
    }

    public long out(){
        // 코드 실행 전에 시간 받아오기
        long afterTime = System.nanoTime();
        //두 시간 차 계산
        return (afterTime - beforeTime)/scale;
    }

}
