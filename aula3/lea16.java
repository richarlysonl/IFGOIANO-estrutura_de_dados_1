package aula3;
import javax.swing.JOptionPane;
public class lea16 {
    public static void main(String[] args){
        double num, logaritmo;
        num = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o logaritmando: "));
        logaritmo = Math.log(num) / Math.log(10);
        System.out.println("logaritmo " + logaritmo);
    }
}
