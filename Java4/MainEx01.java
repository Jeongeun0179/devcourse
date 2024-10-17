class Main {
    Main() {
        System.out.println("Main 생성자 호출");
    }
}

public class MainEx01 {

    int instanceVariable = 10;
    static int classVariable = 20;


    MainEx01() {
        System.out.println("MainEx01 생성자 호출");
    }
    public static void main(String[] args) {
        Main m = new Main();
        
        MainEx01 me = new MainEx01();

        // instanceVariable / classVariable
        System.out.println(MainEx01.classVariable);
        System.out.println(me.instanceVariable);
        //System.out.println(this.classVariable); // 오류남, 인스턴스지만 static이기 때문에 static 안에서 사용할 수 없음
    }
}
