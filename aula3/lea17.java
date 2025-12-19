package aula3;
import javax.swing.JOptionPane;
public class lea17 {
    public static void main(String[] args){
        double num, base, logaritmo;
        num = Double.parseDouble(JOptionPane.showInputDialog("entre com o logaritmando: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("entre com a base: "));
        logaritmo = Math.log(num) / Math.log(base);
        System.out.println("logaritmo deb"+ num + "base" + base + "logaritmo" + logaritmo);
    }
}
