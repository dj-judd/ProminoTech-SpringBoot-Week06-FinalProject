package com.promineo.PARM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column
  private String first_name;
  @Column
  private String last_name;
  @Column
  private String email;
  
// Wasn't working. enum was breaking the POST and GET
//  @Column
//  private UserPermissions permissions;

  @Column
  private String permissions;
  
}
