package com.apolline.sitecda.controller;

import com.apolline.sitecda.model.Categorie;
import com.apolline.sitecda.model.Produit;
import com.apolline.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("firstname", "Apolline");
        return "index";
    }

    @GetMapping("/produit/{id}")
    public String getProduitById(@PathVariable Long id, Model model) {
        Produit produit = produitService.getProduitById(id);
        model.addAttribute("produit", produit);
        return "produit";
    }

    @GetMapping("/produit")
    public String getAllProduits(Model model) {
        Iterable<Produit> produits = produitService.getAllProduits();
        model.addAttribute("produits", produits);
        return "produits";
    }

    @GetMapping("/produit/add")
    public String addProduit(Model model) {
        Produit produit = new Produit();
        model.addAttribute("produit", produit);
        return "produit_add";
    }

    @PostMapping("/produit")
    public String saveProduit(@ModelAttribute("produit") Produit produit) {
        produitService.saveProduit(produit);
        return "redirect:/produit";
    }

}
