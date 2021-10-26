package cours3_Visitor.expression;

public class Addition implements Expression {
    Expression opg;
    Expression opd;

    public Addition(Expression opg, Expression opd) {
        this.opg = opg;
        this.opd = opd;
    }

    @Override
    public String repr() {
        return String.format("(%s %s)", opg.repr(), opd.repr());
    }

    @Override
    public int value() {
        return opg.value() + opd.value();
    }

    @Override
    public int nbOperateurs() {
        return 1 + opg.nbOperateurs() + opd.nbOperateurs();
    }

    @Override
    public int nbLitteraux() {
        return opg.nbLitteraux() + opd.nbLitteraux();
    }
}
