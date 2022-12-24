package com.iscae.Election.Model;

import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;

@Entity
public class Election {
    @OneToMany(mappedBy = "election" ,cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Etudient>  etudients = new ArrayList<>();
    @OneToMany(mappedBy = "election1" ,cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Syndicat>  syndicats = new ArrayList<>();

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "date_Debit", nullable = true, length = 100)
    private String dateDebit;
    @Basic
    @Column(name = "date_Fin", nullable = true, length = 100)
    private String dateFin;
    @Basic
    @Column(name = "sujet", nullable = true, length = 100)
    private String sujet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateDebit() {
        return dateDebit;
    }

    public void setDateDebit(String dateDebit) {
        this.dateDebit = dateDebit;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
