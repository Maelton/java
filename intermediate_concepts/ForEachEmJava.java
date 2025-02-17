import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

/**
 * A interface Iterable possui um método denominado forEach().
 * 
 * O método forEach() recebe como argumento um objeto da interface funcional Consumer<T>, cujo método abstrato é o void accept(T o);
 * 
 * O método forEach() quando chamado por uma coleção, passa individualmente cada elemento da coleção como argumento para o método accept() da instancia da interface Consumer enquanto o chama.
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

public class ForEachEmJava {
    
    public static void main(String[] args) {
        
        //Criando objeto da Inner Class da interface Consumer
        Consumer<Aluno> meuConsumidor = new Consumer<Aluno>()
        {
            public void accept(Aluno aluno) {
                System.out.println("Nota do(a) " + aluno.nome + " foi: " + aluno.nota);
            }
        };
        
        List<Aluno> turma = Arrays.asList(
            
            new Aluno("Ricardo", 10),
            new Aluno("Agusto", 6),
            new Aluno("Cristofe", 3),
            new Aluno("Ivo", 11)
        );

        //Chamando o método accept() do objeto "meuConsumidor" com cada elemento da colecao
        turma.forEach(meuConsumidor);

        System.out.println();

        /**
         * Tendo em vista que o forEach() recebe uma instância de Consumer, logo podemos fazer isso:
         * 
         */

         turma.forEach(
            new Consumer<Aluno>()
            {
            public void accept(Aluno aluno) {
                System.out.println("Nota do(a) " + aluno.nome + " foi: " + aluno.nota);
            }
            }
        );

        System.out.println();

        /**
         * Logo podemos passar como argumento a expressão lambda equivalente à Inner Class de Consumer:
         * 
         */
        
        turma.forEach(aluno -> System.out.println("Nota do(a) " + aluno.nome + " foi: " + aluno.nota));
    
    }
} 
