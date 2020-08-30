package com.example.fitnessclubapp.usermanagement.dataaccess.api;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class UserRoleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long userRoleId;

  private String userRoleName;

  private Boolean active;

  @OneToMany(mappedBy = "userRole", fetch = FetchType.EAGER)
  private List<UserEntity> users;

  /**
   * @return users
   */

  public List<UserEntity> getUsers() {

    return this.users;
  }

  /**
   * @param users new value of {@link #getusers}.
   */
  public void setUsers(List<UserEntity> users) {

    this.users = users;
  }
}
