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

public class AbstractClasses {
    
    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.locomover();
    }
}
