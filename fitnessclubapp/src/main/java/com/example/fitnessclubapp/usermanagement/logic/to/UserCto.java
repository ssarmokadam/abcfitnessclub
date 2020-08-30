package com.example.fitnessclubapp.usermanagement.logic.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Composite object of UserEntity.
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class UserCto {

  private UserEto userEto;

  private UserRoleEto userRoleEto;

}
