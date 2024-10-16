class Method {
    // Method Overloading
    void doFunc() {
        System.out.println( "doFunc() 호출 ");
    }

    //void doFunc() {
    //    System.out.println( "doFunc() 호출 ");
    //}

    // 인자 개수가 다르면 같은 이름 사용 가능 
    void doFunc(int a) {
        System.out.println( "doFunc(int a) 호출 ");
    }

    void doFunc(String a) {
        System.out.println( "doFunc(String a) 호출 ");
    }

    void doFunc(int a, String s) {
        System.out.println( "doFunc(int a, String a) 호출 ");
    }

    void doFunc( String s, int a) {
        System.out.println( "doFunc(String s, int a ) 호출 ");
    }
}

public class MethodMainEx03 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc();
        m.doFunc( 10 );
        m.doFunc( "10" );
        m.doFunc( 10, "10" );
        m.doFunc("10", 10 );
    }
    
}
