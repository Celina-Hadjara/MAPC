package TD3.visiteurs.commandes;

import TD3.Exceptions.MonException;
import TD3.visiteurs.PrePostVisitable;
import TD3.visiteurs.PrePostVisitor;
import TD3.visiteurs.Visitable;
import TD3.visiteurs.Visitor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Client> clients = null;

    public GroupeClient(String nomGroupe) {
        this.name = nomGroupe;
    }

    public GroupeClient(String name, Collection<Client> clients) {
        this.name = name;
        this.clients = new HashMap<String, Client>();
    }

    public String getName() {
        return name;
    }

    public Collection<Client> getClients() {
        return clients.values();
    }

    public void addClient(Client client) {
        this.clients.put(client.getName(), client);
    }

    public void addCommande(String cname, Commande cde) throws MonException {
        Client c = clients.get(cname);
        if (c != null) {
            c.addCommande(cde);
        } else throw new MonException("client inconnu");
    }

    public void addLigne(String cname, String cdename, Ligne l) throws MonException { // manque dans UML
        Client c = clients.get(cname);
        if (c != null) {
            c.addLigne(cdename, l);
        } else throw new MonException("client inconnu");
    }


    @Override
    public void accept(PrePostVisitor visiteur) {

    }

    @Override
    public void accept(Visitor visiteur) {

    }
}
