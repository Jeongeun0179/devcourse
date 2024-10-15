public class LoopEx01 {
    public static void main(String[] args) {
        //Hello World를 5번 출력
        
        System.out.println("시작");

        //중요한 건 반복횟수
        //수열
        for ( int i=1 ; i <= 5 ; i++) {

            System.out.println("Hello World : " + i);

        }

        // 1 ~ 10 출력
        for ( int i=1 ; i <= 10 ; i++) {

            System.out.println( i);

        }

        // 1 ~ 10 홀수만 출력
        // 10번 회전
        for ( int i=1 ; i <= 10 ; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }

        // 2씩 증가
        // 5번 회전(퍼포먼스 10번 회전보다 2배 차이)
        for ( int i=1 ; i <= 10 ; i+=2) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }

        System.out.println("끝");
    }
    
}
