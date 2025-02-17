import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;

/**
 * A interface Stream possui um método denominado filter().
 * 
 * O método filter() recebe como argumento um objeto da interface funcional Predicate, cujo método abstrato é o boolean test(T o);
 * 
 * O método filter() quando chamado por uma instância de Stream, passa individualmente cada elemento da stream como argumento para o método test() implementado da instancia da interface Predicate enquanto o chama.
 * 
 * Se test() retornar true, entao o valor adicionado à Stream de retorno, se false o valor não é adicionado.
 * 
 */

class Aluno {
    String nome;
    int nota;

    Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class FilterEmJava {
    
    public static void main(String[] args) {
        
        //Criando objeto da Inner Class da interface Consumer
        Predicate<Aluno> meuPredicado = new Predicate<Aluno>()
        {
            public boolean test(Aluno aluno) {
                return aluno.nota >= 7;
            }
        };
        
        List<Aluno> turma = Arrays.asList(
            
            new Aluno("Ricardo", 10),
            new Aluno("Agusto", 6),
            new Aluno("Cristofe", 3),
            new Aluno("Ivo", 11)
        );

        Stream<Aluno> alunos = turma.stream();

        //Chamando o método test() do objeto "meuPredicado" com cada elemento da stream 
        Stream<Aluno> alunosAprovados = alunos.filter(meuPredicado);

        System.out.println("=== APROVADOS ===\n");
        alunosAprovados.forEach(aluno -> System.out.println(aluno.nome));

        System.out.println();

        /**
         * Tendo em vista que o filter() recebe uma instância de Predicate, logo podemos fazer isso:
         * 
         */

        Stream<Aluno> alunosAprovados2 = turma.stream().filter(
            new Predicate<Aluno>()
                {
                    public boolean test(Aluno aluno) {
                        return aluno.nota >= 7;
                    };
                }
        );

        System.out.println("=== ALUNOS APROVADOS ===\n");
        alunosAprovados2.forEach(aluno -> System.out.println(aluno.nome));

        System.out.println();

        /**
         * Logo podemos passar como argumento a expressão lambda equivalente à Inner Class de Predicate:
         * 
         */
        
        Stream<Aluno> alunosAprovados3 = turma.stream().filter( aluno -> aluno.nota >= 7);

        System.out.println("=== APROVACAO DIRETA ===\n");
        alunosAprovados3.forEach(aluno -> System.out.println(aluno.nome));
    
    }
} 
