package atividadeAula05;
import java.util.Scanner;
public class fun2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0,c = 0;
    for(c = 0; c< 3; c++){   
    System.out.print("\n\ndigite numero:"); 
    a = sc.nextInt(); 
    System.out.print("dobro: "+dob(a));
}
System.out.print("\n"); 
}
public static int dob(int c){
    return(c*2);
}
}
