package atividadeRevisao.num6;

class NoPagina {
    String url;
    NoPagina proximo;

    NoPagina(String url) {
        this.url = url;
        this.proximo = null;
    }
}

