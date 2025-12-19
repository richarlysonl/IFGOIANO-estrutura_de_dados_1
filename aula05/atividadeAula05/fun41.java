package atividadeAula05;
import java.util.Scanner;
public class fun41 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5],L, flag,op;//ordena( ), entrada( ),imprime( ),
        flag = 0;
        for(L=0; L<5; L++)
        {
            num[L] =0;
        }
        do
        {
            System.out.print("\n\n\n");
            System.out.print(" \n MENU VETOR - FUNCAO \n");
            System.out.print("\nl Dados do VETOR");
            System.out.print("\n2 Ordena VETOR");
            System.out.print(" \n3 Imprime VETOR");
            System.out.print("\n4 Sai do programa");
            System.out.print("\nOPCAO ");
            op = sc.nextInt();
            switch(op)
            {
                case 1: 
            //entrada(num,5);
                flag =1;
                break;
                case 2: 
                if(flag == 1)
                ordena(num,5);
                else
                System.out.print("\n\nEscolha primeiro opcao 1");
                break;
                case 3: 
                if(flag == 1)
                imprime(num,5);
                else
                System.out.print("\n\nEscolha primeiro opcao 1");
                break;
                case 5:
                System.out.print("saindo do algoritmo");
                break;
                default:
                System.out.print("opção invalida");
                break;
            }
        }while (op!= 4);
    }
    

    public static int[] entrada(int vet[],int t){
        int L;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEntrada do VETOR: \n");
        for(L =0;L<t;L++)
        { 
            System.out.print("Digite numero"+ (L+1)+ ": "); 
            vet[L] = sc.nextInt();
        }
        sc.close();
        return(vet);
            
    }
    public static int[] imprime(int vet[ ],int t)
    {
        int L;
        System.out.print("\nVETOR\n");
        for(L =0;L<t;L++)
        { System.out.print(" \n "+(L+1)+vet[L]); }
        return(vet); 
}

    public static int[] ordena(int vet[], int tam){
        int L1,cl,aux;
        for(L1 =0;L1<tam-1;L1++)
        { 
            for(cl = L1+1;cl<tam;cl++)
            {   
                if(vet[L1]>vet[cl])
                { 
                    aux = vet[L1];
                    vet[L1] = vet[cl];
                    vet[cl] = aux;
                }
            }
        } 
        return(vet);
    }


}