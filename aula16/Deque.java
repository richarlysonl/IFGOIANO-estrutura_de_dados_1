package aula16;
public class Deque {

    private class Node {
        char dado;
        Node prox;
        Node ant;

        Node(char d) {
            dado = d;
        }
    }
    Node cabeca = null;
    public void inserirInicio(char valor) {
        Node novo = new Node(valor);

        if (cabeca == null) {
            cabeca = novo;
            cabeca.prox = cabeca;
            cabeca.ant = cabeca;
        } else {
            Node ultimo = cabeca.ant;

            novo.prox = cabeca;
            novo.ant = ultimo;

            ultimo.prox = novo;
            cabeca.ant = novo;

            cabeca = novo;
        }
    }

    public void inserirFim(char valor) {
        Node novo = new Node(valor);

        if (cabeca == null) {
            cabeca = novo;
            cabeca.prox = cabeca;
            cabeca.ant = cabeca;
        } else {
            Node ultimo = cabeca.ant;

            novo.prox = cabeca;
            novo.ant = ultimo;

            ultimo.prox = novo;
            cabeca.ant = novo;
        }
    }
    public boolean ehPalindromo() {
        if (cabeca == null) return true;
        if (cabeca.prox == cabeca) return true; 

        Node inicio = cabeca;
        Node fim = cabeca.ant;

        while (inicio != fim && inicio.ant != fim) {  
            if (inicio.dado != fim.dado)
                return false;

            inicio = inicio.prox;  
            fim = fim.ant;         
        }

        return true;
    }

    public void imprimir() {
        if (cabeca == null) {
            System.out.println("Deque vazio");
            return;
        }

        Node atual = cabeca;
        do {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        } while (atual != cabeca);

        System.out.println();
    }
}
