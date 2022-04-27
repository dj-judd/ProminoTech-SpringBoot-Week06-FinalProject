package com.promineo.PARM.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.PARM.entity.Asset;
import com.promineo.PARM.exception.ResourceNotFoundException;
import com.promineo.PARM.repository.AssetRepository;
import com.promineo.PARM.service.AssetService;

@Service
public class AssetServiceImpl implements AssetService{
  //this is the dummy repository that will store our CRUD methods
  private AssetRepository assetRepository;
  
  public AssetServiceImpl(AssetRepository assetRepository) {
    super();
    this.assetRepository = assetRepository;
  }

  //CREATE
  @Override
  public Asset saveAsset(Asset asset) {    
    return assetRepository.save(asset);
  }

  @Override
  public List<Asset> getAllAssets() {
    
    return assetRepository.findAll();
  }

  @Override
  public Asset getAssetByID(int id) {
    //using a lambda!
    return assetRepository.findById(id).orElseThrow(
        () -> new ResourceNotFoundException("Asset", "Id", id));
  }

  @Override
  public Asset updateAsset(Asset asset, int id) {
    Asset existingAsset = assetRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Asset", "Id", id));
    
//    existingAsset.setLocation_fk(asset.getLocation_fk());
    existingAsset.setLocation_fk(asset.getLocation_fk());
    existingAsset.setCommon_name(asset.getCommon_name());
    existingAsset.setMake(asset.getMake());
    existingAsset.setModel(asset.getModel());
    existingAsset.setSerial_number(asset.getSerial_number());
    existingAsset.setStatus(asset.getStatus());
    
    assetRepository.save(existingAsset);
    
    return existingAsset;
  }

  @Override
  public void deleteAsset(int id) {
    Asset existingAsset = assetRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Asset", "Id", id));
    
    assetRepository.deleteById(id);
    
  }

}
