class Method {
    //가변인자(아규먼트) - 인자 개수가 정해지지 않은 거
    void doFunc1(int a) {
        System.out.println("doFunc1(int a) 호출");
    }

    // 몇 개를 넣던 상관없음
    void doFunc2(int ... args ) {
        // System.out.println("doFunc2(int ... args) 호출");
        // args 배열형식
        System.out.println( args.length );
        for (int arg : args ) {
            System.out.print( arg + ", ");
        }
        System.out.println();
    }

}

public class MethodMainEx04 {
    public static void main(String[] args){
        Method m = new Method();
        m.doFunc1(10);
        m.doFunc2(10, 20, 90);
        m.doFunc2(10, 90);
        m.doFunc2(90);

    }
}
