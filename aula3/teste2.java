package aula3;
import javax.swing.JOptionPane;
public class teste2 {
    public static void main(String[] args){
        int data,dia,mes,ano;
        data = Integer.parseInt(JOptionPane.showInputDialog("Digite data no formato ddmmaa:"));
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println("dia " + dia);
        System.out.println("mes " + mes);
        System.out.println("ano " + ano);
    }
}
