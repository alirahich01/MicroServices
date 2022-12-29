package com.Controller;


import com.Models.Panier;
import com.Services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanierController {

    @Autowired
    PanierService panierService;

    @GetMapping("/Panier")
    public Panier AddItems (@RequestBody Panier panier){
        return panierService.SaveItems(panier);
    }

    @PostMapping("/Panier")
    public List<Panier> getAllItems(){
        return panierService.getAllitems();
    }

    @DeleteMapping("/Panier")
    public void DeleteItems (@PathVariable String id){
        panierService.DeleteItems(id);
    }
}
