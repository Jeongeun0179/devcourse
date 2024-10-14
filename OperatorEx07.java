public class OperatorEx07 {
    public static void main (String[] args) {
        // 비교연산자 => 제어문
        // >, < >= <= = !=
        //논리값(boolean) 유도를 위해 사용함 

        System.out.println( 10 == 5);
        System.out.println( 10 != 5);

        System.out.println( 10 < 5);
        System.out.println( 10 > 5);

        // 비교의 연결
        // 논리연산자(이항)
        // 논리합(|| : pipe) - 이거나
        // 성별 남자이거나 나이가 40세 이상인
        // 둘 중에 하나가 참이면 참
        // true || true => true
        // true || false => true
        // 논리곱(&&) - 이고
        // true || false => false
        // 둘 모두 참이면 참

        boolean bool1 = (10 > 3); //true
        boolean bool2 = ( 3 > 10); //false

        System.out.println(bool1 || bool2);
        System.out.println(bool1 && bool2);
    }

}