package com.example.fitnessclubapp.usermanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long userId;

  private String userName;

  private String firstName;

  private String lastName;

  private String password;

  private String emailId;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idRole")
  private UserRoleEntity userRole;

  public UserEntity(String userName, String firstName, String lastName, String password, String emailId,
      UserRoleEntity userRole) {

    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.emailId = emailId;
    this.userRole = userRole;
  }

  public UserRoleEntity getUserRole() {

    return this.userRole;
  }

  /**
   * @param userRole new value of {@link #getUserRole()}.
   */
  public void setUserRole(UserRoleEntity userRole) {

    this.userRole = userRole;
  }

}
