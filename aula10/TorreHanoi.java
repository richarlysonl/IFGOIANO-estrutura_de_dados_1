public class TorreHanoi {
    static long hanoi(int numDiscos, char hasteOrigem, char hasteDestino, char hasteAuxiliar) {
       {
        if (numDiscos == 1) {
            return 1;
        }
        return hanoi(numDiscos - 1, hasteOrigem, hasteAuxiliar, hasteDestino)
            + 1
            + hanoi(numDiscos - 1, hasteAuxiliar, hasteDestino, hasteOrigem);
    }
}
    public static void main(String[] args) {
        int numDiscos = 40;
        long ini = System.currentTimeMillis();
        long mov = hanoi(numDiscos, 'A', 'C', 'B');
        long fim = System.currentTimeMillis();
        long tempoTotal = fim - ini;
        long horas = tempoTotal / (1000 * 60 * 60);
        long minutos = (tempoTotal / (1000 * 60)) % 60;
        long segundos = (tempoTotal / 1000) % 60;
        long milissegundos = tempoTotal % 1000;
        System.out.println("Total de movimentos: " + mov);
        System.out.printf("Tempo: %02d:%02d:%02d.%03d\n", horas, minutos, segundos, milissegundos);
    }
}