public class LoopEx06 {
    public static void main(String[] args) {
        //1 ~ 10까지의 합

        System.out.println( "시작" );


        int sum = 0;
        for ( int i=1 ; i <= 10 ; i++) {
            // 누적 프로그램
            sum += i;

            /*
                i = 1     0 + 1;
                i = 2     (0 + 1) + 2          


             */

        }

        System.out.println( sum );

        System.out.println( "끝" );
    }
    
    
}
