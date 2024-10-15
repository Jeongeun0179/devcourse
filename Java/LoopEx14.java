public class LoopEx14 {
    public static void main(String[] args) {
        // A ~ Z
        /* 
        int i = 65;
        do {

            System.out.println( (char)i );
            i++;
        } while ( i <= 90 );
         */

        // 중첩 do ~ while
        int i = 0;
        do {
            int j = 0;

            do {
                System.out.println( i + " / " + j );
                j++;
            } while ( j <= 5);
            i++;
        } while ( i <= 5 );
    }

    


    
}
