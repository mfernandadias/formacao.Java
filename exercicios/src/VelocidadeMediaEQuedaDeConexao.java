import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão
    public static void main(String[] args){

        //leitura da entrada do usuário
        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine(); //lê a string de entrada

        //seprar os valores da string com base na vírgula
        String[] velocidadesString = entrada.split(",");

        boolean houveQueda = false;

        //verificação de cada velocidade para detectar quedas
        for(String velocidade : velocidadesString){
            int valorVelocidade = Integer.parseInt(velocidade.trim());
            if(valorVelocidade == 0){
                System.out.println("Queda da conexao");
                houveQueda = true;
                break/ //interrompe o loop, pois já encontramos uma queda
            }
        }

        //se nenhuma queda foi encontrada, imprime "Sem queda"
        if(!houveQueda){
            System.out.println("Sem Quedas");
        }
        scan.close();
    }
}
