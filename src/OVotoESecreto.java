import java.util.Scanner;

public class OVotoESecreto {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int eleitoresTotal;
        int votosValidos;
        int votosBrancos;
        int votosNulos;

        String resposta = "";

        do {

            System.out.print("\nDigite o total de eleitores: ");
            eleitoresTotal = ler.nextInt();

            System.out.print("Digite a quantidade de votos válidos: ");
            votosValidos = ler.nextInt();

            System.out.print("Digite a quantidade de votos brancos: ");
            votosBrancos = ler.nextInt();

            System.out.print("Digite a quantidade de votos nulos: ");
            votosNulos = ler.nextInt();

            double porcValidos = (votosValidos / (double) eleitoresTotal ) * 100;
            double porcBrancos = (votosBrancos /(double)  eleitoresTotal) * 100;
            double porcNulos = (votosNulos / (double) eleitoresTotal) * 100;

            System.out.printf("\nVotos válidos: %.2f%%", porcValidos);
            System.out.printf("\nVotos brancos: %.2f%%", porcBrancos);
            System.out.printf("\nVotos nulos: %.2f%%", porcNulos);

            System.out.println("\n\nDeseja continuar verificando? (S/N)");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") &&
                    !resposta.equalsIgnoreCase("N")) {
                System.out.println("Digite apenas (S/N)");
                System.out.println("Deseja continuar verificando? (S/N)");
                resposta = ler.next();
            };

        } while(resposta.equalsIgnoreCase("S"));



    }
}
