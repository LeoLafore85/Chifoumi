package TP4;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assurance_vie")
public class AssuranceVie extends Compte {
    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private double taux;

    public AssuranceVie() {
    }

    public LocalDate getDateFin() {
        return dateFin;
    }
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
}
