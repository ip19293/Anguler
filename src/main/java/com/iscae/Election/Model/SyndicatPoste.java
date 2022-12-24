package com.iscae.Election.Model;

import javax.persistence.*;

@Entity
@Table(name = "syndicat_poste", schema = "election_db", catalog = "")
public class SyndicatPoste {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "FK_Syndicat", nullable = false)
    private int fkSyndicat;
    @Basic
    @Column(name = "FK_Poste", nullable = false)
    private int fkPoste;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkSyndicat() {
        return fkSyndicat;
    }

    public void setFkSyndicat(int fkSyndicat) {
        this.fkSyndicat = fkSyndicat;
    }

    public int getFkPoste() {
        return fkPoste;
    }

    public void setFkPoste(int fkPoste) {
        this.fkPoste = fkPoste;
    }
}
