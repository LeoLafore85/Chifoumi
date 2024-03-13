package TP4;

import jakarta.persistence.*;

@Entity
@Table(name = "virement")
public class Virement extends Operation {
    @Column(name = "beneficiaire")
    private String beneficiaire;

    public Virement() {
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }
    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
