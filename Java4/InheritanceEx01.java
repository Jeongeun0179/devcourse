class Parent {
    String p = "parent";
    void viewParent() {
        System.out.println("viewParent() 호출");

    }
}

class Child1 {
    void viewChild() {
        System.out.println("viewChild() 호출");
    }
}

// 다중 상속은 허용하지 않음, child가 여러 개인 건 상관 X
class Child2 extends Parent {
    String c2 = "child2";
    void viewChild() {
        System.out.println("Child2 viewChild() 호출");
    }
}

class Child3 extends Parent {
    void viewChild() {
        System.out.println("Child3 viewChild() 호출");
    }
}

class GrandCh2 extends Child2 {
    String gc2 = "granchild2";
    void viewGrandchild() {
        System.out.println("Grandchild2 viewGrandchild() 호출");
    }
}

// 실행 클래스
public class InheritanceEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild();

        Child2 c2 = new Child2();
        c2.viewChild();
        c2.viewParent();

        Child3 c3 = new Child3();
        c3.viewChild();
        c3.viewParent();

        GrandCh2 gc2 = new GrandCh2();
        gc2.viewGrandchild();
        gc2.viewChild();
        gc2.viewParent();

        System.out.println(gc2.p);
        System.out.println(gc2.c2);
        System.out.println(gc2.gc2);
    }    
}
