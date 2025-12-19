package aula3;
import javax.swing.JOptionPane;
public class lea21 {
    public static void main(String[] args){
        double sm, qtdade, preco, vp, vd; 
        sm = Double.parseDouble(JOptionPane.showInputDialog("\nentre com o salário mínimo:"));
        qtdade = Double.parseDouble(JOptionPane.showInputDialog("\nentre com a quantidade em quilowatt:"));
        preco = sm /700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.println("preço do quilowatt:" + preco + "\n valor a ser pago: " + vp +" \n valor com desconto: "+ vd);
    }
}
