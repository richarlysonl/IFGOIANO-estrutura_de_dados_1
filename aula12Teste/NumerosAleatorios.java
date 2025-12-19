package aula12Teste;
public class NumerosAleatorios {
    public static void main(String[] args) {
        int vetor[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
        int n = (int) (Math.random() * 10000); // Gera números entre 0 e 9999
        int sinal = Math.random() < 0.5 ? -1 : 1; // chance de ser negativo ou positivo
        n *= sinal;
        vetor[i] = n;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(vetor[i]);
        }
    }
}