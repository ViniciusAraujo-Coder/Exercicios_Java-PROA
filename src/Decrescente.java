import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args)throws InterruptedException {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para contagem regressiva: ");
        int contagem = ler.nextInt();

        for (int i = contagem; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        }
    }
