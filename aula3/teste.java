package aula3;
import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args){
        int a,d;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de tres casas: "));
        d = (a % 100) / 10;
        System.out.print("\n algarismo da casa das dezenas: " + d);
        System.out.print("\n");
        //JOptionPane.showMessageDialog(null, d);
    }
}
