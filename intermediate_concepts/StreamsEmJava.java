import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Aluno {
    String nome;
    int nota;

    Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class StreamsEmJava {
    
    public static void main(String[] args) {
        
        List<Aluno> turma = Arrays.asList(
        
        new Aluno("Ricardo", 10),
        new Aluno("Agusto", 6),
        new Aluno("Cristofe", 3),
        new Aluno("Ivo", 11)
        );

        //========================== STREAM() ==========================//

        //stream() retorna uma instância da interface Stream<T>
        //Uma vez consumida a instancia de Stream nao podera ser utilizada novamente
        Stream<Aluno> copiaTurma = turma.stream();
        
        //========================== FILTER() ==========================//

        //filter() retorna objetos de acordo com a condição estabelecida
        Stream<Aluno> alunosAprovados = copiaTurma.filter(aluno -> aluno.nota >= 7);
        
        System.out.println("===== ALUNOS APROVADOS (MEDIA MAIOR/IGUAL A 7) =====\n");
        alunosAprovados.forEach(alunoAprovado -> System.out.println(alunoAprovado.nome));
        System.out.println();

        //Aprecie a beleza da programacao orientada a objetos
        Stream<Aluno> alunosReprovados = turma.stream().filter(aluno -> aluno.nota < 7);

        System.out.println("===== ALUNOS EM RECULPERACAO (MEDIA MENOR QUE 7) =====\n");
        alunosReprovados.forEach(alunoReprovado -> System.out.println(alunoReprovado.nome));
        System.out.println();

        //========================== MAP() ==========================//

        Stream<Aluno> alunosEmReculperacao = turma.stream().filter(aluno -> aluno.nota < 7);

        //O método map altera os valores de uma Stream object
        Stream<Aluno> alunosReculperados = alunosEmReculperacao.map(aluno -> 
            {
                Aluno alunoReculperado = new Aluno(aluno.nome, 7);
                return alunoReculperado;
            }
        );

        System.out.println("===== ALUNOS RECULPERADOS) =====\n");
        alunosReculperados.forEach(alunoReculperado -> 
            System.out.println(alunoReculperado.nome + ": " + alunoReculperado.nota)
        );

        //========================== REDUCE() ==========================//
        
        Stream<Integer> notas = turma.stream().map(aluno ->
            {
                return aluno.nota;
            }
        );

        int somatorioNotasTurma = notas.reduce(0, (i, j) -> i+j);
        System.out.println("\nSomatorio das notas da turma: " + somatorioNotasTurma);


    }
}
