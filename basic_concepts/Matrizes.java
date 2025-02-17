public class Matrizes {
    
    public static void main(String[] args) {

        //Criando uma matriz de arrays ou array multi-dimensional
        int predio[][] = new int[7][4];

        /**
         * Nossa matriz representa um predio de 7 andares, e 4 apartamentos em cada um dos andares.
         * 
         * predio = {
         * 
         * [ [], [], [], [] ],
         * [ [], [], [], [] ],
         * [ [], [], [], [] ],
         * [ [], [], [], [] ],
         * [ [], [], [], [] ],
         * [ [], [], [], [] ],
         * [ [], [], [], [] ]
         * 
         * }
         */

        //No terceiro apartamento do 6 andar, moram 4 pessoas
        predio[5][2] = 4;

        //-----------------------------------------------------------//

        int condominio[][] = geraMatrizAleatoria(10, 5);
        mostraMatriz(condominio);

    }

    public static int[][] geraMatrizAleatoria(int numeroLinhas, int numeroColunas) {

        int matriz[][] = new int[numeroLinhas][numeroColunas];

        for (int linha=0; linha < numeroLinhas; linha++) {
            
            for (int coluna = 0; coluna < numeroColunas; coluna++) {

                matriz[linha][coluna] = (int) (Math.random() * 10);
            }
        }

        return matriz;
    }

    public static void mostraMatriz(int matriz[][]) {
        
        //------------- ENHANCED FOR LOOP -------------//
        
        //linha é referencia para arrays da matriz
        for(int linha[] : matriz) {

            //coluna é copia do elemento da matriz
            for(int coluna : linha) {

                System.out.print(coluna + " ");
            }

            System.out.println();
        }
    }
}
