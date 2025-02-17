class Pessoa {

    private String nome;
    private String cpf;
    private String mae;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    /**
     * Construtores são métodos especiais chamados no momento instanciamento de uma classe. Sendo assim, sempre que criamos uma nova instância de uma dada classe, seu construtor será chamado.
     * 
     * Em Java, construtores devem ter o mesmo nome que sua classe e podem ser parametizados ou não, ou seja, receber ou não parâmetros e consequetemente exigir ou não argumentos no momento de instânciamento.
     * 
     * Abaixo temos dois construtores para a classe "Pessoa", um deles com valores padrão, caso o usuário não especifique nenhum argumento no momento de instanciamento, e um parametizado, possibilitando que o usuário especifique os valores das variáveis de instância no momento de criação do objeto. 
     */

    //Aqui, utilizamos o conceito de method overload para duplicar construtores.
    //Um parametrizado e outro não.

    public Pessoa() {
        this.nome = "- - -";
        this.cpf = "_ _ _._ _ _._ _ _-_ _";
        this.mae = "- - -";
    }

    public Pessoa(String nome, String cpf, String mae) {
        this.nome = nome;
        this.cpf = cpf;
        this.mae = mae;
    }

}

public class ConstrutorEmJava {
    
    public static void main(String[] args) {

        //Utiliza o construtor parametrizado
        Pessoa professora = new Pessoa("Wladia", "12345678910", "Wladia I");
        System.out.println(professora.getNome() + " : " + professora.getCpf());

        //Utiliza o construtor default
        Pessoa professora2 = new Pessoa();
        System.out.println(professora2.getNome() + " : " + professora2.getCpf());
    }
}
