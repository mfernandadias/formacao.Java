package one.digtallinnovation;

public class No <T> {

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
        this.proximoNo = null;

    }

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public No(T conteudo, No procimoNo){
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }
}
