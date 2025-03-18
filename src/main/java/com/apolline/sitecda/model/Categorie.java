package com.apolline.sitecda.model;

import jakarta.persistence.*;

@Entity
@Table(name="categorie")

public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle", nullable = false, length = 50)
    private String libelle;

    public Categorie() {
    }

    public Categorie(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
