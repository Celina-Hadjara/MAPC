package cours3_Visitor.expression;

public class Nombre implements Expression {
    private int val;

    public Nombre(int val) {
        this.val = val;
    }

    @Override
    public String repr() {
        return String.format("%d", val);
    }

    @Override
    public int value() {
        return val;
    }

    @Override
    public int nbOperateurs() {
        return 0;
    }

    @Override
    public int nbLitteraux() {
        return 1;
    }
}
