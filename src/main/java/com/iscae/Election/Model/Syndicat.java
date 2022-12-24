package com.iscae.Election.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Syndicat {
    @ManyToOne
    private Election election1;
    @OneToMany(mappedBy = "syndicat" ,cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Poste>  postes = new ArrayList<>();

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "syndicat_type", nullable = true, length = 100)
    private String syndicatType;
    @Basic
    @Column(name = "syndicat_nom", nullable = true, length = 100)
    private String syndicatNom;
    @Basic
    @Column(name = "logo", nullable = true, length = 100)
    private String logo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSyndicatType() {
        return syndicatType;
    }

    public void setSyndicatType(String syndicatType) {
        this.syndicatType = syndicatType;
    }

    public String getSyndicatNom() {
        return syndicatNom;
    }

    public void setSyndicatNom(String syndicatNom) {
        this.syndicatNom = syndicatNom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
