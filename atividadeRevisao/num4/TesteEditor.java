package atividadeRevisao.num4;

public class TesteEditor {
    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();

        editor.inserirFim("Linha 1");
        editor.inserirFim("Linha 2");
        editor.inserirInicio("Linha 0");
        editor.inserirPosicao("Linha 1.5", 2);

        System.out.println("Exibindo normal:");
        editor.exibirFrente();

        System.out.println("\nExibindo ao contrário:");
        editor.exibirTras();

        editor.remover(1);

        System.out.println("\nApós remover posição 1:");
        editor.exibirFrente();
    }
}
