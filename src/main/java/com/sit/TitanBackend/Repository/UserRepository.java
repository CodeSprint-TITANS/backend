package com.sit.TitanBackend.Repository;

import com.sit.TitanBackend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
