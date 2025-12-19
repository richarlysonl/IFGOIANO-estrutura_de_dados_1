package atividadeAula05;
import java.util.Scanner;
public class fun22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("\ndigite numero:");
        n = sc.nextInt();
        x = reverso(n);
        System.out.print(" \n "+n+" - "+x);
        if(x == n)
        { System.out.print("\nE um numero capicua");}
        else
        { System.out.print("\nNao e um numero capicua");}
        System.out.print("\n"); 
        }
    public static int reverso(int num){
        int soma, r;
        soma = 0;
        while(num != 0)
        {
        r = num % 10;
        soma= soma*10+r;
        num/=10;
        }
        return(soma); 
        }
}
