import java.util.Scanner;
public class App{
    public static void main(String []args){
        /*
         * O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em tablets, 
         * para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar,  
         * cliente1 informe seu nome, cpf, idade e gênero. A qualquer momento, ele deseja ser capaz de consultar 
         * quem são as pessoas que estão no bar, se alguém com um determinado CPF está no bar, 
         * quantas são as pessoas e qual a distribuição por gênero (percentual de clientes masculinos e femininos). 
         * Ao sair, o cliente deve informar seu CPF, para registrar sua saída.   
         * Modele este sistema (defina classes, com seus atributos e métodos) e implemente-o.
         */

        RedeBar rede1 = new RedeBar();
        Scanner in = new Scanner(System.in);
        int rodando= 1;

        while (rodando == 1) {
            System.out.println("0 - Sair do menu.");
            System.out.println("1 - Entrar no bar:");
            System.out.println("2 - Listar clientes:");
            System.out.println("3 - Buscar por CPF:");
            System.out.println("4 - Distribuição de genêro:");
            System.out.println("5 - Sair do bar usando CPF:");
            int resposta= in.nextInt();
            switch(resposta){
                case 0:
                    rodando= 0;
                    break;
                case 1:
                    rede1.entrar();
                    break;
                case 2: 
                    rede1.listar();
                    break;
                case 3:
                    System.out.println("Digite o CPF para busca:");
                    in.nextLine();
                    String cpf1= in.nextLine();
                    rede1.buscarPorCpf(cpf1);
                    break;
                case 4:
                    rede1.divisaoPorGenero();
                    break;
                case 5:
                        System.out.println("Digite seu CPF:");
                        in.nextLine();
                        String cpf= in.nextLine();
                        rede1.sair(cpf);
                    break;
                default:
                        System.out.println("Opção indisponível.");
                    break;
            }
            
        }


    }
}