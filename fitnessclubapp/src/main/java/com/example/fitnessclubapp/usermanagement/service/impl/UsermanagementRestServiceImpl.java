package com.example.fitnessclubapp.usermanagement.service.impl;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitnessclubapp.usermanagement.logic.UsermanagementImpl;
import com.example.fitnessclubapp.usermanagement.logic.to.UserEto;

/**
 * Implementation of CRUD operation of user management rest services.
 *
 */
@RestController
public class UsermanagementRestServiceImpl {

  @Inject
  private UsermanagementImpl usermanagementImpl;

  @GetMapping("/user/{id}/")
  public UserEto getUser(@PathVariable long id) {

    return this.usermanagementImpl.getUser(id);
  }

  @PostMapping("/user/")
  public UserEto saveOrUpdateUser(@RequestBody UserEto userEto) {

    UserEto eto = this.usermanagementImpl.saveOrUpdateUser(userEto);
    return eto;

  }

  @DeleteMapping("/deleteuser/{id}/")
  public boolean deleteUser(@PathVariable long id) {

    return this.usermanagementImpl.deleteUser(id);
  }

  @GetMapping("/hello/")
  public String sayHello() {

    return "Hello User";
  }

}
