package atividadeRevisao.num1;

public class Banco {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enfileirar("Senha 101");
        fila.enfileirar("Senha 102");
        fila.enfileirar("Senha 103");

        System.out.println("Próximo cliente: " + fila.frente());
        System.out.println("Atendido: " + fila.desenfileirar());
        System.out.println("Clientes aguardando: " + fila.tamanho());
        System.out.println("Fila vazia? " + fila.estaVazia());
    }
}

