package atividadeRevisao.num7;

public class TesteJogoCartas {
    public static void main(String[] args) {

        DequeCartas baralho = new DequeCartas();

        baralho.inserirFim("Ás de Espadas");
        baralho.inserirFim("Rei de Copas");
        baralho.inserirInicio("Coringa");

        System.out.println("Cartas no baralho:");
        baralho.mostrarCartas();

        System.out.println("\nPrimeira carta: " + baralho.frente());
        System.out.println("Última carta: " + baralho.tras());

        System.out.println("\nComprando carta: " + baralho.removerInicio());

        System.out.println("\nBaralho após compra:");
        baralho.mostrarCartas();

        System.out.println("\nEmbaralhando...");
        baralho.embaralhar();

        System.out.println("\nBaralho embaralhado:");
        baralho.mostrarCartas();
    }
}

