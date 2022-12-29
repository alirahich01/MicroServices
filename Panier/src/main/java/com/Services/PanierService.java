package com.Services;

import com.Models.Panier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PanierService {

    public List<Panier> getAllitems();
    public Panier SaveItems(Panier panier);
    public void DeleteItems(String id);
}
