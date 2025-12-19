package aula16_teste;

public class No {
    String valor;
    No proximo;
    No anterior;
    private No cabeca;

    public No(){} // Construtor sem parâmetros
    public No(String valor, No anterior){
        // Construtor com parâmetros
        if (cabeca == null) {
            this.cabeca = this;
            this.proximo = this;
            this.anterior =this;
        }
        else{
             No ultimo = cabeca.anterior;

            this.proximo = cabeca;   // último aponta para a cabeça
            this.anterior = ultimo;

            ultimo.proximo = this;
            cabeca.anterior = this;
        } 
        if (proximo == null) {
            this.proximo = cabeca;
        }
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
