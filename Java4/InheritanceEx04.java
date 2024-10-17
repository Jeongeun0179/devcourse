class Parent {
    String p = "박문수";
    void viewParent() {
        System.out.println("Parent viewParent");
    }
}

class Child extends Parent {
    //멤버 필드
    String c = "임꺾정";
    String p = "홍길동";
    void viewChild() {
        System.out.println("Child viewChild");
    }

    void viewParent() {
        System.out.println("Child viewParent");
    }

    void parentView() {
        // 부모의 멤버필드
        System.out.println(super.p);
        // 부모의 메서드
        super.viewParent();

        System.out.println(this);
        //System.out.println(super); //super는 찍을 수 없음
    }
}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.c);
        System.out.println(c.p);

        c.viewChild();
        c.viewParent();

        c.parentView();
    }
}
