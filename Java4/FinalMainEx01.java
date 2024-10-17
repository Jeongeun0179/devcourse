class Parent {
    final void viewParent() { //final이 붙으면 override할 수 없다. 
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent {
    // 상수화된 멤버 필드
    //final String name = "홍길동";
    final static String name = "홍길동";
    
    void viewChild() {
        // 상수화된 지역 변수
        final String name = "박문수";
        System.out.println(name);
        //name = "홍길동"; // 불가 

    }

    //오버라이딩
    void viewParent() {
        System.out.println("Child viewParent");
    }
}

public class FinalMainEx01 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println( c.name );

        //c.name = "박문수"; // 상수화된 변수이므로
        c.viewChild();

        c.viewParent();
    }
}
