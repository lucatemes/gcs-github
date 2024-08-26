
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private char genero;

    public Pessoa(String nome, String cpf, int idade, char genero){
        this.nome= nome;
        this.cpf =cpf;
        this.idade= idade;
        this.genero= genero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getGenero(){
        return genero;
    }
}
