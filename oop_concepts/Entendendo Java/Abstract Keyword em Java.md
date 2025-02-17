# Abstract Keyword em Java

O modificador "abstract" é um modificador de não acesso, utilizado em classes e métodos.

# Classes Abstratas em Java

As classes abstratas são classes restritas que não podem ser instanciadas.

Podem possuir atributos e métodos implementados, além de poderem ser extendidas/herdadas como qualquer outro tipo de classe, só não podem ser instanciadas diretamente. Apenas as subclasses que herdam a classe abstrata podem ser instanciadas, contanto é claro, que não sejam classes abstratas.

Além disso, as classes abstratas são capazes de possuir assinaturas de métodos abstratos.

# Métodos abstratos

As assinaturas dos métodos abstratos podem ser definidas em uma classe abstrata.

Um método abstrato não pode ser tanto default quanto abstract ao mesmo tempo. Quando um método em uma interface ou classe abstrata é marcado como default, ele fornece uma implementação padrão, o que significa que ele tem uma implementação concreta e não precisa ser implementado nas classes que implementam a interface ou extendem uma classe abstrata.

Métodos default não podem ser abstratos, pois eles já têm uma implementação padrão. Se você declarar um método como default, não há necessidade de marcá-lo como abstract.

Um método abstrato não deve nem pode ser implementado na própria classe abstrata que o possui, mas sim nas subclasses que extendem/herdam essa classe abstrata, obrigatoriamente.

Ou seja, qualquer subclasse que herde uma classe abstrata, deve obrigatoriamente implementar todos os seu métodos abstratos, com exceção é claro, que também seja uma classe abstrata.

Observe o exemplo abaixo:

```
abstract class Veiculo {

    public void tipoProduto() {
        System.out.println("Sou um meio de transporte.");
    }

    abstract void locomover();
}

class Carro extends Veiculo {

    public void locomover() {
        this.ligar();
        this.acelerar();
    }

    public void ligar() {
        System.out.println("Ligando veiculo...");
    };

    public void acelerar() {
        System.out.println("Pisando no acelerador...");
    }
}

public class ClassesAbstratas {
    
    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.locomover();
    }
}
```