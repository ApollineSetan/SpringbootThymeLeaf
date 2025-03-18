package com.apolline.sitecda.controller;

import com.apolline.sitecda.model.Categorie;
import com.apolline.sitecda.service.CategorieService;
import com.apolline.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        Iterable<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }

    @GetMapping("/categorie/add")
    public String addCategorie(Model model){
        Categorie categorie = new Categorie();
        model.addAttribute("categorie", categorie);
        return "categorie_add";
    }

    @PostMapping("/categorie")
    public String saveCategorie(@ModelAttribute("categorie") Categorie categorie) {
        categorieService.saveCategorie(categorie);
        return "redirect:/categorie";
    }
}