package aula15;
public  class  No {
    //atributos
    int numero;
    No anterior;

    //métodos
    public No(){} // Construtor sem parâmetros
    public No(int numero, No anterior){
        // Construtor com parâmetros
        this.numero = numero;
        this.anterior = anterior;
    }
    public int getDado(){
    return this.numero; // retorna o nome armazenado na célula
    }
    public int getNumero() {
        return numero;
    }
    public void setDado(int numero){
    this.numero = numero; //atualiza o nome na célula
}
    public No getAnterior(){
        return(this.anterior); //retorna a referência anterior
    }

    public void setAnterior(No anterior){
        this.anterior = anterior; //atualiza a referência anterior
        }

}

