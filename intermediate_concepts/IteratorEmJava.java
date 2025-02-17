import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class IteratorEmJava {
    
    public static void main(String[] args) {
        Set<Integer> notas = new HashSet<Integer>();

            notas.add(12);
            notas.add(26);
            notas.add(4);
            notas.add(19);
            notas.add(54);
            
        Iterator<Integer> meuIteradorDeNotas = notas.iterator();

        while(meuIteradorDeNotas.hasNext())
            System.out.println(meuIteradorDeNotas.next());

    }
}