public class LoopEx03 {
    public static void main(String[] args) {
        // ABCD ~ Z 출력
        // ascii 이용하기
        // 'A' = 65


        System.out.println( "시작" );


        for ( int i=65 ; i <= 90 ; i++) {

                System.out.println( (char)i );

        }
        
        System.out.println( );

        for ( char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.println( (int)ch );
        }


        System.out.println( "끝" );
    }
    
}
