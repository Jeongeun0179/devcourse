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

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }
}

public class StudentArray02 {
    public static void main(String[] args) {
        Student s0 = new Student("학번", "이름", "전화번호", "나이", "주소");
        Student s1 = new Student("1001", "홍길동", "010-111-1111", "20", "서울시");
        Student s2 = new Student("1002", "박문수", "010-222-2222", "22", "경기도");
        Student s3 = new Student("1003", "임꺽정", "010-333-3333", "25", "강원도");


        System.out.println(s0.getNum() + "\t" + s0.getName() + "\t" + s0.getPhonenum() + "\t" + s0.getAge() + "\t" + s0.getAddr());
        System.out.println(s1.getNum() + "\t" + s1.getName() + "\t" + s1.getPhonenum() + "\t" + s1.getAge() + "\t" + s1.getAddr());
        System.out.println(s2.getNum() + "\t" + s2.getName() + "\t" + s2.getPhonenum() + "\t" + s2.getAge() + "\t" + s2.getAddr());
        System.out.println(s3.getNum() + "\t" + s3.getName() + "\t" + s3.getPhonenum() + "\t" + s3.getAge() + "\t" + s3.getAddr());
        

    }
}
