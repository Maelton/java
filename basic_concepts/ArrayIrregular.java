public class ArrayIrregular {
    
    public static void main(String[] args) {

        //Nos arrays irregulares ou jagged arrays, não especificamos a dimensão de um array na inicialização da variável mas sim em um inicialização posterior. Observe:

        //Não iremos especificar a dimensão das colunas da matriz durante esta inicialização da variável "matriz"
        int matriz[][] = new int[3][];

        //Mas sim, nessas inicialização
        matriz[0] = new int[8];
        matriz[1] = new int[4];
        //matriz[2] = new int[2]; -> Nesse caso, se não especificado, o tamanho do sub-array sera null, logo nao sera possivel armazenar nada no sub-array.

        System.out.println(matriz[1].length);

    }
}
