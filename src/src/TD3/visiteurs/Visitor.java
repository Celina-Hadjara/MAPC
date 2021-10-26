package TD3.visiteurs;

import TD3.visiteurs.commandes.Client;
import TD3.visiteurs.commandes.Commande;
import TD3.visiteurs.commandes.GroupeClient;
import TD3.visiteurs.commandes.Ligne;

public interface Visitor extends AbstractVisitor {
    public void visit(GroupeClient t);

    public void visit(Client t);

    public void visit(Commande t);

    public void visit(Ligne t);
}
