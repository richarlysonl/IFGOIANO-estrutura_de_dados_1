package atividadeAula05;
import java.util.Scanner;

public class fun42 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = new int[5];   // vetor A
        int[] num1 = new int[5];  // vetor B
        int flag = 0, flag1 = 0, op;

        do {
            System.out.println("\n\nVETORES");
            System.out.println("1 - Dados do VETOR A");
            System.out.println("2 - Dados do VETOR B");
            System.out.println("3 - Imprime VETORES");
            System.out.println("4 - Soma VETORES");
            System.out.println("5 - Subtrai VETORES");
            System.out.println("6 - Sai do programa");
            System.out.print("\nOPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(num1, 5, "B");
                    flag1 = 1;
                    break;
                case 3:
                    if (flag > 0 && flag1 > 0) {
                        imprime(num, 5, "A");
                        imprime(num1, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2!");
                    }
                    break;
                case 4:
                    if (flag > 0 && flag1 > 0) {
                        soma(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2!");
                    }
                    break;
                case 5:
                    if (flag > 0 && flag1 > 0) {
                        subtrai(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opções 1 e 2!");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (op != 6);
    }

    public static void entrada(int[] vet, int t, String c) {
        System.out.println("\nEntrada do VETOR " + c + "\n");
        for (int i = 0; i < t; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }
    }

    public static void imprime(int[] vet, int t, String c) {
        System.out.println("\nVETOR " + c);
        for (int i = 0; i < t; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
        }
    }

    public static void soma(int[] vet1, int[] vet2, int t) {
        System.out.println("\nSOMA");
        for (int i = 0; i < t; i++) {
            int s = vet1[i] + vet2[i];
            System.out.println((i + 1) + " - " + s);
        }
    }

    public static void subtrai(int[] vet1, int[] vet2, int t) {
        System.out.println("\nDIFERENÇA");
        for (int i = 0; i < t; i++) {
            int d = vet1[i] - vet2[i];
            System.out.println((i + 1) + " - " + d);
        }
    }
}