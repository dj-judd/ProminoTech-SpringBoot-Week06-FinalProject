package com.promineo.PARM.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="assets")
public class Asset {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
//Foreign Key Annotations
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn
//  private int location_fk;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "location_fk")
  private Location location;
  
  @Column
  private String common_name;
  @Column
  private String make;
  @Column
  private String model;
  @Column
  private String model_number;
  @Column
  private String serial_number;
  @Enumerated(EnumType.STRING)
  @Column
  private AssetStatus status;
  
  @ManyToMany(mappedBy = "reservedAssets")
  Set<Reservation> assetReservations;
  
//  @OneToMany(mappedBy = "assets", cascade = CascadeType.ALL, orphanRemoval = false)
//  private List<Reservation> reservations = new ArrayList<>();

//---------------------------------------------
//Change enum list to 2 Bools for status
//
//Condition (Bool):   True  = Good
//                    False = Damaged
//          
//Operational (Bool): True  = Working
//                    False = Broken
//---------------------------------------------
  
}
