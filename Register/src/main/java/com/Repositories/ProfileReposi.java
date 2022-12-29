package com.Repositories;

import com.Models.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProfileReposi extends MongoRepository<Profile,String> {
}
