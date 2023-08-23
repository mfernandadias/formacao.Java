import java.util.Locale; 
import java.util.Scanner; 

public class AboutMe{

    public static void main(String[] args) {
        try{
        //criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.printl("Digite sua idade");
        int idade = scanner.nextInt();

        //imprimindo os dados obtido pelo usuario 
        System.out.println("OLa me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
        scanner.close();
       }
       catch(InputMismatchException e) {
        System.out.println("O campos idade e altura precisam ser númericos");
       }
    }
}