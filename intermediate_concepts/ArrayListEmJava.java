import java.util.List;
import java.util.ArrayList;

class Aluno {
    String nome;
    float nota;

    Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class ArrayListEmJava {

    public static void main(String[] args) {
        
        List<Aluno> turma = new ArrayList<Aluno>();

        turma.add(new Aluno("Ricardo", 10));
        turma.add(new Aluno("Wladia", 10));
        turma.add(new Aluno("Ivo", 11));

        System.out.println("\n" + turma + "\n");

        for(Aluno aluno : turma) {
            
            System.out.println(
                turma.indexOf(aluno) + " - " + 
                aluno.nome + ": " + 
                aluno.nota);
        }
    }
}