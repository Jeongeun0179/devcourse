public class LoopEx16 {
    public static void main(String[] args) {
        System.out.println("시작");

        int i = 0;
        while(i<=5) {
            i++;

            int j = 0;
            while (j <= 5 ) {
                j++;
                
                // 가장 가까운 반복문 탈출
                if( j ==3 ) {
                    //break;
                    continue;
                }

                System.out.println( i + " / " + j);
            }
        }

        System.out.println("끝");
    }
    
}
