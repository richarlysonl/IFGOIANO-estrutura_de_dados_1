import javax.swing.JOptionPane;
public class Tratamento {
    void entrada(){
        JOptionPane.showMessageDialog(null,"bem vindo a calculadora");
    }   
    String entraNome(){
        String nome = JOptionPane.showInputDialog("Digite seu nome");
    return (nome);
    }
    char escolherOpcao(){
        String op;
        op = JOptionPane.showInputDialog("Escolha uma opcao: \n + \n - \n * \n / \n S \n ^ \n ~ 1/x \n");
        return (op.charAt(0));
    }
    void despedida(String nome){
        JOptionPane.showMessageDialog(null,"Obrigado"+nome+"por usar a calculadora");
    }
    void resultado(int res){
        JOptionPane.showMessageDialog(null,"O resultado e: " + res);
    }
    int valor1(){
        String v1;
        v1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        return (Integer.parseInt(v1));
    }
    int valor2(){
        String v2;
        v2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        return (Integer.parseInt(v2));
    }
}
