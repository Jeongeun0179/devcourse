public class LoopEx09 {
    public static void main(String[] args) {
        //중첩반목분
        // 반복문 1 : 1차원
        // 반복문 1 : 1차원
        // 반복문 1 : 1차원

        System.out.println( "시작" );

        //반복횟수
        // 외부(5) / 내부(5) => 25

        for ( int i=1 ; i <= 10 ; i++) {
            System.out.println( "?" );

            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " / " + j); // 5 * 5 = 25회 반복
            }
        }



        System.out.println( "끝" );

    }
    
}
