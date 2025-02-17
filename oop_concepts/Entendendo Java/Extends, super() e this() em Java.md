# Extends em Java

A keyword "extends" em Java serve para aplicar herânça de atributos e métodos de uma classe a outra classe. Veja o exemplo abaixo em que A é superclasse de B:

**Código:**

```
class A {

    public A() {
        System.out.println("A (default)");
    }
}

class B extends A{

    public B() {
        System.out.println("B (default)");
    }
}

    public class ExemploDeExtends {
    
        public static void main(String[] args) {

            B letra1 = new B();
        }
}
```

**Saída de execução:**

![](images/super()-output.png)

Observe que após o instanciamento da classe B, o contrutor de A também foi chamado. Foi chamado inclusive, antes do contrutor da própria classe B, certo? 

Na verdade não, primeiramente o construtor da classe B foi chamado e depois imediatamente o construtor da classe A foi chamado pelo construtor da classe B, o conteúdo do construtor da clase A foi executado e posteriormente o conteúdo do escopo do construtor da classe B foi finalizado.

Isso ocorreu por causa do método super(), que está implicito em todo e qualquer construtor de qualquer classe Java.

***Curiosidade:*** Embora Java suporte herança de multiplos níveis, por exemplo, a classe C herda da classe B, que por sua vez herda de A, que por sua vez herda de Object... Java não suporta herança multipla, ou seja, a classe C não pode herdar de A e também herdar de B diretamente e ao mesmo tempo. Para resolver esse impasse, o Java utiliza-se de um conceito muito interessante e útil, as interfaces.

# Método super()

Mesmo que não mencionado (explicitamente codificado pelo programador), todo construtor Java chama o método super(). 

O método super() é a primeira declaração de um construtor em Java e serve para chamar o construtor da superclasse da classe atual.

Por isso as declarações feitas dentro do construtor da classe A executaram primeiro que as declarações do construtor de B.

Sendo assim, o cógido exibido acima é igual ao código abaixo:

```
class A {

    public A() {
        super();

        System.out.println("A (default)");
    }
}

class B extends A{

    public B() {
        super();

        System.out.println("B (default)");
    }
}

    public class ExemploDeExtends {
    
        public static void main(String[] args) {

            B letra1 = new B();
        }
}
```

Sendo assim, o super() dentro do construtor de B chama o construtor de A, que por sua vez tem outro super() que chama o construtor da superclasse de A.

Em Java, por padrão, toda classe herda de uma classe denominada Object, sendo assim, embora nenhuma herança tenha sido aplicada à classe A se utilizando da keyword "extends" como na classe B, A é por padrão subclasse de Object.

Podemos passar argumentos ao método super(), fornecendo assim, argumentos para o construtor da superclasse, observe o exemplo abaixo:

**Código:**

```
class A {

    public A() {
        System.out.println("A (default)");
    }

    public A(int numero) {
        System.out.println("A (parametrizado)");
    }
}

class B extends A{

    public B(int numero) {

        super(numero);

        System.out.println("B (parametrizado)");
    }
}

    public class ExtendsSuperEThis {
    
        public static void main(String[] args) {
            B letra1 = new B(10);
    }
}
```

**Saída de execução:**

![](images/super()-output2.png)

Observe que embora a classe A possua dois contrutores, um padrão e outro parametrizado, o construtor parametrizado foi chamado pelo método super() da classe B, sendo assim, os argumentos foram corretamente fornecidos à classe A.

# Método this()

O método this() serve para fazer referência ao próprio construtor da classe atual.

Sendo assim, podemos utilizar esse método em um contrutor parametrizado de uma classe para que quando ele seja chamado, também chame o construtor padrão da própria classe.

Observe o exemplo abaixo:

**Código:**

```
class Conta {

    public Conta() {
        System.out.println("Conta (contrutor default)");
    }

    public Conta(int numero) {
        this();

        System.out.println("Conta (construtor parametrizado)");
    }
}

    public class ExtendsSuperEThis {
    
        public static void main(String[] args) {
            Conta poupanca = new Conta(10);
    }
}
```

**Saída de execução:**

![](images/this()-output.png)

Observe que o construtor parametrizado da classe Conta foi chamado o método this() chamou o método padrão da classe.