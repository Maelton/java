# Anotações (Annotations) em Java

Anotações são acréscimos ao cógido fonte adicionados para o compilador ou runtime, também são chamadas de metadados.

Utilizadas quando queremos interagir com o compilador ou com o runtime dizendo alguma informação. Anotações não alteram a maneira com que o código funciona, apenas fornecem informações extras para o compilador ou runtime.

Quando escrevemos anotações também podemos especificar suas intenções definindo seu nível, se é uma anotação a nível de compilação ou a nível de execução.

Se a anotação for definida como a nível de compilação, a compilação não fará mais sentido após a compilação. Ao contrário, caso especificada também para nível de execução, quando a compilação for finalizada e o código estiver sendo executado a anotação ainda será aplicável.

# Exemplo de Uso com *@Override*

Imagine que queremos realizar uma sobrescrição de método entre uma superclasse e uma subclasse.

Porém, não prestamos atenção e escrevemos o nome do método incorretamente enquanto o definimos na subclasse. Logo, não houve a sobrescrição do método na subclasse mas sim a definição de um outro método.

Se tivessemos utilizado a annotation ***@Override*** que serve para sinalizar que pretendemos sobrescrever um método, um erro ocorreria e seriamos sinalizados que o métodos que definimos não existe na superclasse e por consequencia disso não pode ser sobrescrito.

Em pequenos projetos as annotations podem não ser de grande utilidade, mas em grandes projetos onde bugs como esse, gerados por um simples nome errado de um método, podem representar uma tremenda dor de cabeça, então o uso das annotations é uma prática válida e recomendada.

**Código:**

```
class A {

    public void apresentacao() {
        System.out.println("Sou da classe A.");
    }
}

class B extends A {

    @Override
    public void apresentacao() {
        System.out.println("Sou da classe B.");
    }
}

public class ExemploDeAnnotation {
    public static void main(String[] args) {
    
    }
}
```