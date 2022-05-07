
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Contato extends Exception {
    private int id;

    private String nome;

    private String telefone;

    private String email;
        
    private static int CONTADOR = 0;

    public static PilhaEstatica historico = new PilhaEstatica(10);


    public Contato(String nome , String telefone, String email) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        
        Contato.CONTADOR++;
        this.setId(Contato.CONTADOR);
    }

    public void Global(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
