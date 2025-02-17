import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * O Comparator é um conceito ou interface que você pode utilizar para especificar sua própria lógica para ordenação de coleções.
 * 
 */

/**
 * A classe Collections possui multiplos métodos, um deles é denominado sort(), que recebe como argumento a coleção que você deseja ordenar.
 * 
 * Com o método Collections.sort() é possível ordenar valores de uma coleção de acordo com a sua própria lógica.
 * 
 * Para modificar a lógica padrão de ordenamento do sort() basta passar também como argumento um objeto da interface Comparator. A functional interface Comparator possui como método abstrato o método compare(), onde você pode implementar sua lógica de comparação entre dois números.
 * 
 * O sort() segue o algorítmo de ordenação Bubble Sort, sendo assim, implemente o compare() determinando quando o sort() deve trocar ou não dois elementos de posição. Se você desejar trocar dois elementos de posição de acordo com determinada condição, retorne 1, caso não retorne -1.
 */

public class ComparatorEmJava {

    public static void main(String[] args) {
        /**
         * Nesse exemplo desejamos ordenar os valores inteiros do array levando em consideração seu último dígito.
         */

        /**
         * Comparador com INNER CLASS
         *
         Comparator<Integer> meuComparador = new Comparator<Integer>()
        {
            public int compare(Integer n1, Integer n2) {
                //Se um numero for maior que o proximo: Troque eles de posicao
                if(n1%10 > n2%10)
                    return 1;
                //Se nao, nao troque
                else
                    return -1;
            }
        };
        */
        Comparator<Integer> meuComparador = (n1, n2) -> n1%10 > n2%10 ? 1 : -1;

        List<Integer> meuArrayList = new ArrayList<Integer>();

        meuArrayList.add(12);
        meuArrayList.add(47);
        meuArrayList.add(83);
        meuArrayList.add(61);
        meuArrayList.add(9);

        //Collections.sort(meuArrayList, meuComparador);
        meuArrayList.sort(meuComparador);
        
        System.out.println(meuArrayList);

    }
}
