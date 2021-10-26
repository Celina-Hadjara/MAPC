package cours3_Visitor.expression;

public interface Expression {
    String repr();

    int value();

    int nbOperateurs();

    int nbLitteraux();
}
