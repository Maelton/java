class EnzoException extends Exception {

    EnzoException(String choro) {

        //Passando mensagem para o construtor da superclasse (classe Exception)
        super(choro);
    }
}

public class PersonalExceptionsEmJava {
    
    public static void main(String[] args) {

        try {
            throw new EnzoException("Aqui quem manda sou eu!\n");
        
        } catch (EnzoException e) {
            
            System.out.println(e);

            System.out.println("Ok, ok... Entendi, agora vah tomar um leitinho com canela vah.");
        }
    }
}
