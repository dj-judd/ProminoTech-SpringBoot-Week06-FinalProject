package com.promineo.PARM.service;

import java.util.List;
import com.promineo.PARM.entity.Location;

public interface LocationService {
  
  //CREATE
  Location saveLocation(Location location);
  
  //READ
  List<Location> getAllLocations();
  
  
  //READY by ID, handles location by ID, READ by ID
  Location getLocationByID(int id);
  
  //UPDATE a location by id
  Location updateLocation(Location location, int id);
  
  //DELETE a location by id
  void deleteLocation(int id);
}
