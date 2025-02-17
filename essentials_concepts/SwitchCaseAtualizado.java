public class SwitchCaseAtualizado {
    
    public static void main(String[] args) {

        /**
         * Algumas atualizações foram acrescentadas à condicional switch (switch-case), principalmente a partir do Java 12.
         * 
         * Possibilitando dentre outras coisas, o uso da sintax de flexa (arrow syntax) e o retorno de valores.
         */

        //---------- ARROW SYNTAX ----------//

        //A sintax de flexa (->) torna o break desnecessário

        String dia = "Segunda";

        switch(dia) {
            case "Segunda", "Quarta", "Sexta" -> System.out.println("Jiu-Jitsu");
            case "Terca", "Quinta" -> System.out.println("Musculacao");
            default -> System.out.println("Descanso");
        }


        //---------- RETORNANDO VALORES COM ARROW SYNTAX ----------//

        boolean finalDeSemana = switch(dia) {

            case "Segunda", "Terca", "Quarta", "Quinta", "Sexta" -> false;
            default -> true;
        };

        //---------- RETORNANDO VALORES SEM ARROW SYNTAX ----------//

        //Deve-se utilizar a keyword "yield", como se fosse um return

        boolean diaDeSemana = switch(dia) {

            case "Segunda", "Terca", "Quarta", "Quinta", "Sexta": yield true;
            default: yield false; 
        };
    }
}
