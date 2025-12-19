package aula16;
public class Teste {
    public static void main(String[] args) {
        Deque d = new Deque();

        String palavra = "22/02/2022";

        for (char c : palavra.toCharArray()) {
            d.inserirFim(c);
        }

        d.imprimir();

        if (d.ehPalindromo()) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo.");
        }
    }
}
