package TD3.visiteurs.commandes;

import TD3.visiteurs.PrePostVisitable;
import TD3.visiteurs.PrePostVisitor;
import TD3.visiteurs.Visitable;
import TD3.visiteurs.Visitor;

import java.util.Map;

public class Commande implements Visitable, PrePostVisitable {
    private String name;
    private Map<String, Ligne> lignes;

    public Commande(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addLigne(Ligne l) {
        this.lignes.put(l.getName(), l);
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        //boucle sur les enfants
        for (Ligne l : lignes.values()) {
            l.accept(prePostVisitor);// pas visit car si non on boucle plus sur les enfants
        }
        prePostVisitor.postVisit(this);

    }

    @Override
    public void accept(Visitor visitor) {
        for (Ligne l : lignes.values()) {
            l.accept(visitor);
        }
        visitor.visit(this);

    }
}
