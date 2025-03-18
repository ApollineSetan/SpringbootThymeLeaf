package com.apolline.sitecda.service;

import com.apolline.sitecda.model.Categorie;
import com.apolline.sitecda.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    //Récupérer toutes les catégories
    public Iterable<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    //Récupérer une catégorie par son id
    public Categorie findById(long id) {
        return categorieRepository.findById(id);
    }

    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

}