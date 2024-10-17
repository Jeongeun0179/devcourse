//인스턴스 멤버 변수와 지역 변수의 이름이 같을 때 - this로 구분함
class Variable {
    // 인스턴스 멤버 필드
    String instanceVariable;

    void doFunc() {
        //지역 변수
        String instanceVariable = "20";
        System.out.println("doFunc() 호출 : " + instanceVariable);
        //this를 사용하면 class Variable을 지칭하고 인스턴스 변수를 취할 수밖에 없음.
        System.out.println("doFunc() 호출 : " + this.instanceVariable);

    }

    // 메서드의 아규먼트도 지역변수임
    void doFunc2(String instanceVariable) {
        System.out.println("doFunc2() 호출 : " + instanceVariable);
        System.out.println("doFunc2() 호출 : " + this.instanceVariable);
    }
} 

public class VariableMainEx02 {
    public static void main(String[] args) {
        Variable v = new Variable();

        v.instanceVariable = "10";

        v.doFunc();
        v.doFunc2("20");
    }
}
