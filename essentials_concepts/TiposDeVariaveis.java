public class TiposDeVariaveis {
    
        //Ocupa 8 bits de memória, valor máximo é 127 e o mínimo é -128
        byte minhaVariavelByte;

        //Ocupa 16 bits de memória, valor máximo é 32.767 e o mínimo é -32.768
        short minhaVariavelShort;

        //Ocupa 32 bits de memória, valor máximo é 2.147.483.647 e o mínimo é -2.147.483.648
        int minhaVariavelInt;

        //Ocupa 64 bits de memória, representa numeros inteiros como byte, short e int
        long minhaVariavelLong = 10L;

        //Ocupa 32 bits de memória, representa numeros com casas decimais
        float minhaVariavelFloat = 5.6f;
        
        //Ocupa 64 bits de memória, representa numeros com casas decimais
        double minhaVariavelDouble = 7.8;

        //Ocupa 16 bits de memória e é capaz de representar um único unicode
        char minhaVariavelChar = 'v';
        
        /**
         * Caracteres em Java ocupam 2 bytes e não 1 byte (como na maioria das linguagens).
         * 
         * Isso ocorre porque o Java segue a tabela unicode e não a tabela ASCII.
         */

        //Ocupa 1 bit de memória, e pode ser true ou false
        boolean minhaVariavelBoolean = true;
        boolean minhaVariavelBooleanDois = false;

        String minhaStringDeCaracteres = "Hello World!";
}
