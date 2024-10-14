public class OperatorEx02 {
    public static void main(String[] args) {
        int i1 = 1_000_000;
        int i2 = 2_000_000;

        // -가 나옴 Overflow
        int product1 = i1 * i2;
        // i1이나 i2중에 하나는 long으로 바꿔줘야 함. 아니면 에러남
        long product2 = (long)i1 * i2;

        System.out.println( product1 );
        System.out.println( product2 );
    }
}