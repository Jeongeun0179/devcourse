public class HomeworkEx03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            int j = 1;
            int middlesum = 0;
            do {
                middlesum += j;
                j++;
            } while ( j<=i );
            //System.out.print(sum1);
            //System.out.println();
            sum += middlesum;
            i++;

        } while ( i<=10 );

        System.out.print(sum);
    }
    
}
