public class PilhaEstatica{
    private Contato vetor[];
    private int topo;


    public PilhaEstatica(int tamanho){
        vetor = new Contato[tamanho];

        topo = 0;
    }
    public boolean vazia(){
        return topo == 0;
    }
    public boolean cheia(){
        return vetor.length == topo;
    }

    public void push(Contato id)throws PilhaCheiaException{
        if (cheia()){
            throw new PilhaCheiaException();
        } 

        vetor[topo]=id;
        topo+=1;
        }

    public Contato pop()throws PilhaVaziaException{
        if(vazia()){
            throw new PilhaVaziaException();
        }
        topo-=1;
        Contato id = vetor[topo];
        
        vetor[topo] = null;
        return id;
    }
}