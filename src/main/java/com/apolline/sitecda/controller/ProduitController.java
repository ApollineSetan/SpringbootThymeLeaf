package com.apolline.sitecda.controller;

import com.apolline.sitecda.model.Produit;
import com.apolline.sitecda.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("firstname", "Apolline");
        return "index";
    }

    @GetMapping("/produit")
    public String produit(Model model) {
        Produit produit = new Produit("Livre", "Description de ce magnifique livre", 14.99);
        model.addAttribute("produit", produit);
        return "produit";
    }

    @GetMapping("/helloworld/{firstname}")
    public String helloFirstName(@PathVariable String firstname, Model model) {
        model.addAttribute("firstname", firstname);
        return "hellofirstname";
    }

    @GetMapping("/produit/{id}")
    public String getProduitById(@PathVariable Long id, Model model) {
        Produit produit = produitService.getProduitById(id);
        model.addAttribute("produit", produit);
        return "produit";
    }


}
