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

        rede1.abrirBar();
        rede1.listarClientes();


    }
}