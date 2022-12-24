package com.iscae.Election.Model;

import javax.persistence.*;

@Entity
public class Poste {
    @ManyToOne
    private Syndicat syndicat;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "libelle", nullable = true, length = 100)
    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
