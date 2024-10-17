class Modifier {
    // apaqj vlfem
    String data1 = "default";
    public String data2 = "public";
    protected String data3 = "protected";
    private String data4 = "private"; //data4 has private access in Modifier
    // private은 class 밖에서는 접근할 수 없음

    void viewData() {
        // 내부적으로는 접근제어자가 필요없음
        System.out.println( this.data1);
        System.out.println( this.data2);
        System.out.println( this.data3);
        System.out.println( this.data4);
    }
}

public class ModifierMainEx01 {
    public static void main(String[] args) {
        Modifier m = new Modifier();

        // 외부에서의 접근은 접근제어자 필요함
        // private / public 중심으로 공부하기
        System.out.println(m.data1);
        System.out.println(m.data2);
        System.out.println(m.data3);
        //System.out.println(m.data4);
        m.viewData();
    }
}
