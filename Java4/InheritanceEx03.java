class Parent {
    //Parent() {
    //    System.out.println("parent : " + this);
    //}

    Parent(String name) {
        System.out.println("parent : " + this);
    }
}

class Child extends Parent {
    Child() {
        // 부모의 생성자를 호출하기 default 생성자가 아니니까
        super( "홍길동" );
        System.out.println("child : "+ this);
        //super( "홍길동" ); // this처럼 생성자의 맨 처음부분에서만 호출할 수 있다. 
    }
}

public class InheritanceEx03 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("c: " + c);
    }
}

//출력된 게 child건지 parent건지 확인하기
// child를 통해서 parent 인스턴스화 시키고 default 생성자에 의해 전부 instance화되어 메모리 저장 도움