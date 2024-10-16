class Variable {
    // 인스턴스 멤버필드
    String instanceVariable;
    // 클래스 멤버필드
    static String classVariable;
}

public class VariableEx01 {
    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "홍길동";
        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);

        v2.instanceVariable = "임꺾정";

        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);


        //v2가 v1와 classVariable을 공유하고 있음
        v1.classVariable = "박문수";
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);
        
        // 클래스의 이름으로 공유하는 것처럼, v1, v2 따로 쓰면 각각으로 저장된 것처럼 헷갈리니까
        System.out.println(Variable.classVariable);
        
    }
}
