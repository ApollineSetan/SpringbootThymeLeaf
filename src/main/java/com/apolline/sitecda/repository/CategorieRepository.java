package com.apolline.sitecda.repository;

import com.apolline.sitecda.model.Categorie;
import com.apolline.sitecda.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer> {
    Categorie findById(Long id);
}