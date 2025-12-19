package atividadeRevisao.num2;

public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public void empilhar(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia!");
            return;
        }
        topo++;
        dados[topo] = valor;
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return dados[topo--];
    }

    public int verTopo() {
        if (estaVazia()) {
            return -1;
        }
        return dados[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }
}

