class Variable {
    String instanceVariable;
    static String classVariable;

    //인스턴스 매서드
    void doFunc1 () {
        System.out.println("doFunc1() 호출 : " + this.instanceVariable);
    }
    //클래스 매서드는 인스턴스화 되기 전에 만들어지기 때문에 this를 쓸 수 없음
    //클래스는 메모리를 많이 사용하기 때문에 무조건 공유되어야 하는 것만 클래스 매서드로 사용함
    static void doFunc2 () {
        System.out.println("doFunc2() 호출" );
    }
}

public class VariableEx02 {
    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";

        System.out.println( v1 ); //주솟값 출력

        v1.doFunc1();
        v2.doFunc1();

        //v1.doFunc2();
        //v2.doFunc2();

        Variable.doFunc2();
        
        
    }
}
