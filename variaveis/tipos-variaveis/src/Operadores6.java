public class Operadores6 {
    
    public static void main(String[] args) {

        String nomeUm = "GLEYSON";
        String nomeDois = new String("Gleyson");

        int numero1 = 1; 
        int numero2 = 2; 

        boolean simNao = numero1 == numero2; 

        if(numero1 < numero2) {
            System.out.println(" a nossa condição é verdadeira");
        }

        System.out.println(" numeroUm é igual a numeroDois? " + simNao);
    }
}
