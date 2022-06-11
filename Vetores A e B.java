package exerciciossala;
import java.util.Scanner;
public class d3005ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int A[]= new int [5];
        int a = A.length;//comprimento do A no a da matriz
        int B[]= new int [5];
        int b = B.length;//comprimento do B no b da matriz
        int C = 0;//declarando C
        
        for(int j=0; j<5; j++){// laço para receber e guardar o valor no vetor A
            System.out.printf("\nDigite o valor da posição %d do vetor A: ", j);
            A[j] = ler.nextInt();
        }
        for(int k=0; k<5; k++){// laço para receber e guardar o valor no vetor B
            System.out.printf("\nDigite o valor da posição %d do vetor B: ", k);
            B[k] = ler.nextInt();
        }
        
        for(int i=0; i<5; i++){
            C = C + A[i] * B[i];//fomula matematica
        }
        System.out.printf("\nO valor total de C é: %d", C);// imprimindo o resultado final
    }
}