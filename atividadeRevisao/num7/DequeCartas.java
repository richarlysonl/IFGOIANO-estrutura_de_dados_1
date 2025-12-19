package atividadeRevisao.num7;

public class DequeCartas {

    private NoCarta inicio;
    private NoCarta fim;

    public DequeCartas() {
        inicio = null;
        fim = null;
    }
    public void inserirInicio(String carta) {
        NoCarta novo = new NoCarta(carta);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }
    public void inserirFim(String carta) {
        NoCarta novo = new NoCarta(carta);

        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }
    public String removerInicio() {
        if (estaVazio()) {
            System.out.println("Deque vazio!");
            return null;
        }

        String carta = inicio.carta;
        inicio = inicio.proximo;

        if (inicio != null)
            inicio.anterior = null;
        else
            fim = null;

        return carta;
    }
    public String removerFim() {
        if (estaVazio()) {
            System.out.println("Deque vazio!");
            return null;
        }

        String carta = fim.carta;
        fim = fim.anterior;

        if (fim != null)
            fim.proximo = null;
        else
            inicio = null;

        return carta;
    }
    public String frente() {
        if (estaVazio()) return null;
        return inicio.carta;
    }
    public String tras() {
        if (estaVazio()) return null;
        return fim.carta;
    }
    public boolean estaVazio() {
        return inicio == null;
    }
    public void embaralhar() {
        NoCarta atual = inicio;
        NoCarta temp = null;

        while (atual != null) {
            temp = atual.anterior;
            atual.anterior = atual.proximo;
            atual.proximo = temp;
            atual = atual.anterior;
        }

        temp = inicio;
        inicio = fim;
        fim = temp;
    }
    public void mostrarCartas() {
        NoCarta atual = inicio;

        while (atual != null) {
            System.out.println(atual.carta);
            atual = atual.proximo;
        }
    }
}

