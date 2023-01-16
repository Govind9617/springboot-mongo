package com.grt.springbootMongo.repository;

import com.grt.springbootMongo.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo,String> {
}
