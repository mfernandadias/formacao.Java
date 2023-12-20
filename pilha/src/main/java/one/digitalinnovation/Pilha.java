package one.digitalinnovation;

public class Pilha {

    private No refNoEntradadaPilha;

    public Pilha() {
        this.refNoEntradadaPilha = null;
    }
    
    public No top(){

    }
    public boolean isEmpty(){
        if(refNoEntradaPilha == null ){
            return true;
        }
        return false;
        return refNoEntradaPilha == null ? true : false;
    }

}
