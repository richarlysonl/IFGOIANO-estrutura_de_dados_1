package atividadeRevisao.num6;

public class PilhaHistorico {

    private NoPagina topo;

    public PilhaHistorico() {
        topo = null;
    }
    public void visitarPagina(String url) {
        NoPagina nova = new NoPagina(url);
        nova.proximo = topo;
        topo = nova;
    }

    public String voltarPagina() {
        if (estaVazia()) {
            System.out.println("Histórico vazio!");
            return null;
        }

        String url = topo.url;
        topo = topo.proximo;
        return url;
    }

    public String paginaAtual() {
        if (estaVazia()) {
            return null;
        }
        return topo.url;
    }

    public void exibirHistorico() {
        if (estaVazia()) {
            System.out.println("Histórico vazio!");
            return;
        }
        NoPagina atual = topo;
        System.out.println("Histórico de navegação:");

        while (atual != null) {
            System.out.println(atual.url);
            atual = atual.proximo;
        }
    }
    public void limparHistorico() {
        topo = null;
    }
    public boolean estaVazia() {
        return topo == null;
    }
}
