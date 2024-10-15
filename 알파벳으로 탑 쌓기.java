public class HomeworkEx01 {
    public static void main(String[] args) {
        for ( int i=65; i<=74 ; i++ ) {
            for ( int j=65 ; j<=i ; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }

        for ( int i=0; i<=9 ; i++ ) {
            for ( int j=65 ; j<=65+i ; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    
}
