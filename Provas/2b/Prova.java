package prova1;


import java.util.List;

public class Leitor {
    public Prova contador;
    private Object vetor;

    public void push(){
        vetor = contador;


        while(contador != 0){
            vetor += contador;
        }
    };

    public static void main(String[] args) {
        
    }
};
