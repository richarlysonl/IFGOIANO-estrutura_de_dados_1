package atividadeRevisao.num2;

public class ConversaoBinaria {

    public static String converterParaBinario(int numero) {
        Pilha pilha = new Pilha(32);

        while (numero > 0) {
            int resto = numero % 2;
            pilha.empilhar(resto);
            numero = numero / 2;
        }

        String binario = "";

        while (!pilha.estaVazia()) {
            binario += pilha.desempilhar();
        }

        return binario;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println("Binário de " + n + " = " + converterParaBinario(n));
    }
}
