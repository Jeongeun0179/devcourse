public class OperatorEx06 {
    public static void main (String[] args) {
        // 증감 연산자 - 단항연산자
        // ++ / --
        int a1 = 10;
        int a2 = 10;
        int a3 = 10;
        int a4 = 10;
        // +1
        a1 = a1 + 1;
        a2 += 1;
        a3++;
        ++a4;

        System.out.println(a1);
        //System.out.println(a2);
        //System.out.println(a3);
        //System.out.println(a4);

        a1--;
        System.out.println(a1);

        int a5 = 10;
        int a6 = 10;
        
        int b1 = ++a5;
        int b2 = a6++;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("a5 = " + a5);
        System.out.println("a6 = " + a6);


    }

}
