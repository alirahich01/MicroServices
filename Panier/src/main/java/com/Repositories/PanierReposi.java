package com.Repositories;

import com.Models.Panier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PanierReposi extends MongoRepository<Panier,String> {
}
