public class StudentArraynogada {
    public static void main(String[] args) {
        String[][] studentRecord = {{"학번", "이름", "전화번호", "나이", "주소"},
                                    {"1001", "홍길동", "010-111-1111", "20", "서울시"},
                                    {"1002", "박문수", "010-222-2222", "22", "경기도"},
                                    {"1003", "임꺽정", "010-333-3333", "25", "강원도"}};
    
        //System.out.println(studentRecord[1][3]);
         
        for ( int i=0 ; i<=studentRecord[0].length ; i++) {
            for ( int j=0 ; j<=studentRecord.length ; j++) {
                System.out.print(studentRecord[i][j] + "\t");
            }
            System.out.println();
        }
        
                                    
    }

}
