public class ExceptionThrowEmJava {

    public static void main(String[] args) {

        try {

            int x = 10/10;
            System.out.println("10 por 10 eh " + x);
            System.out.println("A divisao funcionou mas...\n");

            if(x==1) throw new ArithmeticException("An exception has been thrown by the programmer itself\n");
        
        } catch (ArithmeticException e) {
            
            System.out.println(e);
            System.out.println("Quero uma excecao mesmo assim.");
        }
    }
}