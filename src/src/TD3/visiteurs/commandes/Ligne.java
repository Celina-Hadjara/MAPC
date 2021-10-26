package TD3.visiteurs.commandes;

import TD3.visiteurs.PrePostVisitable;
import TD3.visiteurs.PrePostVisitor;
import TD3.visiteurs.Visitable;
import TD3.visiteurs.Visitor;

public class Ligne implements PrePostVisitable, Visitable {
    private String name;
    private int sum;

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = 0;
    }

    public Ligne(String name) {
        this.name = name;
        this.sum = 0;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void accept(PrePostVisitor visiteur) {

    }

    @Override
    public void accept(Visitor visiteur) {

    }
}
