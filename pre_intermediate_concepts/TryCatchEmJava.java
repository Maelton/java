public class TryCatchEmJava {
    
    public static void main(String[] args) {
        
        byte numerador = 10;
        byte denominador = 0;

        System.out.println("Enzo: Olha soh, eu descobri! 10 dividido por 0 eh...");
        
        try {

            System.out.println(numerador/denominador);

        } catch(Exception e) {

            System.out.println("\nProfessor: Ora ora, temos um novo Einstein aqui, nao eh mesmo?");
        }

        System.out.println("Ai ai, e o salario oh...");
    }
}
