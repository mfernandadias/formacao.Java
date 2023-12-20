package one.digitalinnovation;

public class Main {
    public static void main(String[] args){
        Pilha minhaPilha = new Pilha();

        minhapilha.push(new No(dado: 1));
        minhapilha.push(new No(dado: 2));
        minhapilha.push(new No(dado: 3));
        minhapilha.push(new No(dado: 4));
        minhapilha.push(new No(dado: 5));
        minhapilha.push(new No(dado: 6));


        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No(dado: 99));
    }
}
