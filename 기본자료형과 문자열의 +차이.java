public class OperatorEx04 {
    public static void main(String[] args) {
        // 기본자료형 : + => 산술 
        // 문자열 : + => 문자열 연결 연산자

        //문자열 - 문자를 연결 +
        System.out.println( "1" + "1");
        // 숫자 - 산술 + 
        System.out.println( 1 + 1 );

        // 누구나 쉽게 읽을 수 있게
        // () 써서 연산자 우선 확실하게 함 모호하게 하면 안됨
        // 111
        System.out.println( "1" + ( 1 + 1 ) );
        // 111
        System.out.println( 1 + "1" + 1);
        // 21
        System.out.println( 1 + 1 + "1");
    }
}
