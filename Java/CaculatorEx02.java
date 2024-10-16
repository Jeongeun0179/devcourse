class Util {
    void doCalculator(int a, char b, int c) {
        switch(b){
            case '+':
                System.out.println(a + c);
                break;
            case '-':
                System.out.println(a - c);
                break;
            case 'x':
                System.out.println(a * c);
                break;
            case '/':
                System.out.println(a / c);
                break;
            case '%':
                System.out.println(a % c);
                break;

        } 
    }
}

public class CaculatorEx02 {
    public static void main(String[] args) {
        Util u1 = new Util();

        u1.doCalculator(9, 'x', 3);
    }
    
}
