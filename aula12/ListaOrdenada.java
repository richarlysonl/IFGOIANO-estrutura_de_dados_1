package aula12;
import java.util.Random;
public class ListaOrdenada {

    static class No {
        int valor;
        No anterior, proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    static class ListaDuplamenteEncadeada {
        No inicio, fim;

        void inserirOrdenado(int valor) {
            No novo = new No(valor);

            if (inicio == null) { 
                inicio = fim = novo;
                return;
            }

            if (valor <= inicio.valor) {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
                return;
            }

            if (valor >= fim.valor) {
                fim.proximo = novo;
                novo.anterior = fim;
                fim = novo;
                return;
            }

            No atual = inicio;
            while (atual != null && atual.valor < valor)
                atual = atual.proximo;

            novo.proximo = atual;
            novo.anterior = atual.anterior;
            atual.anterior.proximo = novo;
            atual.anterior = novo;
        }

        void removerPrimos() {
            No atual = inicio;
            while (atual != null) {
                if (ehPrimo(atual.valor)) {

                    if (atual.anterior != null)
                        atual.anterior.proximo = atual.proximo;
                    else
                        inicio = atual.proximo;

                    if (atual.proximo != null)
                        atual.proximo.anterior = atual.anterior;
                    else
                        fim = atual.anterior;
                }
                atual = atual.proximo;
            }
        }

        void imprimirCrescente() {
            No atual = inicio;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }

        void imprimirDecrescente() {
            No atual = fim;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.anterior;
            }
            System.out.println();
        }

        static boolean ehPrimo(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) return false;
            return true;
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random rand = new Random();
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Vetor gerado:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(19999) - 9999; // intervalo -9999 a 9999
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nInserindo na lista:");
        for (int valor : vetor) {
            lista.inserirOrdenado(valor);
        }

        System.out.println("\nLista em ordem crescente:");
        lista.imprimirCrescente();

        System.out.println("\nLista em ordem decrescente:");
        lista.imprimirDecrescente();

        lista.removerPrimos();
        System.out.println("\nLista após remover primos:");
        lista.imprimirCrescente();
    }
}