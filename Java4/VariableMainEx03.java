//인스턴스 멤버 변수와 지역 변수의 이름이 같을 때 - this로 구분함
class Variable {
    // 인스턴스 멤버 필드 - 자동 초기화(값을 알아서 집어넣음)
    //객체: null로 초기화됨, null 은 비어있음을 의미
    String instanceVariable;
    // 0
    int instanceVariable2;
    // ''
    char instanceVariable3;

    void doFunc() {
        //지역 변수 - 반드시 초기화해야 사용할 수 있음(값을 넣어줘야 함)
        String localVariable;
        //System.out.println("localVariable = " + localVariable);
        //variable localVariable might not have been initialized - 초기화 안해서 에러 남.
    }
} 

public class VariableMainEx03 {
    public static void main(String[] args) {
        Variable v = new Variable();

        //초기화 없이 멤버 필드의 내용 확인
        System.out.println( "instanceVariable = " + v.instanceVariable);
        System.out.println( "instanceVariable = " + v.instanceVariable2);
        System.out.println( "instanceVariable = " + v.instanceVariable3);

    }
}
