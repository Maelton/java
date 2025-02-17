import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithEmJava {
    
    public static void main(String[] args) {

        //=============== Código sem Try With Resources ===============//

        BufferedReader br = null;
        try {

            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(br.readLine());

            br.close();

            System.out.println("Idade digitada: " + idade);
            
        } catch(IOException e) {

            System.out.println("Calma cenouro");

        } finally {

            try {
                br.close();
            } catch(IOException e) {
                System.out.println("Calma jiboio");
            }
        }

        //=============================================================//

        //=============== Código com Try With Resources ===============//

        /***
         * O Try With fecha automaticamente todos os recursos após o término de execução do bloco try, ou seja, não precisamos utilizar o finally para nós ajudar a fechar o recurso em caso de exceções.
         * 
         * Embora o finally seja interessante caso o programador deseje saber quais recursos ele estará fechando, ou quando ele estiver trabalhando em um cenário com mútiplos objetos criados.
         * 
         * De qualquer forma, fica a critério do programador escolher qual a abordagem mais adequada para o seu contexto.
         */

        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(br2.readLine());

            br2.close();

            System.out.println("Idade digitada: " + idade);
            
        } catch(IOException e) {

        System.out.println("Calma lagartixo");
        }
    }
}
