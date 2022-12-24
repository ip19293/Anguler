package com.iscae.Election.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Candidat {
    @ManyToOne
    private Syndicat syndicat;
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "FK_Etudient", nullable = false)
    private int fkEtudient;

    public int getFkEtudient() {
        return fkEtudient;
    }

    public void setFkEtudient(int fkEtudient) {
        this.fkEtudient = fkEtudient;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "FK_Syndicat", nullable = false)
    private int fkSyndicat;

    public int getFkSyndicat() {
        return fkSyndicat;
    }

    public void setFkSyndicat(int fkSyndicat) {
        this.fkSyndicat = fkSyndicat;
    }
}
