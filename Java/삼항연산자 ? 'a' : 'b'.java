public class ConditionEx12 {
    public static void main(String[] args) {
        //삼항연산자(분기를 쉽게 만들어줌)
        // 조건 ? 값1 : 값2


        // 비교 / 논리
        char c1 = (10 > 3) ? 'a' : 'b';
        System.out.println( c1 ); 

        int a = 12;
        int b = 10;
        int c = 4;
        //한글로 소리내어 풀이해보기
        char c2 = (c < b && b < a) ? 'a' : 'b';
        System.out.println( c2 ); 

        // 조건에 의한 분기
        // 선택 / 필터링하고 싶을 때 분기 쓰는 것으로 이해하기
    }
    
}
