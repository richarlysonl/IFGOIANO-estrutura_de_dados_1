package atividadeRevisao.num4;

class No {
    String texto;
    No anterior;
    No proximo;

    public No(String texto) {
        this.texto = texto;
        this.anterior = null;
        this.proximo = null;
    }
}

