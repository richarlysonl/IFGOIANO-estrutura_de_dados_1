package atividadeRevisao.num5;

class NoDocumento {
    Documento documento;
    NoDocumento proximo;

    NoDocumento(Documento documento) {
        this.documento = documento;
        this.proximo = null;
    }
}

