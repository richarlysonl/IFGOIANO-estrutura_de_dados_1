package aula04;
import java.util.Scanner;
public class procuraNomePeloNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L,num;
        String nomes[] = new String [5];
        for(L=0; L<=4; L++){
            System.out.println("digite o nome "+(L+1)+": ");
            nomes[L] = sc.next();
        }
        System.out.println("Digite o numero da pessoa: ");
        num = sc.nextInt();
        if(num < 1 && num > 5){
            System.out.println("numero fora do intervalo");
            System.out.println("Digite o numero da pessoa: ");
            num = sc.nextInt();
        }
        System.out.println(nomes[num-1]);
        sc.close();
    }
}