public class LoopEx18 {
    public static void main(String[] args) {
        // while / continue
        // 1 ~ 100까지 짝수의 합을 구하시오.

        int i = 0;
        int sum = 0;    
        while ( i <= 100 ) {
            i++;
            if ( i % 2 == 1) {
                continue;
            } else {
                sum += i;
            }
            // i++이 이 줄에 있으면 continue일 때 +1이 안되어 무한루프에 빠짐
            
        }

        System.out.println(sum);
    }
    
}
