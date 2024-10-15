public class ConditionEx05 {
    public static void main(String[] args){
        // 문제
        // 나이가 18이상이면 "선거 가능"이라고 출력(18 미만 선거불가능 출력

        System.out.println( "시작" );

        int data = 16;
        if (data >= 18) {
            System.out.println( "선거가능");
        } else {
            System.out.println( "선거불가능");
        }

        System.out.println( "끝" );
    }    
}
