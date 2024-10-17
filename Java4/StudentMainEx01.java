// 실행 클래스
public class StudentMainEx01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();


         // `자료형@해시코드` 로 출력된다. => 객체가 메모리에 저장된 위치
        System.out.println( s1 );  // Student@4517d9a3
        System.out.println( s2 );  // Student@372f7a8d

    }
}
