public class OperatorEx01 {
    public static void main (String[] args) {
        // 이항연산자 - 산술연산자
        // + - X /(나누기) %(나머지)

        //나머지 - 정수
        //일련의 숫자를 그룹화시킴
        //1 % 2 = 1
        //2 % 2 = 0
        //3 % 2 = 1
        //4 % 2 = 0

        System.out.println( 1 % 2 );
        System.out.println( 2 % 2 );
        System.out.println( 3 % 2 );
        System.out.println( 4 % 2 );

        // 나눗셈 
        System.out.println( 2 / 2 );
        // 자료형의 문제로 1이 출력됨
        // 정수 / 정수 = 정수 => 1
        System.out.println( 3 / 2 );
        System.out.println( 5 / 2 );
        // 자료형 변환
        System.out.println( 5 / 2.0 );
        System.out.println( 5 / (double)2 );

        //변수
        int i1 = 5;
        int i2 = 2;
        //int result = i1 / i2;
        double result = i1 / (double)i2;
        System.out.println( result );
    }
}