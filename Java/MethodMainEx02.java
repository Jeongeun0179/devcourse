class Method {

    void gugudan ( int dan ) {
        for (int i=1 ; i<=9 ; i++) {
            System.out.println( dan + " X " + i + " = " + (dan * i) );
        }
        
    }

}

public class MethodMainEx02 {
    public static void main(String[] args) {
        // 구구단 단수를 입력받아서 구구단을 출력 / gugudan method
        Method m = new Method();
        m.gugudan(8);
    }
    
}
