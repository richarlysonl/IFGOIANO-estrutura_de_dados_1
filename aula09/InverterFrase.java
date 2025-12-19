import java.util.Scanner;
import java.util.Stack;
public class InverterFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        String fraseInvertida = inverterPalavras(frase);
        System.out.println(fraseInvertida);
    }
    public static String inverterPalavras(String frase) {
       Stack<Character> pilha = new Stack<>();
        for (char letra : frase.toCharArray()) {
            pilha.push(letra);
        }
        StringBuilder fraseInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            fraseInvertida.append(pilha.pop());
        }
        return fraseInvertida.toString();
    }
}