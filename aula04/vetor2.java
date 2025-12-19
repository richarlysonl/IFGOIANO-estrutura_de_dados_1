package aula04;
import java.util.Scanner;
public class vetor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L, num[] = new int[15];
        //trecho de entrada de 15 numeros
        for(L = 0; L<15; L++){
        System.out.println("digite o numero"+(L+1)+": ");
        num[L] = sc.nextInt();
        }
        //fim do trecho de entrada
        //trecho de saida
        System.out.println("Relação dos numeros: ");
        for(L=0;L<15;L++){
            System.out.print(""+(L+1)+"- "+num[L]);
            if(num[L] % 2 == 0)
                System.out.print(" é par\n");
            else
                System.out.print(" é impar\n");
        }
        //fim do trecho de saida
        sc.close();
    }
}