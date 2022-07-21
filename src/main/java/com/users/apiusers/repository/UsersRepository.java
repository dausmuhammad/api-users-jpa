package com.users.apiusers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.apiusers.model.UsersModel;

@Repository
public interface UsersRepository extends CrudRepository<UsersModel, String> {
    
}
