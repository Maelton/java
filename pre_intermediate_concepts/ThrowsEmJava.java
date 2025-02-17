class A {

    //Caso a exception ocorra, o método envia a exceção para o outter method tratar
    public static void divisaoPorZero() throws ArithmeticException {
        
        System.out.println("10 por 0 eh " + 10/0);
    }
}

public class ThrowsEmJava{

    public static void main(String[] args) {

        try {
            A.divisaoPorZero();
            
        } catch(ArithmeticException e) {

            System.out.println(e + "\nCalma borboleto, eu ja esperava essa exception");
        }
    }
}