public class ConditionEx02 {
    public static void main(String[] args) {
        //data란 변수의 값이 10이면 "10이다"라는 문장을 출력하고 아니면 출력하지 말 것
        // 문제
        // 나이가 18이상이면 "선거 가능"이라고 출력(18 미만 아무것도 안함)
        //비교연산자

        System.out.println( "시작" );

        int data = 10;
        if(data == 10) {
            System.out.println( "10이다");
        }

        System.out.println( "끝");
    }
    
}
