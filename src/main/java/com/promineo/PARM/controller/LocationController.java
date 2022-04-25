package com.promineo.PARM.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.PARM.entity.Location;
import com.promineo.PARM.service.LocationService;

@RestController
@RequestMapping("/PARM_DB/locations")
public class LocationController {
  
  private LocationService locationService;

  public LocationController(LocationService locationService) {
    super();
    this.locationService = locationService;
  }

  
  //Build the CREATE location REST API
  @PostMapping
  public ResponseEntity<Location> saveLocation(@RequestBody Location location){
    return new ResponseEntity<Location>(locationService.saveLocation(location), HttpStatus.CREATED);
  }
  
  //Build the GET all Players
  @GetMapping
  public List<Location> getAllLocations(){
    return locationService.getAllLocations();
  }
  
  //Build GET a location by a single id
  @GetMapping("{location_id}")
  public ResponseEntity<Location> getLocationBy(@PathVariable("location_id") int locationId){
    return new ResponseEntity<Location>(locationService.getLocationByID(locationId), HttpStatus.OK);
  }
  
  //Update a location
  @PutMapping("{location_id}")
  public ResponseEntity<Location> updateLocation(@PathVariable("location_id") int locationId, @RequestBody Location location){
    return new ResponseEntity<Location>(locationService.updateLocation(location, locationId), HttpStatus.OK);
  }
  
  //Delete a location
  @DeleteMapping("{location_id}")
  public ResponseEntity<String> deleteLocation(@PathVariable("location_id") int locationId){
    locationService.deleteLocation(locationId);
    
    return new ResponseEntity<String>("Location has been deleted!", HttpStatus.OK);
  }
    
}
