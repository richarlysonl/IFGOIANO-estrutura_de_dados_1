package aula04;
import javax.swing.JOptionPane;
public class enq85 {
    public static void main(String[] args){
        String frase;
        int op, x, tam;
        
        System.out.println("Menu\r\n");
        System.out.println("1 - Imprime o comprimento da frase\r\n"); //
                                System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase\r\n"); //
                                System.out.println("3-Imprime a frase espelhada\r\n"); //
                                System.out.println("4- Termina o algoritmo");
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("opcao"));
            switch (op) {
                case 1:
                frase = JOptionPane.showInputDialog("digite uma frase: ");
                System.out.println("O tamanho da sua frase é: " + frase.length());
                    break;
                case 2:
                    frase = JOptionPane.showInputDialog("digite uma frase: ");
                    tam = frase.length();
                    System.out.println("Os dois primeiros caracteres são: " + frase.substring(0, 2));
                    System.out.println("Os dois últimos caracteres são: " + frase.substring(frase.length() - 2));
                    break;
                case 3:
                    frase = JOptionPane.showInputDialog("digite uma frase: ");
                    for(x = frase.length() -1; x>=0; x--){
                        System.out.print(frase.charAt(x));
                    }
                    break;
                case 4:
                    System.out.println("\nFim do programa");
                    break;
                default:
                System.out.println("\nOpção inválida");
                    break;
            }            
        }while (op != 4);
    }
}
