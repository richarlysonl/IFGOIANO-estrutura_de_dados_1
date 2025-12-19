package aula04;

import java.util.Scanner;

public class vetor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, c, t, media[] = new int[3];
        String nomes[] = new String[3], sit[] = new String[3];
        double pr1[] = new double[3], pr2[] = new double[3];
        // trecho para entrada dos 15 nomes
        for (L = 0; L <= 2; L++) {
            System.out.println("Digite " + (L + 1) + " nome: ");
            nomes[L] = sc.next();
            while (nomes[L].length() > 30) {
                System.out.println("nomes com até 30 caracteres");
                System.out.println("Digite " + (L + 1) + " nome: ");
                nomes[L] = sc.next();
            }
            // trecho que garante todos os nomes com 30 caracteres para fazer tabulacao
            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++)
                nomes[L] = nomes[L] + " ";
            System.out.println("Digite 1 nota: ");
            pr1[L] = sc.nextDouble();
            System.out.println("Digite 2 nota: ");
            pr2[L] = sc.nextDouble();
            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);
            if (media[L] >= 5)
                sit[L] = "AP";
            else
                sit[L] = "RP";
        }
        // fim do trecho de entrada
        // trecho de saida
        System.out.print("\n\n\n\t\t\t\\tRELACAO FINAL\\n");
        for (L = 0; L <= 2; L++) {
            System.out.println("\n" + (L + 1) + "- " + nomes[L] + pr1[L] + pr2[L] + " \t" + media[L] + "\t" + sit[L]);
        }
        System.out.print("\n");
        // fim do trecho de saida
        sc.close();
    }
}
