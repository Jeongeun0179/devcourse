public class LoopEx12 {
    public static void main(String[] var0) {
       System.out.println("시작");

       int i = 1;
       while ( i <= 5) {
            int j = 1;
            while( j <= 5 ) {
                System.out.println( i + " / " + j);
                j++;
            }

            i++;
       }


    }
}
