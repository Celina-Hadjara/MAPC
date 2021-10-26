package TD3.visiteurs;

public interface Visitable {
    void accept(PrePostVisitor visiteur);

    void accept(Visitor visiteur);
}
