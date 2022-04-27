package com.promineo.PARM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
  @ManyToOne
  @JoinColumn
  private int location_fk;
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

//  @Column
//  private String status;

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
