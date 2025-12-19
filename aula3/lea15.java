package aula3;

import javax.swing.JOptionPane;

public class lea15 {
    public static void main(String[] args){
        double angulo, rang;
        angulo = Double.parseDouble(JOptionPane.showInputDialog("\ndigite um angulo em graus:"));
        rang = angulo*3.14 /180;
        System.out.println("seno " + Math.sin(rang));
        System.out.println("coseno " + Math.cos(rang));
        System.out.println("tangente " + Math.tan(rang));
        System.out.println("co-secante " + 1/Math.sin(rang));
        System.out.println("secante " + 1/Math.cos(rang));
        System.out.println("cotangente "+ 1/Math.tan(rang));
    }
}
