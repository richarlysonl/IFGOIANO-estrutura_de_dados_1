package atividadeAula05;
import java.util.Scanner;
public class fun37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite nome: ");
            nomes[i] = sc.nextLine();
        }
        ordena(nomes);
        System.out.println("\nNOMES ORDENADOS:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }
        sc.close();
    }
    public static void ordena(String[] nomes) {
        int tam = nomes.length;
        String aux;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    aux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux;
                }
            }
        }
    }

}
