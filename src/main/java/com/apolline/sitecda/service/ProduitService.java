package com.apolline.sitecda.service;

import com.apolline.sitecda.model.Produit;
import com.apolline.sitecda.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    //Récupérer tous les produits
    public Iterable<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    //Récupérer un produit par son id
    public Produit getProduitById(Long id) {
        return produitRepository.findById((long) id);
    }

    public void saveProduit(Produit produit) {
        produitRepository.save(produit);
    }

}
