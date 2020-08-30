package com.example.fitnessclubapp.usermanagement.dataaccess.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessclubapp.usermanagement.dataaccess.api.UserEntity;

@Repository
public interface UserEntityRepo extends CrudRepository<UserEntity, Long> {

}
