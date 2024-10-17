class Parent{
    void viewParent() {
        System.out.println("Parent viewParent calling");
    }
}

class Child extends Parent {
    void viewChild() {
        System.out.println("viewChild calling");
    }

    // 부모 걸 재정의 한 것을 Overriding이라고 한다. - 메소드명의 통일화
    void viewParent() {
        System.out.println("Child viewParent calling");
    }

    //viewParent() in Child cannot override viewParent() in Parent, 부모 만든 걸 꼭 가져다 써야 함
    /* 
    int viewParent() {
        System.out.println("Child viewParent() calling");
        return 0;
    }
    */
}

class Child2 extends Parent {
    void viewChild() {
        System.out.println("viewChild calling");
    }

    // 부모 걸 재정의 한 것을 Overriding이라고 한다. - 메소드명의 통일화
    void viewParent() {
        System.out.println("Child2 viewParent calling");
    }

}





public class InheritanceEx02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewChild();
        c.viewParent();

        Child2 c2 = new Child2();
        c2.viewParent();
    }
}
