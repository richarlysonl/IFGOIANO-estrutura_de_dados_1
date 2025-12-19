package aula3;
import javax.swing.JOptionPane;
public class lea13 {
    public static void main(String[] args){
        int quoc, rest, val1, val2;
        val1 = Integer.parseInt(JOptionPane.showInputDialog("entre com o dividendo:"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("entre com o divisor:"));
        quoc = val1 / val2;
        rest = val1 % val2;
        System.out.print("\n\n\n");
        System.out.print("dividendo " + val1);
        System.out.print("divisor " + val2);
        System.out.print("quociente " + quoc);
        System.out.print("resto " + rest);
    }
}
