package com.example.fitnessclubapp.usermanagement.logic.to;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Composite object of User Role.
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class UserRoleCto {

  private UserRoleEto userRoleEto;

  private List<UserEto> userEto;
}
