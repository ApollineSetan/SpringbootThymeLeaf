package com.apolline.sitecda.controller;

import com.apolline.sitecda.model.Categorie;
import com.apolline.sitecda.model.Produit;
import com.apolline.sitecda.service.CategorieService;
import com.apolline.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategorieController {

    @Autowired
    private CategorieService categorieService;
    @Autowired
    private ProduitService produitService;

    @GetMapping("/categorie/{id}")
    public String getCategorie(@PathVariable Long id, Model model) {
        Categorie categorie = categorieService.findById(id);
        model.addAttribute("categorie", categorie);
        return "categorie";
    }

    @GetMapping("/categorie")
    public String getCategorie(Model model) {
        Iterable<Categorie> categories = categorieService.getCategories();
        model.addAttribute("categories", categories);
        return "categories";

    }


}