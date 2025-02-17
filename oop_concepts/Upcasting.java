class Veiculo {

    public void freiar() {
        System.out.println("Acionando recursos de atrito");
    }
}

class Carro extends Veiculo{


    public void freiar() {
        System.out.println("Pisando no freio do carro");
    }

    public void diminuirVelocidade(){
        System.out.println("Retirando o pe do acelerador");
    }
}

public class Upcasting {
    
    public static void main(String[] args) {
        
        /**
         * O upcasting acontecete implicitamente, de maneira automatica.
         * 
         * Logo "Veiculo hb20 = new Carro();" é o mesmo que "Veiculo hb20 = (Veiculo) new Carro();
         * 
         * No nosso exemplo, o upcasting so foi possível porque Carro() é subclasse de Veiculo().
         */

        //Veiculo hb20 = (Veiculo) new Carro();
        Veiculo hb20 = new Carro();

        /**
         * 
         * No exemplo acima, mesmo Carro() possuindo o método diminuirVelocida(), uma vez que o upcasting ocorreu e que o valor da instância hb20 foi convertida do tipo Carro para o tipo Veiculo, o método não poderá ser chamado pela instância.
         * 
         * Isso ocorre porque depois do upcasting, hb20 agora é do tipo Veiculo e a classe Veiculo() não tem nenhum método diminuirVelocidade() implementado.
         * 
         * Se a classe Veiculo() tivesse um método com a mesma assinatura, então, quando o método fosse chamado pela instancia cuja variavl é do tipo Veiculo mas o valor é um objeto da classe Carro(), ocorreria um override, e a implementação do método diminuirVelocidade() presente na classe Carro() iria sobrescrever a implementação na classe Veiculo().
         * 
         * Mas como Veiculo não possui esse método, e o typecasting ocorreu para a variável, mesmo que ela tenha como valor um objeto da classe Carro() que possui o método, o método não pode ser invocado, tendo em vista que a variável é do tipo Veiculo e a classe Veiculo() desconhece esse método.
         * 
         */
    }
}
