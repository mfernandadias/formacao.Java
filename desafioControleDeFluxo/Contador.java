package desafioControleDeFluxo;
import java.util.Scanner;

public class Contador {
    /*
    o sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, conestes dois número você deverá obter a quantidade de interações (for)
    e realizar a impressão no console (System.out.println) dos números incrementados, exemplo:
    * se você passar os números 12 e 30, logo teremos uma interação (for) com ocorrências para imprmir os números, exemplo "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante
    * se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro
    deve ser maior que o primeiro"
    1 - cire o projeto DesafioControleFluxo
    2 - dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa
    3 - dentro do projeto, crie a classe ParametroInvalidosException que representará a exceção de negócio no sistema
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scan.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException errorMessage) {
            System.out.println(errorMessage);
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro < segundoParametro) {
            int i;
            int contagem = segundoParametro - primeiroParametro;

            for (i = 0; i < contagem; i++) {
                System.out.println(primeiroParametro + i + 1);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}

