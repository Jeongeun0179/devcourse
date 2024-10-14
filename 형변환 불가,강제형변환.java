public class CastingEx02 {
    public static void main(String[] args) {
        int i1 = 10;
        //형변환 불가 - 큰거에선 작은거로 안됨
        //short s1 = i1;
        //강제형변환
        short s1 = (short)i1;

        System.out.println( i1 );
        System.out.println( s1 );

        // float / double
        char c1 = 'A';
        int i2 = c1 + 3;
        System.out.println( c1 );
        System.out.println( i2 );
        System.out.println( (char)i2 );
    }
}
