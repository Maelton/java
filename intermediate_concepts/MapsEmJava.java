import java.util.Map;
import java.util.HashMap;

public class MapsEmJava {
    
    public static void main(String[] args) {

        Map<String, Float> alunos = new HashMap<String, Float>();

        /**
         * Além do HashMap existe o HashTable, que é mesma estrutura porém é synchronized (thread safe).
         * 
         * O HashMap é unsynchronized (pode ser acessado e manipulado por multiplas threads ao mesmo tempo) e permite valores nulos.
         */

        alunos.put("Ricardo", 10f);
        alunos.put("Wladia", 10f);
        alunos.put("Ivo", 11f);

        System.out.println(alunos);
    }
}
