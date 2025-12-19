package atividadeRevisao.num4;

public class EditorTexto {

    private No inicio;
    private No fim;
    private int tamanho;

    public EditorTexto() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirInicio(String texto) {
        No novo = new No(texto);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(String texto) {
        No novo = new No(texto);

        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirPosicao(String texto, int posicao) {
        if (posicao <= 0) {
            inserirInicio(texto);
        } else if (posicao >= tamanho) {
            inserirFim(texto);
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }

            No novo = new No(texto);
            novo.proximo = atual.proximo;
            novo.anterior = atual;
            atual.proximo.anterior = novo;
            atual.proximo = novo;
            tamanho++;
        }
    }

    public void remover(int posicao) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (posicao == 0) {
            inicio = inicio.proximo;
            if (inicio != null)
                inicio.anterior = null;
            else
                fim = null;
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }

            if (atual == fim) {
                fim = fim.anterior;
                fim.proximo = null;
            } else {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
        }
        tamanho--;
    }

    public void exibirFrente() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.texto);
            atual = atual.proximo;
        }
    }

    public void exibirTras() {
        No atual = fim;
        while (atual != null) {
            System.out.println(atual.texto);
            atual = atual.anterior;
        }
    }
}

