import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * A interface Stream possui um método denominado map().
 * 
 * O método map() recebe como argumento um objeto da interface funcional Function<T, R> - T é o tipo de dados que a instância do tipo da interface Function recebe, e o R é o tipo que ela retorna -, cujo método abstrato é o R apply(T t);;
 * 
 * O método map() quando chamado por uma instância de Stream, passa individualmente cada elemento da stream como argumento para o método apply() implementado da instancia da interface Function enquanto o chama.
 * 
 * O método apply() por sua vez realiza o que deve ser realizado com o valor recebido e retorna o que deve ser retornado de acordo com sua implementação.
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

public class MapEmJava {
    
    public static void main(String[] args) {
        Function<Aluno, Integer> minhaFuncao = new Function<Aluno, Integer>() 
        {
            public Integer apply(Aluno aluno) {
                return aluno.nota < 7? 7 : aluno.nota; 
            }
        };
        
        List<Aluno> turma = Arrays.asList(
            
            new Aluno("Ricardo", 10),
            new Aluno("Agusto", 6),
            new Aluno("Cristofe", 3),
            new Aluno("Ivo", 11)
        );

        Stream<Aluno> alunos = turma.stream();
        

        //map() chama aplly() da instancia "minhaFuncao" passando os elementos da Stream como argumentos
        Stream<Integer> notas = alunos.map(minhaFuncao);

        System.out.println("=== NOTAS ===\n");
        notas.forEach(nota -> System.out.println(nota));

        System.out.println();

        /**
         * Tendo em vista que o map() recebe uma instância de Function, logo podemos fazer isso:
         * 
         */

        Stream<Integer> notas2 = turma.stream().map(
            new Function<Aluno, Integer>() 
            {
                public Integer apply(Aluno aluno) {
                    return aluno.nota < 7? 7 : aluno.nota; 
                };
            }
        );

        System.out.println("=== NOTAS DOS ALUNOS ===\n");
        notas2.forEach(nota -> System.out.println(nota));

        System.out.println();

        /**
         * Logo podemos passar como argumento a expressão lambda equivalente à Inner Class de Function:
         * 
         */
        
        Stream<Integer> notas3 = turma.stream().map(aluno -> aluno.nota < 7? 7 : aluno.nota);

        System.out.println("=== TODAS AS NOTAS ===\n");
        notas3.forEach(nota -> System.out.println(nota));
    }
}