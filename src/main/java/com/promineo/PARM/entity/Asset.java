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
@Table(name="assets")
public class Asset {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column
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
  
// Wasn't working. enum was breaking the POST and GET
//  @Column
//  private AssetStatis status;

  @Column
  private String status;
  
}
