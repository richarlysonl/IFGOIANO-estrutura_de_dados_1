package aula3;
import javax.swing.JOptionPane;
public class leal9 {
    public static void main(String[] args){
        double saldo, nsaldo;
        saldo = Double.parseDouble(JOptionPane.showInputDialog("\ndigite saldo: "));
        nsaldo = saldo * 1.01;
        System.out.println("novo saldo:" + nsaldo);
    }
}
