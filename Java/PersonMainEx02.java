class Person {
    // member field
    String name;
    int age;
    String jumin;
    double height;
    double weight;
}

public class PersonMainEx02 {
    public static void main(String[] args) {
        // 자료형 변수명  값;
        int a = 10;

        // 홍길동
        // 객체 변수 생성(인스턴스화)
        // p1 : 인스턴스
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        p1.jumin = "111";
        p1.height = 182.0;
        p1.weight = 85;

        // 강감찬
        Person p2 = new Person();
        // . : 메모리 참조 연산자 
        p2.name = "강감찬";
        p2.age = 34;
        p2.jumin = "222";
        p2.height = 180.5;
        p2.weight = 80;
        // 이순신
        Person p3 = new Person();

        System.out.println(p1.name );
        System.out.println(p1.age );
        System.out.println(p2.name );
        System.out.println(p1.age );
        
    }
}
