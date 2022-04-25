package com.promineo.PARM.service;

import java.util.List;
import com.promineo.PARM.entity.User;

public interface UserService {
  
  //CREATE
  User saveUser(User user);
  
  //READ
  List<User> getAllUsers();
  
  
  //READY by ID, handles users by ID, READ by ID
  User getUserByID(int id);
  
  //UPDATE a user
  User updateUser(User user, int id);
  
  //DELETE a user
  void deleteUser(int id);
}
