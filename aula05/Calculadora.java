
public class Calculadora {
    public static void main(String[] args) {
        Tratamento mensagem = new Tratamento();
        Operacoes calc = new Operacoes();
        char op = ' ';
        int resultado = 0;
        mensagem.entrada();
        String nome = mensagem.entraNome();
        while(op != 0){
        op = mensagem.escolherOpcao();
        int valor1 = mensagem.valor1();
        int valor2 = mensagem.valor2();
        switch(op){
            case '+': 
                resultado = calc.soma(valor1,valor2); // Exemplo de uso do método soma
            break;
            case '-':
                resultado = calc.subtracao(valor1,valor2); // Exemplo de uso do método subtracao
            break;
            case '*':
            resultado = calc.multiplicacao(valor1,valor2); // Exemplo de uso do método multiplicacao
                break;
            case '/':
                resultado = calc.divisao(valor1,valor2); // Exemplo de uso do método divisao
            break;
            case 'S':
                resultado = (int) Math.sqrt(valor1); // Exemplo de uso do metodo raiz quadrada
                break;
            case '^':
            resultado = (int) Math.pow(valor1, valor2); // Exemplo de uso
            case '0':
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida");
        }
         mensagem.resultado(resultado);
    }
    mensagem.despedida(nome);
}
}