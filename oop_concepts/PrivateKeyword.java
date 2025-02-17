class Pessoa {

    /**
     * Atributos privados, definidos pela keyword "private", só podem ser acessados pela própria classe.
     * 
     * Toda vez que um atributo de instância é criado é fortemente recomendável que esse atributo seja privado.
     * 
     * Nada fora da classe pode acessar os atributos privados, ao menos não diretamente. Por isso existem os métodos públicos getters e setters.
     */

    private String nome;
    private String dataNascimento;

    public String getNome() { return nome; };
    public void setNome(String n) { nome = n; };

    public String getDataNascimento() { return dataNascimento; };
    public void setDataNascimento(String data) { dataNascimento = data; };

}

public class PrivateKeyword {

    public static void main(String[] args) {

        Pessoa brazilian = new Pessoa();

        //Acessando indiretamente os atributos de instância privados

        brazilian.setNome("Felpa");
        brazilian.setDataNascimento("07/11/2002");

        System.out.println(brazilian.getNome() + " " + brazilian.getDataNascimento());
    }
}