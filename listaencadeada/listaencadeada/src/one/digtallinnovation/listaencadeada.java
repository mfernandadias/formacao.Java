package one.digtallinnovation;

public class listaencadeada <T>{
    No<T> referenciaentrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrafa;
        while(true) {
            if(referenciaAux != null){
                tamanhoLista++;
                if(eferenciaAux.getProximoNo() != null) {

                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }
    public boolean isEmpty() {
        return referenciaEntrada == null ? true :
    }
}
