import java.util.ArrayList;
import java.util.Scanner;

public class RedeBar {
    private ArrayList<Pessoa> pessoa;

    public RedeBar() {
        
        this.pessoa = new ArrayList<>();
    }
    public void abrirBar(){
        int i=1;
        System.out.println("Bar aberto. Ao entrar no bar informe seus dados. (Digite a quantidade de pessoas que irão entrar no bar)");
        Scanner in = new Scanner(System.in);
        int qtd= in.nextInt();
        while(i <= qtd){
            System.out.println("Pessoa " + i);
            System.out.println("Nome:");
            String nome = in.nextLine();
            in.nextLine();
            System.out.println("Cpf:");
            int cpf = in.nextInt();
            System.out.println("Idade:");
            int idade= in.nextInt();    
            System.out.println("Genêro:");
            String genero= in.nextLine();
            in.nextLine();
            Pessoa cliente= new Pessoa(nome, cpf, idade, genero);
            pessoa.add(cliente);
            i++;
        }
    }

    public void listarClientes(){
        for(int i=0; i < pessoa.size(); i++){
            System.out.println(pessoa.get(i));
        }
    }


}
