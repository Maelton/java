# Polimorfismo em Programação Orientada a Objetos (POO)

A palavra polimorfismo é originada do grego e significa muitas formas de se fazer algo (poli significa muitas, morfo significa forma).

O polimorfismo permite que um mesmo nome represente várias comportamentos diferentes. Um bom exemplo de polimorfismo em Java é uma classe abstrata e seus respectivos métodos, tendo em vista que os métodos podem ser implementados por diferentes classes de diferentes maneiras, o que permite que instâncias de classes diferentes chamem o método de mesma assinatura e obtenham diferentes comportamentos.

Polimorfismo é um dos conceitos mais importantes em POO, sendo considerado um dos quatro pilares do paradigma orientado a objetos, juntamente com a abstração, herança e encapsulamento.

Os dois tipos principais de polimorfismo na programação são: O polimorfismo em tempo de compilação (compile time polymorphism, AKA, early binding) e o polimorfismo em tempo de execução (runtime polymorphism, AKA, late binding).

&nbsp;

# Runtime Polymorphism (Late Binding)

Um bom exemplo desse tipo de polimorfismo é a sobreposição (override). Onde os mesmos nomes de métodos (chamarei de identificadores) e assinaturas são utilizada nas diferentes implementações realizadas em diferentes subclasses que herdam o método de uma dada superclasse. Ou seja, métodos de mesmo identificadores e assinaturas, em diferentes classes, passam a poder ter comportamentos diferentes.

Quando você cria uma sobreposição, diferentes implementações de um método de indentificador e assinatur igual são implementadas em diferentes classes. 

A priore o computador não sabe qual será a implementação executada, se a presente na superclasse ou subclasse. Isso será decidido em tempo de execução assim que o método for chamado.

Uma vez que o método for chamado por uma dada instância - essa instância estará armazenada na memória heap, uma vez que é um objeto e não um método -, a classe do objeto (e não o tipo) irá determinar qual implementação será executada, isso é denominado disparo dinâmico de método (dynamic method dispatch).

Observe o exemplo abaixo:

**Código:**

```
class Veiculo {

    public void acelerar() {
        System.out.println("Acionando dispositivo de aceleração.");
    }
}

class Carro extends Veiculo {

    public void acelerar() {
        System.out.println("Pisando no acelerador.");
    }
}

public class ExemplosDePolimorfismo {
    
    public static void main(String[] args) {
        Veiculo celta = new Carro();

        celta.acelerar();
    }
}
```

**Saída de execução:**

![](images/overriding-output.png)

Observe que mesmo que o objeto "celta" tenha sido definido como sendo do tipo Veiculo, o objeto foi incializado com a implementação da classe "Carro". Logo quando o método acelerar() é chamado, a escolha de qual implementação do método executar é determinada, em tempo de execução, como sendo a existente dentro da classe "Carro" e não a implementação existente no tipo do objeto, nesse exemplo, a classe "Veiculo".

&nbsp;

# Compile Time Polymorphism (Early Biding)

Um bom exemplo desse tipo de polimorfismo é a sobrecarga (overload). Onde os mesmos nomes de métodos (chamarei de identificadores), porém assinaturas diferentes, são utilizados nas diferentes implementações realizadas em uma dada classe. Ou seja, métodos de mesmo identificadores e assinaturas distintas, presentens em uma mesma classe passam a poder ter comportamentos diferentes.

A priore o computador não sabe qual será a implementação executada, se a presente na superclasse ou subclasse. Isso será decidido em tempo de execução assim que o método for chamado.

Uma vez que as assinaturas dos métodos - de mesmo identificador - existentes em uma mesma classe são distintas, no momento de chamada do método, o computador já sabe qual implementação do método irá executar. Logo, esse tipo de polimorfismo pode ser executado em tempo de compilação.