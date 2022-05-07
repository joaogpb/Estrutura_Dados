import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws PilhaVaziaException, PilhaCheiaException, Contato{
        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<>();

        boolean maisContatos = false; 

        while(true) {
            System.out.println("Menu de opções");
            System.out.println("1 - Incluir contato");
            System.out.println("2 - Alterar contato");
            System.out.println("3 - Desfazer última alteração do contato");
            System.out.println("4 - Excluir todos os contatos");
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
                    String telefone = scan.next();
        
                    Contato contato = new Contato(nome,email,telefone);
                    lista.add(contato);
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    for(int i = 0; i <= 11; i++){
                        Contato.historico.pop();
                    }
                    System.out.println(Contato.historico.pop());
                    break;
                case 5:
                    for (Contato c : lista) {
                        System.out.println("Id: " + c.getId());
                        System.out.println("Nome: " + c.getNome());
                        System.out.println("Email: " + c.getEmail());
                        System.out.println("telefone: " + c.getTelefone());
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
    }
}
