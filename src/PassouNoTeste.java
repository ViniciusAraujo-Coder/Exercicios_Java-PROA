import java.util.Scanner;

public class PassouNoTeste {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] notas = new double[6];
        int alunos = 0;
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        String resposta;

        do {
            double notaTotal = 0;

            for (int i = 0; i < 6; i++) {
                System.out.printf("Digite a nota [%d]: ", i + 1);
                notas[i] = ler.nextDouble();
                notaTotal += notas[i];
            }

            double mediaAluno = notaTotal / 6;

            if (mediaAluno >= 6.5) {
                System.out.println("Parabéns! Aluno APROVADO.");
                alunosAprovados++;
            } else {
                System.out.println("Aluno REPROVADO.");
                alunosReprovados++;
            }

            System.out.printf("\nMédia do aluno: %.2f\n", mediaAluno);
            alunos++;

            System.out.println("Deseja adicionar outro aluno? (S/N)");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") &&
                    !resposta.equalsIgnoreCase("N")) {

                System.out.println("Resposta inválida! Digite S ou N.");
                resposta = ler.next();
            }

        } while (resposta.equalsIgnoreCase("S"));

        System.out.printf("\nForam cadastrado(s) %d aluno(s)", alunos);
        System.out.printf("\n %d aluno(s) APROVADO(S)", alunosAprovados);
        System.out.printf("\n %d alunos REPROVADOS()\n", alunosReprovados);
        System.out.println("\nPrograma encerrado!");

        ler.close();
    }
}
