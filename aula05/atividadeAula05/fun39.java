package atividadeAula05;
import java.util.Scanner;
public class fun39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L,c,num[] = new int[10],n,aux;
        for(L=0; L<10; L++)
        { 
            System.out.print("Digite numero : "+ (L+1) +": "); 
            num[L] = sc.nextInt();
        }
            System.out.print("Digite numero de busca: "); 
            n = sc.nextInt();
        //ordena( num,10);
        c=busca( num,10,n);
        System.out.print("\nVETOR\n");
        for(L=0; L<10; L++)
        { 
            System.out.print("\n"+(L+1)+" - "+ num[L]); 
        }
        c++; 
        if (c != 0)
            System.out.print("\n\n posicao no vetor: "+ c);
        else
            System.out.print("\n\n não encontrado");
    }
    public static int busca (int vet[], int tam, int chave){
        int i, ini, meio, fim, n;
        ini =0;
        fim = tam-1;
        while(ini <= fim)
        {
        meio = (ini+fim)/2;
        if(chave == vet[meio])
            return (meio);
        else if(chave < vet[meio])
            fim = meio-1;
            else
            ini = meio+1;
        }
        meio=(-1);
        return (meio);
    }
    public static void ordena(int vet[], int tam){
        tam = vet.length;
        int l1,c1,aux;
        for(l1=0; l1<tam-1; l1++){
            for(c1=l1+1; c1<tam; c1++){
                if(vet[l1]>vet[c1]){
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
