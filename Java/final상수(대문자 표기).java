public class VariableEx03 {
    public static void main (String[] args) {
        //상수
        //상수명 선언 시 대문자와 _이용 -> 이름만으로 변수와 구분하기 위해 
        final int num1;
        num1 = 10;
        System.out.println( num1 );

        //상수는 재할당 불가능
        //num1 = 20;
        //System.out.println( num1 );

        final int NUM;
        NUM = 10;
        System.out.println( NUM );
    }

}
