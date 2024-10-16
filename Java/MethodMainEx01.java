class Method {

    // 매서드 선언
    // 매서드명 - 식별자 규칙 따름
    // 소문자로 시작 & 동사(do, is)
    void method1 () {
        //실행문
        System.out.println("method1() 실행");

    }

    // 아규먼트 / 파라메터 = int a
    void method2(int a) {
        System.out.println( "method2() 호출 : " + a);
    }

    void method3(int a, int b, int c) {
        System.out.println( "method3() 호출 : " + a);
        System.out.println( "method3() 호출 : " + a);
        System.out.println( "method3() 호출 : " + a);
    } 

    //return은 반드시 한 개
    // void는 return이 없음을 나타내는 예약어
    // method의 자료형은 return할 자료형
    int method4() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    int method5( int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class MethodMainEx01 {
    public static void main(String[] args) {
        Method m = new Method();

        // 매서드의 호출
        m.method1();
        m.method2(69);
        // 2개만 넣으면 안됨.
        m.method3(20, 40, 74);
        int result = m.method4();
        System.out.println( result);

        result = m.method5(5, 6);
        System.out.println( result);

    }
}
