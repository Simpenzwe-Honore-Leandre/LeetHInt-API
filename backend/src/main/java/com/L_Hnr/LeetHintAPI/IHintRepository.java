package com.L_Hnr.LeetHintAPI;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHintRepository extends MongoRepository<Hint, Integer> {
}
