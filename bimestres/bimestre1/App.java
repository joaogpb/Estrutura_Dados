import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws PilhaVaziaException, PilhaCheiaException{
        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<>();

        boolean maisContatos = false; 
        Scanner leitor = new Scanner(System.in); 
        Contato d = new Contato(0, null, null, null);
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
                    d.criarContato();
                    
                    break;
                case 2:
                    d.editar();
                    break;
                case 3:
                    d.desfazer();
                    break;
                case 4:
                   d.excluir();
                    break;
                case 5:
                    d.exibir();
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
