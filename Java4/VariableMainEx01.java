class Variable {
    // 멤버 필드
    // 인스터스화를 무조건 해야 함
    String instanceVariable;
    static String classVariable;
    
    void doFunc() {
        // 지역 변수
        // {}
        //메서드 안에서만 쓰여짐
        String localVariable1 = "10";
        System.out.println(localVariable1);

        // {} 블럭 => 제어문
        // 제어문 안의 제어문 가능
        int num1 = 10;
        System.out.println("시작");
        {
            //int num1 = 10; - 이렇게 재정의 안됨
            System.out.println("중간");
            int num2 = 20;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
        System.out.println("끝");
        System.out.println("num1 = " + num1);
        //System.out.println("num2 = " + num2); // 코드 블럭 안에서 선언한 건 밖에서 사용할 수 없음
        // cannot find symbol 에러 남
    }
}

public class VariableMainEx01 {
    public static void main(String[] args) {

        //가장 넓은 영역
        Variable.classVariable = "10";
        System.out.println(Variable.classVariable);

    
        //
        Variable v = new Variable();
        v.instanceVariable = "10";
        System.out.println(v.instanceVariable);

        v.doFunc();
        //v.localVariable1 = "10"; - 에러 남


    }
}

/*
1. `VariableMainEx01`의 `main` 메소드 실행.
2. `main` 메소드에서 `System.out.println(Variable.classVariable)` 실행.
3. `main` 메소드에서 `System.out.println(v.instanceVariable)` 실행.
4. `main` 메소드에서 `v.doFunc()` 호출, 그 후 `doFunc()` 메소드 내의 `System.out.println` 실행
 */