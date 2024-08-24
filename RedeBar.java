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
            in.nextLine();
            String nome = in.nextLine();
            System.out.println("Cpf:");
            String cpf = in.nextLine();
            System.out.println("Idade:");
            int idade= in.nextInt();    
            System.out.println("Genêro (F/M):");
            char genero= in.next().charAt(0);
            Pessoa cliente= new Pessoa(nome, cpf, idade, genero);
            pessoa.add(cliente);
            i++;
        }
    }

    public void listarClientes(){
        for(int i=0; i < pessoa.size(); i++){
            System.out.println("Cliente " + i);
            System.out.println(pessoa.get(i).getNome());
            System.out.print("CPF: ");
            System.out.println(pessoa.get(i).getCpf());
            System.out.print("Idade: ");
            System.out.println(pessoa.get(i).getIdade());;
            System.out.print("Genêro: ");
            System.out.println(pessoa.get(i).getGenero());;
            System.out.println("----------------------");
        }
    }


}
