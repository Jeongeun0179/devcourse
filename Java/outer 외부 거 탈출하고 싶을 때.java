public class LoopEx17 {
    public static void main(String[] args) {
        System.out.println("시작");

        int i = 0;
        // 외부 거 탈출하고 싶을 때
        // 라벨 : label
        outer : 
        while(i<=5) {
            i++;

            int j = 0;
            while (j <= 5 ) {
                j++;
                
                // 가장 가까운 반복문 탈출
                if( j ==3 ) {
                    //break outer;
                    continue outer;
                }

                System.out.println( i + " / " + j);
            }
        }

        System.out.println("끝");
    }
    
}
