package TP4;

import jakarta.persistence.*;

@Entity
@Table(name = "livret_a")
public class LivretA extends Compte {
    @Column(name = "taux")
    private double taux;

    public LivretA() {
    }

    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
}
