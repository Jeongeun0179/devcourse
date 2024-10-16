class Person {
    // member field
    String name;
    int age;
    String jumin;
    double height;
    double weight;

    // method
    void smile() {
        System.out.println("웃다 : " + this);
        // member field 접근을 확실하게 하기 위해 this 사용
        System.out.println("웃다 : " + this.name);
        System.out.println("웃다 : " + name);

        this.eat();
    }

    void eat() {
        System.out.println("먹다");
    }

    void sleep() {
        System.out.println("자다"); 
    }
}

public class PersonMainEx04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "이순신";
        p2.name = "강감찬";

        //System.out.println(p1);
        //System.out.println(p2);

        p1.smile();
        p2.smile();
        
        
    }
}
