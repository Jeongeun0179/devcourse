public class CalculatorEx {
    public static void main(String[] args) { 
        
        if(args.length != 3) {
            System.out.println("오류입니다 바보야 : " + args.length);
        } else {

            int v1 = Integer.parseInt( args[0] );
            int v2 = Integer.parseInt( args[2] );
              
            switch( args[1] ) {
                case "x" :
                    System.out.println(v1 + " x " + v2 + " = " + (v1 * v2));
                    break;
                
                case "+" :
                    System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
                    break;
                    
                case "-" :
                    System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
                    break;
                
        }
        }

        

    }
}



