abstract class Carro {

    abstract void ligar();
    abstract void desligar();
}

public class AbstractAnonymousInnerClasses {
    
    public static void main(String[] args) {

        /**
         * Utilizando classe interna anônima para não precisar criar uma classe concreta que herde da classe Carro, instaciar a subclasse e utilizar a instância.
         * 
         * Não estamos criando uma instância da classe abstrata, mas podemos instanciar a abstract anonymous inner class e implementar os metodos abstratos da classe Carro.
         * 
         * Para casos em que iremos utilizar uma instância de acordo com os requisitos de uma classe abstrata uma vez ou pouquíssimas vezes, esse recurso pode ser útil.
         */
        Carro celta = new Carro()
        {
            public void ligar() {
                System.out.println("Ligando carro...");
            };

            public void desligar() {
                System.out.println("Desligando carro...");
            }
        };

        celta.ligar();
        celta.desligar();
    }
}
