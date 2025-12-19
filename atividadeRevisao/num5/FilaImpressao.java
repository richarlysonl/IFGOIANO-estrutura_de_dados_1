package atividadeRevisao.num5;

public class FilaImpressao {

    private NoDocumento inicio;
    private NoDocumento fim;

    public FilaImpressao() {
        inicio = null;
        fim = null;
    }
    public void adicionarDocumento(String nome, int paginas) {
        Documento doc = new Documento(nome, paginas);
        NoDocumento novo = new NoDocumento(doc);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }
    public Documento imprimirDocumento() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }

        Documento doc = inicio.documento;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        return doc;
    }
    public void cancelarDocumento(String nome) {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }

        NoDocumento atual = inicio;
        NoDocumento anterior = null;

        while (atual != null && !atual.documento.nome.equals(nome)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Documento não encontrado.");
            return;
        }

        if (atual == inicio) {
            inicio = inicio.proximo;
        } else {
            anterior.proximo = atual.proximo;
        }

        if (atual == fim) {
            fim = anterior;
        }
    }
    public void mostrarFila() {
        NoDocumento atual = inicio;

        if (atual == null) {
            System.out.println("Fila vazia!");
            return;
        }

        while (atual != null) {
            System.out.println(atual.documento.nome + 
                               " - " + atual.documento.paginas + " páginas");
            atual = atual.proximo;
        }
    }
    public int totalPaginas() {
        int total = 0;
        NoDocumento atual = inicio;

        while (atual != null) {
            total += atual.documento.paginas;
            atual = atual.proximo;
        }

        return total;
    }
}

