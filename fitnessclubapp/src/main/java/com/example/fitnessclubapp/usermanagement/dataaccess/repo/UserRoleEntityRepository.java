package com.example.fitnessclubapp.usermanagement.dataaccess.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessclubapp.usermanagement.dataaccess.api.UserRoleEntity;

@Repository
public interface UserRoleEntityRepository extends CrudRepository<UserRoleEntity, Long> {
}
