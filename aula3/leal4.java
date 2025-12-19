package aula3;
import javax.swing.JOptionPane;
public class leal4 {
    public static void main(String[] args){
        double a, b, c,d, mp;
        a = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o 1 numero: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o 2 numero: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o 3 numero: "));
        d = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o 4 numero: "));
        mp = (a*1 + b*2 + c*3 + d*4)/10 ; 
        JOptionPane.showMessageDialog(null,"media ponderada" + mp);
    }
}
