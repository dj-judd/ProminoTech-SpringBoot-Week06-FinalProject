package com.promineo.PARM.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
  @Enumerated(EnumType.STRING)
  @Column
  private UserPermissions permissions;
  
  @OneToMany(mappedBy="user")
  private List<Reservation> reservations;
  
}
