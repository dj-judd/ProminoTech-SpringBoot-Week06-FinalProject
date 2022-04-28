package com.promineo.PARM.entity;

import java.util.Set;
import javax.persistence.CascadeType;
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
  private Integer id;
  
//Foreign Key Annotations
  
//  @OneToMany
//  @JoinColumn
//  private Integer location_fk;
  
//  @OneToMany
//  @JoinColumn
//  private Integer user_fk;
  
  @ManyToOne(fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
  @JoinColumn(name = "location_fk", insertable = true, updatable = true, nullable = false)
  private Location location;
  
  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "user_fk", insertable = true, updatable = true, nullable = false)
  private User user;
  
  @Column
  private String planned_checkout_date;
  
  @Column
  private String planned_checkin_date;
  
  @Column(nullable = true)
  private String checkout_date;
  
  @Column(nullable = true)
  private String checkin_date;
  
  @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
  private String date_create;
  
  @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=true)
  private String date_updated;
  
  @ManyToMany
  @JoinTable(
      name = "res_assets", 
      joinColumns = @JoinColumn(name = "res_fk"), 
      inverseJoinColumns = @JoinColumn(name = "asset_fk"))
  Set<Asset> reservedAssets;
  
  @Override  
  public String toString() {  
    return String.format("Reservation [id=%s, description=%s]", id);
  }
  
}
