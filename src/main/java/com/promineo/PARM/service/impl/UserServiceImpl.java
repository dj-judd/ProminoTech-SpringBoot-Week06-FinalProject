package com.promineo.PARM.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.PARM.entity.User;
import com.promineo.PARM.exception.ResourceNotFoundException;
import com.promineo.PARM.repository.UserRepository;
import com.promineo.PARM.service.UserService;

@Service
public class UserServiceImpl implements UserService{
  //this is the dummy repository that will store our CRUD methods
  private UserRepository userRepository;
  
  public UserServiceImpl(UserRepository userRepository) {
    super();
    this.userRepository = userRepository;
  }

  //CREATE
  @Override
  public User saveUser(User user) {    
    return userRepository.save(user);
  }

  @Override
  public List<User> getAllUsers() {
    
    return userRepository.findAll();
  }

  @Override
  public User getUserByID(int id) {
    //using a lambda!
    return userRepository.findById(id).orElseThrow(
        () -> new ResourceNotFoundException("User", "Id", id));
  }

  @Override
  public User updateUser(User user, int id) {
    User existingUser = userRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("User", "Id", id));
    
    existingUser.setFirst_name(user.getFirst_name());
    existingUser.setLast_name(user.getLast_name());
    existingUser.setEmail(user.getEmail());
    existingUser.setPermissions(user.getPermissions());
    
    userRepository.save(existingUser);
    
    return existingUser;
  }

  @Override
  public void deleteUser(int id) {
    User existingUser = userRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("User", "Id", id));
    
    userRepository.deleteById(id);
    
  }

}
