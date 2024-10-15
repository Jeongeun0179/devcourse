public class LoopEx15 {
    public static void main(String[] args) {
        System.out.println("시작");

        int i = 0;
        while (i <= 5 ) {
            i++;
            if ( i == 3 ) {
                //break;
                continue;
            }
            System.out.println( i );
        }


        System.out.println("끝");

    }
    
}
