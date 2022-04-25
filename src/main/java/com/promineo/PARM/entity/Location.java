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
@Table(name="locations")
public class Location {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column
  private String street;
  @Column
  private String city;
  @Column
  private String state;
  @Column
  private String zip;
  @Column
  private String name;
  
}
