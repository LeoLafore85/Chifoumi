package TP4;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "banque")
    private List<Client> clients;

    public Banque() {
    }

    public Banque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}

