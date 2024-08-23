public class Pessoa {
    private String nome;
    private int cpf;
    private int idade;
    private String genero;

    public Pessoa(String nome, int cpf, int idade, String genero){
        this.nome= nome;
        this.cpf =cpf;
        this.idade= idade;
        this.genero= genero;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
