public class DataTypeEx05 {
    public static void main(String[] args) {
        // 정수(가장 많이 사용)
        // 뭘 쓰느냐는 메모리 최적화의 문제(지금은 생각할 문제가 아님)
        // byte, short, int(*), long - 라이브러리에서 지정해 주는 경우는 있음

        // (*)
        int i = 10;
        System.out.println( i );

        byte b = 10;
        short c = 10;
        System.out.println( b );
        System.out.println( c );

        //진법 => 정수
        //2진법
        int i2 = 0b1010;
        //8진법
        int i8 = 030;
        //16진법
        int i16 = 0xA4;
        //10진법으로 출력
        System.out.println( i2 );
        System.out.println( i8 );
        System.out.println( i16 );

        //10진법 => 다른 진법
        System.out.printf( "%o%n", 10 ); //8진법
        System.out.printf( "%o%n", 18 ); //16진법
        
        // 분수 표기법
        int i3 = 100_000_000;
        System.out.println( i3 );
        
    }
}