package atividadeAula05;
import java.util.Scanner;
public class fun12 {
    public static void main(String[] args){
int num, pri; 
Scanner sc = new Scanner(System.in);
System.out.print("\ndigite um numero > 0: ");
num = sc.nextInt();
pri= primo(num);
if(pri ==0)
{System.out.print("\n e primo "+num);}
else
{System.out.print("\nnao e primo "+num);}
System.out.print("\n"); 
}
public static int primo(int n){
    int c = 0,p = 2; 
    while( c == 0 && p <= n / 2){ 
        if(n % p == 0)
            c=1; 
        p++;
    }
    return(c);
    }

}
