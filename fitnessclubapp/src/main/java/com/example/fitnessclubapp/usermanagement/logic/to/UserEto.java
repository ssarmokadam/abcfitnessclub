package com.example.fitnessclubapp.usermanagement.logic.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Transfer Object of user entity.
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class UserEto {

  private Long userId;

  private String userName;

  private String firstName;

  private String lastName;

  private String password;

  private String emailId;
}
