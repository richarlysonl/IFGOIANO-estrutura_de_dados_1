package atividadeRevisao.num5;

public class TesteImpressora {
    public static void main(String[] args) {

        FilaImpressao fila = new FilaImpressao();

        fila.adicionarDocumento("Trabalho.pdf", 10);
        fila.adicionarDocumento("Relatorio.docx", 5);
        fila.adicionarDocumento("Foto.png", 2);

        System.out.println("DOCUMENTOS NA FILA:");
        fila.mostrarFila();

        System.out.println("\nTotal de páginas: " + fila.totalPaginas());

        System.out.println("\nImprimindo: " + fila.imprimirDocumento().nome);

        System.out.println("\nApós impressão:");
        fila.mostrarFila();

        fila.cancelarDocumento("Relatorio.docx");

        System.out.println("\nApós cancelar documento:");
        fila.mostrarFila();
    }
}

