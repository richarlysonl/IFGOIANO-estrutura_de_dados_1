package documento;
import java.util.HashSet;
import java.util.Random;

public class DequeImpressao {
    private Nodo cabeca = null;
    private int tamanho = 0;
    private HashSet<Integer> idsUsados = new HashSet<>();
    private Random random = new Random();

    private int gerarIdUnico() {
        int id;
        do {
            id = random.nextInt(1000) + 1;
        } while (idsUsados.contains(id));
        idsUsados.add(id);
        return id;
    }

    private Documento criarDocumento() {
        return new Documento(gerarIdUnico());
    }

    // ------------------ Inserções ---------------------

    public void adicionar_documento_normal() {
        Documento doc = criarDocumento();
        Nodo novo = new Nodo(doc);

        if (cabeca == null) {
            cabeca = novo;
            cabeca.proximo = cabeca;
            cabeca.anterior = cabeca;
        } else {
            Nodo ultimo = cabeca.anterior;

            ultimo.proximo = novo;
            novo.anterior = ultimo;

            novo.proximo = cabeca;
            cabeca.anterior = novo;
        }

        tamanho++;
        System.out.println("Documento adicionado ao final: " + doc);
    }

    public void adicionar_documento_urgente() {
        Documento doc = criarDocumento();
        Nodo novo = new Nodo(doc);

        if (cabeca == null) { 
            cabeca = novo;
            cabeca.proximo = cabeca;
            cabeca.anterior = cabeca;
        } else {
            Nodo ultimo = cabeca.anterior;

            novo.proximo = cabeca;
            novo.anterior = ultimo;

            ultimo.proximo = novo;
            cabeca.anterior = novo;

            cabeca = novo;
        }

        tamanho++;
        System.out.println("Documento URGENTE adicionado no início: " + doc);
    }

    // ------------------ Processamento ---------------------

    public Documento processar_proximo() {
        if (fila_vazia()) {
            System.out.println("Fila vazia!");
            return null;
        }

        Nodo removido = cabeca;

        if (tamanho == 1) {
            cabeca = null;
        } else {
            Nodo ultimo = cabeca.anterior;

            cabeca = cabeca.proximo;
            cabeca.anterior = ultimo;
            ultimo.proximo = cabeca;
        }

        tamanho--;
        System.out.println("Processado do início: " + removido.doc);
        return removido.doc;
    }

    public Documento processar_ultimo() {
        if (fila_vazia()) {
            System.out.println("Fila vazia!");
            return null;
        }

        Nodo ultimo = cabeca.anterior;

        if (tamanho == 1) {
            cabeca = null;
        } else {
            Nodo novoUltimo = ultimo.anterior;
            novoUltimo.proximo = cabeca;
            cabeca.anterior = novoUltimo;
        }

        tamanho--;
        System.out.println("Processado do final: " + ultimo.doc);
        return ultimo.doc;
    }

    // ------------------ Visualização ---------------------

    public void visualizar_fila() {
        if (fila_vazia()) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.println("\n--- Fila de Impressão ---");
        Nodo atual = cabeca;
        do {
            System.out.println(atual.doc);
            atual = atual.proximo;
        } while (atual != cabeca);
        System.out.println("-------------------------\n");
    }

    // ------------------ Informações ---------------------

    public boolean fila_vazia() {
        return tamanho == 0;
    }

    public int total_documentos() {
        return tamanho;
    }

    public int total_paginas() {
        if (fila_vazia()) return 0;

        Nodo atual = cabeca;
        int total = 0;

        do {
            total += atual.doc.getPaginas();
            atual = atual.proximo;
        } while (atual != cabeca);

        return total;
    }
}
