import java.util.ArrayList;
import java.util.Scanner;

public class RedeBar {
    private ArrayList<Pessoa> pessoa;

    public RedeBar() {
        
        this.pessoa = new ArrayList<>();
    }
    public void entrar(){
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

    public void listar(){
        for(int i=0; i < pessoa.size(); i++){
            System.out.println("Cliente " + i);
            System.out.print("Nome: ");
            System.out.println(pessoa.get(i).getNome());
            System.out.print("CPF: ");
            System.out.println(pessoa.get(i).getCpf());
            System.out.print("Idade: ");
            System.out.println(pessoa.get(i).getIdade());
            System.out.print("Genêro: ");
            System.out.println(pessoa.get(i).getGenero());
            System.out.println("----------------------");
        }
    }

    public boolean sair(String cpf){
        for(Pessoa lista : pessoa){
            if(cpf.equals(lista.getCpf())){
                System.out.println(lista.getNome() + " saindo.");
                pessoa.remove(lista);
                return true;
            }
        }
        System.out.println("Nenhum cpf encontrado!");
        return false;
        
    }

    public boolean buscarPorCpf(String cpf){
        for(Pessoa lista : pessoa){
            if(cpf.equals(lista.getCpf())){
                System.out.print("Nome: ");
                System.out.println(lista.getNome());
                System.out.print("CPF: ");
                System.out.println(lista.getCpf());
                System.out.print("Idade: ");
                System.out.println(lista.getIdade());
                System.out.print("Genêro: ");
                System.out.println(lista.getGenero());
                System.out.println("----------------------");
                return true;
            }
        }
        System.out.println("Nenhum cpf encontrado!");
        return false;
        
    }

    public void divisaoPorGenero(){
        int m= 0;
        int f= 0;
        int total= 0;
        int porcentagemM;
        int porcentagemF;
        for(Pessoa lista : pessoa){
            if(lista.getGenero() == 'M'){
                m++;
            }else{
                f++;
            }
        }
        total = m + f;
        porcentagemM= (100 * m) / total;
        porcentagemF= 100 - porcentagemM;

        System.out.println("Clientes masculinos: " + porcentagemM + "%");
        System.out.println("Clientes femininos: " + porcentagemF + "%");
    }


}
