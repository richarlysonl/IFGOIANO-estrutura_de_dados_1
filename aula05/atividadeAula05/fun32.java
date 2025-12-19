package atividadeAula05;
import java.util.Scanner;
public class fun32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome[] = new String[2];
        int L;
        for(L = 0;L<2;L++){
        System.out.print("digite palavra em letras minusculas "+(L+1)+": ");
        nome[L] = sc.next();
        nome[L] =restantes(nome[L],nome[L].length(),"c");
        }
        for(L= 0;L<2;L++)
        { System.out.print("\n"+ (L + 1)+" - "+nome[L]);}
        System.out.print("\n"); 
        }
    public static String restantes(String tex,int tam, String x){
        char[] vet = tex.toCharArray();
        int i, cont;
        cont=0;
        for(i=0; i<tam;i++){
        if(vet[i] == x.charAt(0)){ 
            System.out.print("teste \n");
            vet[i] = "*".charAt(0); 
            System.out.print(vet[i]);
            cont++; 
            }
        }
        return new String(vet);
    } 
}
