public class ConditionEx07 {
    public static void main(String[] args) {
        //변수값이 5와 10사이에 있으면 "영역내" 출력 otherwise "영역외" 출력
        // 5 < 변수 < 10 - 컴퓨터에선 실행 불가능
        System.out.println( "시작");

        int data = 12;
        if( (data > 5) && (data < 10) ) {
            System.out.println( "영역내");
        } else {
            System.out.println( "영역외");
        }

        System.out.println( "끝");

    }
    
}
