package TP4;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private double solde;

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;

    @ManyToOne
    @JoinColumn(name = "client_nom", referencedColumnName = "nom")
    private Client client;

    public Compte() {
    }

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
