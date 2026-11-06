import java.util.Scanner;

public class DeQuantoAtéQuanto {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double contagem = 0;
        int numeros = 0;

        System.out.print("Digite um número para iniciar: ");
        int numInicio = ler.nextInt();

        System.out.print("Digite um número para finalizar: ");
        int numfinal = ler.nextInt();

        while(numfinal < numInicio){
            System.out.println("Digite um número maior que o anterior");
            System.out.print("Digite um número para finalizar: ");
            numfinal = ler.nextInt();
        }

        for(int i = numInicio; i <= numfinal; i++){
            contagem = contagem + i;
            numeros = numeros + 1;
        }

        double media = contagem / numeros;

        System.out.printf("\nA soma entre os números %d e %d é %.2f", numInicio, numfinal, contagem);
        System.out.println("\nTemos a soma de " + numeros + " números");
        System.out.println("\nA média aritmética é " + media);


    }
}
