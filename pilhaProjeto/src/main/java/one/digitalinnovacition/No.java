package one.digitalinnovacition;

public class No {
    private int dado;
    private No refNo = null;

    public No() {

    }

    public No(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return refNo;
    }

    public void setReNo(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
