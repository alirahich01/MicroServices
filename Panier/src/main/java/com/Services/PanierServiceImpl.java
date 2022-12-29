package com.Services;

import com.Models.Panier;
import com.Repositories.PanierReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierServiceImpl implements PanierService{

    @Autowired
    PanierReposi panierReposi;

    @Override
    public List<Panier> getAllitems() {
        return panierReposi.findAll();
    }

    @Override
    public Panier SaveItems(Panier panier) {
        return panierReposi.save(panier);
    }

    @Override
    public void DeleteItems(String id) {
        panierReposi.deleteById(id);
    }
}
