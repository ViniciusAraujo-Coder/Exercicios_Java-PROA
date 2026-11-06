import java.util.Scanner;

public class EOque {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.print("Tamanho Lado A: ");
        ladoA = ler.nextInt();

        System.out.print("Tamanho Lado B: ");
        ladoB = ler.nextInt();

        System.out.print("Tamanho Lado C: ");
        ladoC = ler.nextInt();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoB + ladoA)){
            System.out.println("Todas as condições são verdadeiras");
        }
        else{
            System.out.println("Não forma um triângulo");
        }

    }
}
