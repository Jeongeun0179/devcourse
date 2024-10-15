public class LoopEx19 {
    public static void main(String[] args) {
        
        // 별표 찍기 for문 두 번 사용해서

        for (int i=1 ; i<=10 ; i++) {
            // 열
            for (int j=1 ; j<=i ; j++) {
                // 행
                System.out.print( "*");
            }

            System.out.println( );
        }

        //별표 균일하게 찍기
        System.out.println( );

        for (int i=1 ; i<=10 ; i++) {

            for (int j=1 ; j<=10 ; j++) {

                System.out.print( "*");
            }

            System.out.println( );
        }
    }
}
