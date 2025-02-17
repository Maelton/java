class Veiculo {

    String chassi;

    public void freiar() {
        System.out.println("Acionando recursos de atrito");
    }
}

class Carro extends Veiculo{

    public void freiar() {
        System.out.println("Pisando no freio do carro");
    }

    public void acelerar() {
        System.out.println("Pisando no acelerador");
    }
}

public class Downcasting {
    
    public static void main(String[] args) {

        Veiculo celta = new Carro();
        celta.chassi = "123";
        
        //Downcasting para utilizar o método acelerar()
        Carro hb20 = (Carro) celta;
        hb20.acelerar();

        System.out.println("\nchassi hb20: " + hb20.chassi + "\n");

        //No downcasting a nova variável possui um tipo diferente, porém faz referência ao mesmo objeto
        celta.chassi = "321";
        System.out.println("\nchassi hb20: " + hb20.chassi + "\n");

        System.out.println("celta == hb20 --> " + celta.equals(hb20));

    }
}
