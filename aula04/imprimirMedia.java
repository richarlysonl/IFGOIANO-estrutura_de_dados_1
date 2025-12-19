package aula04;
import java.util.Scanner;
public class imprimirMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L;
        String nomes[] = new String[5];
        double pr1[]=new double[5], pr2[]= new double[5], media[]=new double[5];
        for(L = 0; L <= 4; L++){
            System.out.println("Digite, "+ (L+1) + "º nome: ");
            nomes[L] = sc.next();
            System.out.println("Digite a 1º nota: ");
            pr1[L] = sc.nextDouble();
            System.out.println("Digite a 2º nota: ");
            pr2[L] = sc.nextDouble();
            media[L] = (pr1[L] + pr2[L]) / 2;
        }
        System.out.print("\n\n\n\t\t\t\\tRELACAO FINAL\\n");
        for(L = 0; L <= 4; L++){
            System.out.println("\n" + (L+1) + "- " + nomes[L]);
            System.out.printf("nota 1 "+pr1[L]+" nota 2 "+pr2[L]+" Media: %.2f ", media[L]);
    }
    System.out.print("\n");
    sc.close();
}
}
