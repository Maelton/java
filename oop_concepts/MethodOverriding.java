/**
 * O conceito de Method Override consiste em reescrever em uma subclasse, um método herdado, utilizando a mesma assinatura - a assinatura de um método é relacionada à sua quantidade de parametros e tipos, ou seja, dois métodos com os mesmos tipos e as mesmas quantidades de parametros, possuem a mesma assinatura - existente na superclasse.
 * 
 * Quando o método sobreposto é chamado, será executado o método da classe atual ou de nível mais próximo à classe instânciada.
 * 
 * Para esclarecimento de possíveis dúvidas, observe o exemplo abaixo e as operações realizadas com o objeto "minhaCalculadora".
 */

class CalculadoraSimples {

    public void soma(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void subtrai(int n1, int n2) {
        System.out.println(n1 - n2);
    }
}

class CalculadoraAvancada extends CalculadoraSimples{

    //Mesmo identificador, mesma assinatura, e implementação distinta
    public void soma(int n1, int n2) {

        System.out.println(n1 + n2 + 1);
    }

    //mesmo identificador e assinatura diferente (quantidades de parametros)
    public void subtrai(int n1, int n2, int n3) {
        System.out.println(n1 - n2 + n3);
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        CalculadoraAvancada minhaCalculadora = new CalculadoraAvancada();

        //CalculadoraAvancada.soma()
        minhaCalculadora.soma(1, 2);

        //CalculadoraSimples.subtrai()
        minhaCalculadora.subtrai(10, 5);

        //CalculadoraAvancada.subtrai()
        minhaCalculadora.subtrai(10, 5, 3);
    }
}