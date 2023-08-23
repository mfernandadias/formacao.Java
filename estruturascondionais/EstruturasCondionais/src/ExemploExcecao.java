public class ExemploExcecao {
    
    public static void main(String[] args) {
        Number valor; 
        try {
            valor = NumberFormat.getInstance().parse("a11.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
