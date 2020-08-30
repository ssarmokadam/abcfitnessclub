package com.example.fitnessclubapp.usermanagement.logic.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Transfer Object of user role.
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class UserRoleEto {

  private Long userRoleId;

  private String userRoleName;

  private Boolean active;
}
