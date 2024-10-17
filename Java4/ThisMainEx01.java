class This {
    This() {
        System.out.println("생성자 호출");
    }

    This(String name) {
        //This();
        //생성자 이름 바로 쓰면 안되고 this()라는 예약어를 써줘야 됨
        this(); // 첫 번째 줄에 쓰여야만 함
        System.out.println("생성자 오버로딩 호출");
        //this(); - call to this must be first statement in constructor
    }
}


public class ThisMainEx01 {
    public static void main(String[] args) {
        This t = new This("홍길동");
    }
}
