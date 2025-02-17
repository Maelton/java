# Sobreposição (Override)

Acontece quando implementamos de forma diferente um método em uma subclasse, utilizando o mesmo identificador (nome do método) e assinatura (quantidade e tipo de parametros) do método implementado na superclasse.

Exemplo:

```
class CalculadoraSimples {

    public void soma(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class CalculadoraAvancada extends CalculadoraSimples{

    public void soma(int n1, int n2) {

        System.out.println(n1 + n2 + 1);
    }
}
```

&nbsp;

# Sobrecarga (Overload)

Acontece quando implementamos de formas diferente um método em uma dada classe, utilizando o mesmo identificador (nome do método) e assinatura (quantidade e tipo de parametros) diferentes para cada método.

Exemplo:

```
public class MethodOverload {

    public int sum(int a, int b) {
        System.out.println("Primeiro método");
        return a + b;
    }

    public int sum(int x, int y, int z) {
        System.out.println("Segundo método");
        return x + y + z;
    }

    public float sum(float x, float y) {
        System.out.println("Terceiro método");
        return x + y;
    }       
}
```
