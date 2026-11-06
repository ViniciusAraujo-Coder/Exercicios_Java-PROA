
// 18. A pagar
// Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus
// funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos, o valor
// total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido.
//
// O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido
// e 5% do valor total das vendas realizadas pelo vendedor.
//
// Considere que o salário inicial é de R$ 5.000,00.
// O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.

import java.util.Scanner;

public class APagar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int carrosVendidos;
        double totalVendas;
        double salarioFixo;
        double comissao;

        String resposta = "";

        do{
            System.out.println("\n============= CALCULADORA FUNCIONÁRIOS =============");

            System.out.print("Quantos carros vendeu? ");
            carrosVendidos = ler.nextInt();

            System.out.print("Qual o valor total das vendas? R$");
            totalVendas = ler.nextDouble();

            System.out.print("Qual o salário fixo? R$");
            salarioFixo = ler.nextDouble();

            System.out.print("Qual a comissão por carro? R$");
            comissao = ler.nextDouble();

            double comissaoCarrosTotal = (carrosVendidos * comissao);
            double comissaoVendas = (totalVendas * 0.05);

            System.out.println("\n-----------------------------------");
            System.out.println("Cálculos realizados pelo programa");
            System.out.println("-----------------------------------");

            System.out.printf("* Sálario fixo: %.2f", salarioFixo);
            System.out.printf("\n* Comissão pelos carros (%d × %.1f): %.2f",
                    carrosVendidos, comissao, comissaoCarrosTotal);
            System.out.printf("\n* Comissão de 5%% sobre as vendas: %.2f",
                    comissaoVendas);

            double salarioFinalVendedor =
                    (salarioFixo + comissaoCarrosTotal + comissaoVendas);

            System.out.println("\n-----------------------------------");
            System.out.println("SALÁRIO FINAL DO VENDEDOR");
            System.out.println("-----------------------------------");

            System.out.println(salarioFinalVendedor);
            System.out.println("-----------------------------------\n");

            System.out.println("Deseja calcular outro funcionário? (S/N)");
            resposta = ler.next();

            while (!resposta.equalsIgnoreCase("S") &&
                    !resposta.equalsIgnoreCase("N")) {

                System.out.println("Resposta inválida! Digite S ou N.");
                resposta = ler.next();
            }

        } while (resposta.equalsIgnoreCase("S"));

    }
}
