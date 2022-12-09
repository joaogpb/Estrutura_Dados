importar java.util.ArrayList;
importar java.util.Collections;
importar java.util.HashMap;
importar java.util.List;
importar java.util.Map;
importar java.util.Stack;

public class MatrizAdjacência {
    gráfico int[][] privado;
    private Map<String, Integer> vértices;

    public MatrizAdjacencia(int[][] grafo, String vertices[]) {
        este.grafo = grafo;
        this.vertices = new HashMap<>();

        for (int i = 0; i < vértices.comprimento; i++) {
            this.vertices.put(vertices[i], i);
        }
    }


    
    public String obtemVerticeMaiorGrau() {
        Vértice da string = nulo;
        int maior = 0;

        for (String rotulo : vertices.keySet()) {
            int grau = obtemGrau(rotulo);

            if (grau > maior) {
                vértice = rotulo;
                maior = grau;
            }
        }

        vértice de retorno;
    }

    public String obtemVerticeMenorGrau() {
        String Menor vértice = null;

        int grauInicial = 0;
        int cont = 1;

        for (String rotulo : vertices.keySet()) {

            int grau = obtemGrau(rotulo);

            if (cont == 1) {
                grauInicial = obtemGrau(rotulo);
            }

            if (grau < grauInicial) {
                Menor vértice = rotulo;
            }
            cont++;
        }
        retornar Menorvértice;

    }

    public List<String> obtemVizinhos(String vi) {
        int i = vértices.get(vi);
        List<String> vizinhos = new ArrayList<>();

        for (String vj : vertices.keySet()) {
            int j = vértices.get(vj);

            if (grafo[i][j] > 0) {
                vizinhos.add(vj);
            }
        }

        voltar vizinhos;
    }

    public void buscaEmProfundidadeRecursiva() {
        String vértice = vértices.keySet().iterator().next();
        List<String> visitados = new ArrayList<>();

        System.out.print("Busca em profundidade recursiva: [ ");

        this.buscaEmProfundidade(vertice, visitados);

        System.out.println("]");
    }

    public void buscaEmProfundidade(String vertice, List<String> visitados) {
        if (!visitados.contains(vertice)) {
            System.out.print(vértice + " ");
            visitados.add(vertice);

            List<String> vizinhos = obtemVizinhos(vertice);

            for (String vizinho : vizinhos) {
                buscaEmProfundidade(vizinho, visitados);
            }
        }
    }

    public void buscaEmProfundidadeIterativa() {
        String vértice = vértices.keySet().iterator().next();
        Stack<String> naoVisitados = new Stack<>();
        List<String> visitados = new ArrayList<>();

        naoVisitados.push(vertice);

        System.out.print("Busca em profundidade iterativa: [ ");

        while (!naoVisitados.isEmpty()) {
            String vi = naoVisitados.pop();

            if (!visitados.contains(vi)) {
                visitados.add(vi);
                System.out.print(vi + " ");

                List<String> vizinhos = obtemVizinhos(vi);
                Collections.reverse(vizinhos);

                vizinhos.forEach(vj -> naoVisitados.push(vj));
            }
        }

        System.out.println("]");
    }

    public int obtemGrau(String vértice) {
        int i = vértices.get(vértice);
        int grau = 0;

        for (int j = 0; j < grafo.length; j++) {
            if (grafo[i][j] > 0 || grafo[j][i] > 0) {
                grau++;
            }
        }

        retornar grau;
    }




    public static void main(String args[]) {
        gráfico int[][] = {
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0 , 0, 0 },
                { 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 , 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 , 1, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 , 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 , 0, 1},
                { 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 , 0, 1},
                { 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 , 1, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 , 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 , 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 1},
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0, 0 }
        };

        String vértices[] = { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
                "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" };

        MatrizAdjacência matriz = new MatrizAdjacência(grafo, vértices);

        String verticeMaior = matriz.obtemVerticeMaiorGrau();
        String verticeMenor = matriz.obtemVerticeMenorGrau();

        int graumaior = matriz.obtemGrau(verticeMaior);
        System.out.println("Estado com maior número de estados vizinhos: " + verticeMaior);
        System.out.println("visinhos do estado " + verticeMaior + " : " + graumaior);

        System.out.println("");

        int graumenor = matriz.obtemGrau(verticeMenor);
        System.out.println("Estado com menor número de estados vizinhos: " + verticeMenor);
        System.out.println("visinhos do estado " + verticeMenor + " : " + graumenor);

        System.out.println("");

        matriz.buscaEmProfundidadeIterativa();
        matriz.buscaEmProfundidadeRecursiva();
       
    }
}
