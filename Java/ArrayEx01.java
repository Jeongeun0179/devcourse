public class ArrayEx01 {
    public static void main(String[] args) {
        // 배열
        // 선언
        // 정소형 배열 arr1 선언
        int[] arr1;
        int arr2[];

        // 생성
        // 방(인덱스)의 개수
        arr1 = new int[10];
        arr2 = new int[30];

        // 사용
        // 초기화
        // index 번호는 0부터 시작
        // 0 ~ 9
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[9] = 100;

        //Index 10 out of bounds for length 10라는 에러가 뜸
        //runtime(실행 오류) - 문법적 오류는 아님(compile 오루 아님)
        //arr1[10] = 110;

        System.out.println( arr1[0] );
        System.out.println( arr1[1] );
        System.out.println( arr1[9] );
        
        // runtime error, 위의 print는 잘 출력됨
        //System.out.println( arr1[12] );

        // 선언과 생성 통합
        int[] arr3 = new int[3];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;

        System.out.println( arr3[0] );
        
        
        

    } 
    
}
