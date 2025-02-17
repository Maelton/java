class Carro {

    String chassi;

    //Overrided from Object()
    public String toString() {
        return "Carro";
    }

    //Overrided from Object()
    public boolean equals(Carro carro) {

        return this.chassi == carro.chassi;
    }
}

public class ClasseObject {

    public static void main(String[] args) {

        Carro celta = new Carro();
        celta.chassi = "123";

        Carro hb20 = new Carro();
        hb20.chassi = "123";

        System.out.println(celta);
        System.out.println(celta.equals(hb20));
    }
}