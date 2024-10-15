public class LoopEx08 {
    public static void main(String[] args) {
        
        //유한루프
        //for (int i = 1 ; i<=5 ; i++) {

        //}

        //무한루프 -> 시스템이 정지
        //프로그램 필요에 따라 무한루프 사용
        // 조건 성립이 잘못됐을 경우도 무한루프 걸림
        //for(;;) {

        //}

        //미리 선언도 가능
        //int i = 1;
        //for ( ; i<=5 ; i++) {
        //    System.out.println("Hello");

        //}

        // 초기식 / 조건식 / 증감식 => 1개 이상에 가능
        for(int i=10, j=5 ; i<=5 || j <=10 ; i++, j++) {
            System.out.println(i + " / " + j);
        }



    }
    
}
