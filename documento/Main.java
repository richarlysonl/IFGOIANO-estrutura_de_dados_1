package documento;
public class Main {
    public static void main(String[] args) {

        DequeImpressao deque = new DequeImpressao();

        deque.adicionar_documento_normal();
        deque.adicionar_documento_urgente();
        deque.adicionar_documento_normal();

        deque.visualizar_fila();

        deque.processar_proximo();
        deque.processar_ultimo();

        deque.visualizar_fila();

        System.out.println("Total de documentos: " + deque.total_documentos());
        System.out.println("Total de páginas: " + deque.total_paginas());
    }
}
