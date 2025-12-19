package atividadeRevisao.num1;
class Fila {
    private String[] fila;
    private int inicio;
    private int fim;
    private int quantidade;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        fila = new String[capacidade];
        inicio = 0;
        fim = -1;
        quantidade = 0;
    }

    public void enfileirar(String elemento) {
        if (quantidade == capacidade) {
            System.out.println("Fila cheia!");
            return;
        }
        fim++;
        fila[fim] = elemento;
        quantidade++;
    }

    public String desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return null;
        }
        String removido = fila[inicio];
        inicio++;
        quantidade--;
        return removido;
    }

    public String frente() {
        if (estaVazia()) {
            return null;
        }
        return fila[inicio];
    }

    public int tamanho() {
        return quantidade;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
}
