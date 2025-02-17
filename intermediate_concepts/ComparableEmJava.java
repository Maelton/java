import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Caso você possua uma classe e deseje que ela tenha uma implementação de lógica default para o método sort(), você precisa definir que essa class é comparável, você fará isso implementando a interface funcional Comparable em sua classe.
 * 
 * O método abstrato da interface Comparable é o public int compareTo(T o), que deverá ser implementado na sua classe de acordo com a lógica de comparação desejada.
 * 
 * Logo após é so usar o metodo Collections.sort() passando como argumento a o identificador da coleção que contem as instâncias da sua classe.
 * 
 */

class Aluno implements Comparable<Aluno>{

    String nome;
    int nota;

    //Definindo logia para Collections.sort(), ordenando por nota
    public int compareTo(Aluno aluno) {
        return this.nota > aluno.nota?  1 : -1;
    }

    Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

}
public class ComparableEmJava {
    
    public static void main(String[] args) {

        List<Aluno> turma = new ArrayList<Aluno>();

        turma.add(new Aluno("Ricardo", 10));
        turma.add(new Aluno("Agusto", 6));
        turma.add(new Aluno("Cristofe", 3));
        turma.add(new Aluno("Ivo", 11));
        
        System.out.println("====== ANTES DA ORDENACAO ======\n");
        
        for(Aluno aluno : turma) {
            System.out.println(aluno.nome + ":" + aluno.nota);
        }

        System.out.println("\n====== DEPOIS DA ORDENACAO =====\n");

        Collections.sort(turma);

        for(Aluno aluno : turma) {
            System.out.println(aluno.nome + ":" + aluno.nota);
        }
    }
}
