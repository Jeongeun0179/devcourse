public class LoopEx05 {
    public static void main(String[] args) {
        // 1부터 50까지 중 2배수이며 3배수인 값을 출력
        // 6, 12, ...

        System.out.println( "시작" );



        for ( int i=1 ; i <= 50 ; i++) {
            // 2와 3의 공배수
            if ( i %  2 == 0 && i % 3 == 0 ) {
                System.out.print( i + ", " );
            }

        }

        System.out.println( "끝" );
    }
    
}
