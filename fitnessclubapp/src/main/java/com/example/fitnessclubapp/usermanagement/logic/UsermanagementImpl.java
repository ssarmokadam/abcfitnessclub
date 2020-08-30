package com.example.fitnessclubapp.usermanagement.logic;

import java.util.Optional;

import javax.inject.Inject;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.fitnessclubapp.usermanagement.dataaccess.api.UserEntity;
import com.example.fitnessclubapp.usermanagement.dataaccess.repo.UserEntityRepo;
import com.example.fitnessclubapp.usermanagement.logic.to.UserEto;

/**
 * Logic layer implementation of Usermanagement.
 *
 */
@Component
public class UsermanagementImpl {

  @Inject
  private UserEntityRepo userEntityRepo;

  @Inject
  private ModelMapper mapper;

  public UserEto getUser(long id) {

    Optional<UserEntity> entity = this.userEntityRepo.findById(id);
    if (entity != null || !entity.isEmpty()) {
      UserEntity userEntity = entity.get();
      return this.mapper.map(userEntity, UserEto.class);
    }
    return new UserEto();
  }

  public UserEto saveOrUpdateUser(UserEto userEto) {

    UserEntity userEntity = this.mapper.map(userEto, UserEntity.class);
    UserEntity entity = this.userEntityRepo.save(userEntity);
    UserEto eto = this.mapper.map(entity, UserEto.class);
    return eto;

  }

  public boolean deleteUser(long id) {

    this.userEntityRepo.deleteById(id);
    Optional<UserEntity> entity = this.userEntityRepo.findById(id);
    if (entity == null || entity.isEmpty()) {
      return true;
    }
    return false;
  }
}
