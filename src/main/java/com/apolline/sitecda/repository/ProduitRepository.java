package com.apolline.sitecda.repository;
import com.apolline.sitecda.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    Produit findById(long id);
}
