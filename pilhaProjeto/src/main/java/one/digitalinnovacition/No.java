package one.digitalinnovacition;

public class No {
    private int dado;
    private No reNo = null;

    public No() {

    }

    public No(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
