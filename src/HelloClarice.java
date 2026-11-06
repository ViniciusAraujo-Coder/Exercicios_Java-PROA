import java.util.Scanner;

public class HelloClarice {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Olá, " + nome);

    }
}
