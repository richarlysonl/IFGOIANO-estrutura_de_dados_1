package atividadeRevisao.num6;

public class TesteHistorico {
    public static void main(String[] args) {

        PilhaHistorico historico = new PilhaHistorico();

        historico.visitarPagina("www.google.com");
        historico.visitarPagina("www.youtube.com");
        historico.visitarPagina("www.github.com");

        System.out.println("Página atual: " + historico.paginaAtual());

        System.out.println("\nHistórico:");
        historico.exibirHistorico();

        System.out.println("\nVoltando página: " + historico.voltarPagina());

        System.out.println("\nPágina atual: " + historico.paginaAtual());

        System.out.println("\nLimpando histórico...");
        historico.limparHistorico();

        historico.exibirHistorico();
    }
}

