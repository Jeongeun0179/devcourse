public class ConditionEx10 {
    public static void main(String[] args) {
        /*
            data
            10이면 10 출력
            20이면 20 출력
            30이면 30 출력
            기타 00을 출력
            if 
            switch
         */

        System.out.println( "시작" );

        int data = 20;
        // 조건에 만족하면 밑의 조건은 통과, 이 예시에선 20, 30, 00 다 찍힘
        // break 써야 됨
        // switch에 사용가능한 자료형 제한됨 - byte, short, int, char
        // string 추가
        switch(data) {
            case 10 :
                System.out.println( "10" );
                break;
            case 20 :
                System.out.println( "20" );
                break;
            case 30 :
                System.out.println( "30" );
                break;
            default :
                System.out.println( "00" );
        }

        String str = "20";

        switch( str ) {
            case "10" :
                System.out.println( "10" );
                break;
            case "20" :
                System.out.println( "20" );
                break;
            default :
                System.out.println( "기타" ); 


        }

        System.out.println( "끝" );
    }
    
}
