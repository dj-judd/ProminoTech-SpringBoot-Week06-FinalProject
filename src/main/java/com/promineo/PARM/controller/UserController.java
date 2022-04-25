package com.promineo.PARM.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.PARM.entity.User;
import com.promineo.PARM.service.UserService;

@RestController
@RequestMapping("/PARM_DB/users")
public class UserController {
  
  private UserService userService;

  public UserController(UserService userService) {
    super();
    this.userService = userService;
  }

  
  //Build the CREATE user REST API
  @PostMapping
  public ResponseEntity<User> saveUser(@RequestBody User user){
    return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
  }
  
  //Build the GET all Players
  @GetMapping
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }
  
  //Build GET a user by a single id
  @GetMapping("{user_id}")
  public ResponseEntity<User> getUserBy(@PathVariable("user_id") int userId){
    return new ResponseEntity<User>(userService.getUserByID(userId), HttpStatus.OK);
  }
  
  //Update a user
  @PutMapping("{user_id}")
  public ResponseEntity<User> updateUser(@PathVariable("user_id") int userId, @RequestBody User user){
    return new ResponseEntity<User>(userService.updateUser(user, userId), HttpStatus.OK);
  }
  
  //Delete a user
  @DeleteMapping("{user_id}")
  public ResponseEntity<String> deleteUser(@PathVariable("user_id") int userId){
    userService.deleteUser(userId);
    
    return new ResponseEntity<String>("User has been deleted!", HttpStatus.OK);
  }
    
}
