package com.apolline.sitecda.model;

import jakarta.persistence.*;

@Entity
@Table(name="produit")

public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name ="description", nullable = false, length = 50)
    private String description;

    @Column(name = "prix", nullable = false)
    private Double prix;

    @ManyToOne
    @JoinColumn(name = "id_produit_categorie")
    private Categorie categorie;

    public Produit() {
    }

    public Produit(String nom, String description, Double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", categorie=" + categorie +
                '}';
    }
}
