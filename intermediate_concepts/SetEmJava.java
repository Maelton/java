import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetEmJava {
    
    public static void main(String[] args) {
        Set<Integer> notas = new HashSet<Integer>();

        notas.add(12);
        notas.add(26);
        notas.add(4);
        notas.add(19);
        notas.add(54);

        Set<Integer> notas2 = new TreeSet<Integer>();
        
        notas2.addAll(notas);

        System.out.println("notas<HashSet>: " + notas);
        System.out.println("notas2<TreeSet>: " + notas2);
    }
}
