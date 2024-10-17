class Constructor {
    // 생성자가 없으면 컴파일러 자동생성, 생성자는 반드시 있어야 함 : default 생성자
    // 수동 생성 - 디폴트 생성자 만들지 않음
    Constructor() {
        System.out.println( "생성자 호출" );
    }

}

public class ConstructorMainEx01 {
    public static void main(String[] args) {
        // 인스턴스화

        // new Constructor() = new + 생성자 호출
        // 생성자는 독립적으로 호출할 수 없음 new가 꼭 붙어야 함
        Constructor c = new Constructor(); // 여기 new에서 자동 호출
    }
}
