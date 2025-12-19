package atividadeRevisao.num7;

class NoCarta {
    String carta;
    NoCarta anterior;
    NoCarta proximo;

    NoCarta(String carta) {
        this.carta = carta;
        this.anterior = null;
        this.proximo = null;
    }
}

