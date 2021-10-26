package TD3.visiteurs.commandes;

import TD3.Exceptions.MonException;
import TD3.visiteurs.PrePostVisitable;
import TD3.visiteurs.PrePostVisitor;
import TD3.visiteurs.Visitable;
import TD3.visiteurs.Visitor;

import java.util.HashMap;
import java.util.Map;

public class Client implements Visitable, PrePostVisitable {
    private String name;
    protected Map<String, Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande c) {
        this.commandes.put(c.getName(), c);
    }

    public void addLigne(String cdename, Ligne l) throws MonException {
        Commande c = this.commandes.get(cdename);
        if (c != null) {
            c.addLigne(l);
        } else throw new MonException("commande inconnue");
    }

    @Override
    public void accept(PrePostVisitor visiteur) {

    }

    @Override
    public void accept(Visitor visiteur) {

    }
}
