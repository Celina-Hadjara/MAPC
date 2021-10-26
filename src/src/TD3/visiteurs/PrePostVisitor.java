package TD3.visiteurs;

import TD3.visiteurs.commandes.Client;
import TD3.visiteurs.commandes.Commande;
import TD3.visiteurs.commandes.GroupeClient;
import TD3.visiteurs.commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {
    public void preVisit(GroupeClient t);

    public void preVisit(Client t);

    public void preVisit(Commande t);

    public void preVisit(Ligne t);

    void postVisit(Commande commande);
}
