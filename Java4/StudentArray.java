class Student {

    private String num;
    private String name;
    private String phonenum;
    private String age;
    private String addr;

    Student(String num, String name, String phonenum, String age, String addr) {
        this.num = num;
        this.name = name;
        this.phonenum = phonenum;
        this.age = age;
        this.addr = addr;
    }

    void printFx () {

        System.out.println(num + "\t" + name + "\t" + phonenum + "\t" + age + "\t" + addr);
        
        
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Student s0 = new Student("학번", "이름", "전화번호", "나이", "주소");
        Student s1 = new Student("1001", "홍길동", "010-111-1111", "20", "서울시");
        Student s2 = new Student("1002", "박문수", "010-222-2222", "22", "경기도");
        Student s3 = new Student("1003", "임꺽정", "010-333-3333", "25", "강원도");

        s0.printFx();
        s1.printFx();
        s2.printFx();
        s3.printFx();

    }
}
