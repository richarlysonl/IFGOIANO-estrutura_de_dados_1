package atividadeRevisao.num3;

public class SomaDigitosRecursiva {
    public static int somarDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return (numero % 10) + somarDigitos(numero / 10);
    }

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 5;
        int n3 = 1234;
        int n4 = 907;

        System.out.println("Soma de " + n1 + " = " + somarDigitos(n1));
        System.out.println("Soma de " + n2 + " = " + somarDigitos(n2));
        System.out.println("Soma de " + n3 + " = " + somarDigitos(n3));
        System.out.println("Soma de " + n4 + " = " + somarDigitos(n4));
    }
}
