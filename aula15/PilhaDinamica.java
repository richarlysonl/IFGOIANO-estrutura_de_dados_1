package aula15;

public class PilhaDinamica {
    //atributos
    No top;

    public void push(int numero){ //empilha na pilha
    No novaCelula = new No(); //cria a nova célula
    novaCelula.setDado(numero); //atualiza o nome
    novaCelula.setAnterior(this.top); //atualiza a referência anterior
    this.top = novaCelula; //coloca a nova célula no topo da pilha
}
    public int pop(){ // método para desempilhar
    if(!isEmpyt()){ // verifica se a pilha está vazia
        System.out.print("Retirando elem. da pilha..: "+this.top.getDado()+"\n");
        int numero = this.top.getDado(); //obtém o número do topo da pilha
        this.top = this.top.getAnterior(); //atualiza o topo da pilha
        return numero;
    }else{
        System.out.print("Pilha Vazia!!!");
        return -1;
    }
    }
    public boolean isEmpyt(){ //verifica se a pilha está vazia
    if(this.top == null)
        return true;
    else 
        return false;
}
    public int sizePilha(){ //conta a quantidade de elementos na pilha
        No p; int cont = 0;
        p = this.top; //inicia pelo topo
        while(p != null){
        p = p.getAnterior(); //volta ao elemento anterior até chegar a base da pilha
        cont++; }
    return cont;
    }
    public void imprimir(){
        No p; p = this.top; //inicia pelo topo
        if(isEmpyt()){ // verifica se a pilha está vazia
        System.out.print("Pilha Vazia!!!"+"\n");
        } else {
        while(p != null){
        System.out.print(p.getDado()+"\n");
        p = p.getAnterior(); // volta até a base da pilha
} } }
    public No top(){ //verifica quem está no topo da pilha
        if(isEmpyt()){
            System.out.print("Pilha Vazia!!!\n");
            return null;
        }else {
        System.out.print("Numero no topo da Pilha..: "+top.getDado()+"\n"); //verifica quem está no topo da pilha
        return this.top;
}
}
public static void main(String[] args) {
    PilhaDinamica pilha1 = new PilhaDinamica();
    PilhaDinamica pilha2 = new PilhaDinamica();
    PilhaDinamica pilha3 = new PilhaDinamica();
    for(int i=0; i<100; i++){
        int numero = (int)(Math.random()*9)+1; //gera números aleatórios entre 1 e 9
    if(numero <= 3)
    pilha1.push(numero);
    else if(numero <= 6)
    pilha2.push(numero);
    else 
    pilha3.push(numero);
}
    for(int i=0; i<100; i++){
        if (pilha1.isEmpyt()){
            System.out.print("O programa foi encerrado porque a pilha 1 está vazia");
            break;
        }
        if (pilha2.isEmpyt()){
            System.out.print("O programa foi encerrado porque a pilha 2 está vazia");
            break;
        }
        if (pilha3.isEmpyt()){
            System.out.print("O programa foi encerrado porque a pilha 3 está vazia");
            break;
        }
        if(pilha1.sizePilha() >= 100){
            System.out.print("O programa foi encerrado porque a pilha 1 deu 100 elementos");
            break;
        }
        if(pilha2.sizePilha() >= 100){
            System.out.print("O programa foi encerrado porque a pilha 2 deu 100 elementos");
            break;
        }
        if(pilha3.sizePilha() >= 100){
            System.out.print("O programa foi encerrado porque a pilha 3 deu 100 elementos");
            break;
        }
        int numero = (int)(Math.random()*3)+1; //gera numeros aleatórios entre 1 e 3
        if(numero == 1){
            int numPilha2 = pilha2.pop(); //desempilha da pilha 2 e 3
            int numPilha3 = pilha3.pop();
            //empilha na pilha 1
            pilha1.push(numPilha2); 
            pilha1.push(numPilha3); 
            System.out.print("Empilhando os números "+numPilha2 +" e " +numPilha3 +" na pilha "+numero+"\n");
        }
        if(numero == 2){
            int numPilha1 = pilha1.pop(); //desempilha da pilha 1 e 3
            int numPilha3 = pilha3.pop();
            //empilha na pilha 2
            pilha2.push(numPilha1); 
            pilha2.push(numPilha3); 
            System.out.print("Empilhando os números "+numPilha1 +" e " +numPilha3 +" na pilha "+numero+"\n");
        }
        if(numero == 3){
            int numPilha1 = pilha2.pop(); //desempilha da pilha 1 e 2
            int numPilha2 = pilha3.pop();
            //empilha na pilha 3
            pilha3.push(numPilha1); 
            pilha3.push(numPilha2); 
            System.out.print("Empilhando os números "+numPilha1 +" e " +numPilha2 +" na pilha "+numero+"\n");
        }
    }
    System.out.print("\npilha 1:\n");
    pilha1.imprimir();
    System.out.print("\npilha 2:\n");
    pilha2.imprimir();
    System.out.print("\npilha 3:\n");
    pilha3.imprimir();
    }
}
