import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Iterator;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<>();

        boolean maisJogadores = false; 

        while(true) {
            System.out.println("Menu de opções");
            System.out.println("1 - Incluir contato");
            System.out.println("2 - Alterar contato");
            System.out.println("3 - Desfazer última alteração do contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Listar contatos");
            System.out.println("6 - Sair");

            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do Contato: ");
                    String nome = scan.next();

                    System.out.println("Informe o  Email: ");
                    String email = scan.next();
        
                    System.out.println("Informe o  telefone: ");
                    int telefone = scan.nextInt();
        
                    Contato contato = new Contato(nome,email,telefone);
                    lista.add(contato);
                    break;
                case 2:

                    break;
                
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    for (Contato c : lista) {
                        System.out.println("Id: " + c.getId());
                        System.out.println("Nome: " + c.getNome());
                        System.out.println("Email: " + c.getEmail());
                        System.out.println("Email: " + c.getTelefone());
                    }
                    break;    
                case 6:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        
/*         do {
            System.out.println("Informe o nome do Contato: ");
            String nome = scan.next();

            System.out.println("Informe o  Email: ");
            String email = scan.next();

            System.out.println("Informe o  telefone: ");
            int telefone = scan.nextInt();

            System.out.println("Informe o Id da pessoa: ");
            int id = scan.nextInt();
            
            


            
        } while (maisJogadores);

        scan.close();

        //Ordenar o ranking
        Collections.sort(lista);

        System.out.println("----------- lista -----------");


        for (Contato game: lista) {
             System.out.println(game);
        } */
    }    
}
