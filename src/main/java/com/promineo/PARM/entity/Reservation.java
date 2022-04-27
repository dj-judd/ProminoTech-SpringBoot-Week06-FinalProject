package com.promineo.PARM.entity;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="reservations")
public class Reservation {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
//Foreign Key Annotations
  
//  @OneToMany
//  @JoinColumn
//  private int location_fk;
  
//  @OneToMany
//  @JoinColumn
//  private int user_fk;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "location_fk")
  private Location location;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_fk")
  private User user;
  
  @Column
  private LocalDateTime res_date;
  @Column
  private LocalDateTime planned_checkin_date;
  @Column
  private LocalDateTime checkout_date;
  @Column
  private LocalDateTime checkin_date;
  @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=true)
  private String create_on;
  
  @ManyToMany
  @JoinTable(
      name = "res_assets", 
      joinColumns = @JoinColumn(name = "res_fk"), 
      inverseJoinColumns = @JoinColumn(name = "asset_fk"))
  Set<Asset> reservedAssets;
  
}
