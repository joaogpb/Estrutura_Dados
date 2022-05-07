import java.util.Scanner;


public class PilhaEstatica {
    private Contato dados[];
    private int topo;

    public PilhaEstatica(int tamanho) {
        dados = new Contato[tamanho];
        topo = 0;
    }

    public boolean vazia() {
        return topo == 0;
    }

    public boolean cheia() {
        return dados.length == topo;
    }

    public void push(Contato valor) throws PilhaCheiaException {
        if (cheia()) {
            throw new PilhaCheiaException();
        }
        dados[topo++] = valor;

    }

    public Object pop() throws PilhaVaziaException {
        if (vazia()) {
            throw new PilhaVaziaException();
        }

        Object valor = dados[topo--];
        dados[topo] = null;
        return valor;
    }

    public static void main(String[] args) throws PilhaVaziaException, PilhaCheiaException {
        PilhaEstatica pilha = new PilhaEstatica(10);

        try (Scanner scanner = new Scanner(System.in)) {
            while (!pilha.cheia()) {
                System.out.print("Informe um valor numerico: ");
                int dados = scanner.nextInt();
                pilha.push(dados);
            }
        }
        while (pilha.vazia()) {
            System.out.print(pilha.pop());
        }
    }

}