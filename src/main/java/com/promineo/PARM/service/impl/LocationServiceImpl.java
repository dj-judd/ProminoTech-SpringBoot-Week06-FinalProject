package com.promineo.PARM.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.PARM.entity.Location;
import com.promineo.PARM.exception.ResourceNotFoundException;
import com.promineo.PARM.repository.LocationRepository;
import com.promineo.PARM.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{
  //this is the dummy repository that will store our CRUD methods
  private LocationRepository locationRepository;
  
  public LocationServiceImpl(LocationRepository locationRepository) {
    super();
    this.locationRepository = locationRepository;
  }

  //CREATE
  @Override
  public Location saveLocation(Location location) {    
    return locationRepository.save(location);
  }

  @Override
  public List<Location> getAllLocations() {
    
    return locationRepository.findAll();
  }

  @Override
  public Location getLocationByID(int id) {
    //using a lambda!
    return locationRepository.findById(id).orElseThrow(
        () -> new ResourceNotFoundException("Location", "Id", id));
  }

  @Override
  public Location updateLocation(Location location, int id) {
    Location existingLocation = locationRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Location", "Id", id));
    
    existingLocation.setStreet(location.getStreet());
    existingLocation.setCity(location.getCity());
    existingLocation.setState(location.getState());
    existingLocation.setZip(location.getZip());
    existingLocation.setName(location.getName());
    
    locationRepository.save(existingLocation);
    
    return existingLocation;
  }

  @Override
  public void deleteLocation(int id) {
    Location existingLocation = locationRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Location", "Id", id));
    
    locationRepository.deleteById(id);
    
  }

}
