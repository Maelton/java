public class Literais {
    /**
     * Em ciência da computação, um literal é uma notação para representar um valor fixo no código fonte.
     */

     public static void main(String[] args) {

        //---------- REPRESENTANDO NUMEROS GRANDES ----------

        double n = 1e1; //Util para representar numeros grandes: XeY = X * 10^Y
        System.out.println("1e1 = 1 * 10^1 = " + n);

        float n1 = 10e1f;
        System.out.println("10e1 = 10 * 10^1 = " + n1);

        System.out.println();

        //---------- REPRESENTANDO NUMEROS BINARIOS ----------

        int numeroCinco = 0b101; //Utilize "0b" antes do numero (em base binaria) que deseja representar
        System.out.println("0b101 (101 = 5) = " + numeroCinco);

        System.out.println();

        //---------- REPRESENTANDO NUMEROS HEXADECIMAIS ----------

        int numeroQuinze = 0xF; //Utilize "0x" antes do numero (em base hexadecimal) que deseja representar
        System.out.println("0xF (F = 15) = " + numeroQuinze);

        System.out.println();

        //---------- REPRESENTANDO NUMEROS HEXADECIMAIS ----------

        char letra = 'a';

        System.out.println("char 'a' + int 1 = char 'b'.");
        System.out.println("letra antes do incremento = " + letra);

        letra++; //É possível incrementar variáveis do tipo char (caractere) em Java

        System.out.println("letra depois do incremento = " + letra);

        System.out.println();

        //---------- UNDERSCORES PARA FACILITAR A VISUALIZAÇÃO ----------

        /**
         * Em Java é possível utilizar underscores (_) para separar dígitos de uma variável.
         * 
         * O funcionamento do valor da variável não é afetado em nada, o uso de underscores nos literais números servem apenas para fins de visualização.
         */

        int a = 2_0_0_0_0;
        System.out.println(a); //Independentemente do uso dos underscores, o numero retornado sera 20000

        int b = 3_350_941;
        System.out.println(b);

        //---------- VARIAVEIS DO TIPO BOOLEAN ----------

        /**
         * Em Java, diferentemente de outras linguagens, variáveis do tipo boolean não convertem valores numérios para true ou false no momento de sua inicialização.
         * 
         * Logo, nao tente isso:
         * 
         * boolean var = 1;
         */
    }
}
