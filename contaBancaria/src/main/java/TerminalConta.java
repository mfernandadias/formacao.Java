import java.util.Scanner;

public class TerminalConta {
    public static void main(String[] args ) throws Exception {
        System.out.println("Bem-vindo a sua Conta");
        //Simulando uma conta bancária através do terminal/console
        
        //Conjecer e importar a classe Scanner 
        //exibir as mensagens para o nosso usuário 
        //obter pela scanner os valores digitados no terminal 
        //exibir a mensagem conta criada 
        Scabber sc = new Scanner(System.in);
        int numero; 
        String agencia; 
        Strint nomeDoCliente; 
        Double saldo; 

        System.out.println("Informe os dados solicitados!");

        System.out.println("Por favor, digite o númeo da Agência!");
        agencia = sr.next();

        System.out.pritln("Agora digite o número da Conta: (1548)");
        numero = sr.next();

        Susyem.out.println("Qual é o seu nome, por favor?")
        nomeDoCliiente = sr.next();

        System.out.println("Agora me informe seu salco atual: ")
        saldo = sr.next();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
        nomeDOCliente, agencia, numero, saldo));

		sc.close();
    }
}
