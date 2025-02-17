public class ConversoesECasting {

    public static void main(String[] args) {

        int a = 5;
        System.out.println("int a = 5; :");
        System.out.println(a); System.out.println();

        System.out.println("float b = a; => Conversao implicita do tipo (int) para o tipo (float): ");
        float b = a;
        System.out.println(b); System.out.println();
        
        double c = 127;
        System.out.println("double c = 127; :");
        System.out.println(c); System.out.println();

        System.out.println(" byte d = (byte) c; => Conversao explicita - denominada casting - de (double) para (byte) :");
        byte d = (byte) c; 
        System.out.println(d); System.out.println();

        //*******************************************************************/

        /**
         * Quando convertemos um valor de um tipo para outro tipo cujo o range de valores é menor que o range de valores inicial, como por exemplo, converter um (int) 257 para uma variável (byte) cujo range vai de -128 a 127, uma operação é realizada para que a conversão funcione.
         * 
         * Em nosso exemplo, o que irá acontecer é que a variável do tipo byte será inicializada com o resultado do módulo de 257 (valor da variável int) por 256 (que é o valor de 2 elevando à quantidade de bits de uma variavel do tipo byte, que no caso é 8. Sendo asim, 2^8 = 256).
         * 
         * Logo na operação abaixo:
         * 
         * int x = 257;
         * byte y = (byte) x;
         * 
         * A variável y será igual a: 257 % 256 = 1
         * 
         * Dependendo do valor a ser convertido, outras operações podem ser realizadas com o valor a ser convertido e 256 para que o casting seja concluído com sucesso.
         */

         int x = 257;
         byte y = (byte) x;

         System.out.println("int x = 254;\n" +
                            "byte y = (byte) x;\n" +
                            "Eh igual a:\n");
         System.out.println(y);

        //*******************************************************************/

        //**************** PROMOÇÃO DE TIPO (TYPE PROMOTION) ****************/

        /**
         * A promoção de tipo ocorre quando valores de tipos de dados menores são temporariamente convertidos em tipos de dados maiores durante operações aritméticas ou outras operações. Isso é feito para garantir que as operações sejam realizadas com precisão e para evitar a perda de informações.
         * 
         * Como por exemplo a multiplicação do (byte) 10 vezes o (byte) 20, que resultará em 200. O resultado 200 não pode ser do tipo (byte), pois está fora do range de valores suportado por esse tipo de variável, logo esse resultado será promovido a outro tipo de variável.
         */

         byte i = 10;
         byte j = 20;

         System.out.println(i * j); System.out.println();

         byte n = 15;
         byte m = 3;

         int nPorM = n*m;
         System.out.println(nPorM);
    }
}