package com.promineo.PARM.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
  private String name;
  
  @Column
  private String street;
  
  @Column
  private String city;
  
  @Column
  private String state;
  
  @Column
  private String zip;
  
  
  @OneToMany(mappedBy="location")
  private List<Reservation> reservations;
  

//  @OneToMany(mappedBy = "locations", cascade = CascadeType.ALL, orphanRemoval = false)
//  private List<Asset> assets = new ArrayList<>();
//  
//  @OneToMany(mappedBy = "locations", cascade = CascadeType.ALL, orphanRemoval = false)
//  private List<Reservation> reservations = new ArrayList<>();
  
}
