package com.grt.springbootMongo.repository;

import com.grt.springbootMongo.collection.Person;
import io.swagger.models.auth.In;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstNameStartsWith(String name);

    //List<Person> fingByAgeBetween(Integer min, Integer max);
    @Query(value = "{'age': { $gt : ?0 , $lt : ?1 }}",fields = "{ adresses : 0 }")
    List<Person> findPersonAgeBetween(Integer min, Integer max);
}
