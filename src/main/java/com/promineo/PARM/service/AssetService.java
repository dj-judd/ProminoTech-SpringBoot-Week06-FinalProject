package com.promineo.PARM.service;

import java.util.List;
import com.promineo.PARM.entity.Asset;

public interface AssetService {
  
  //CREATE
  Asset saveAsset(Asset asset);
  
  //READ
  List<Asset> getAllAssets();
  
  
  //READY by ID, handles assets by ID, READ by ID
  Asset getAssetByID(int id);
  
  //UPDATE a asset
  Asset updateAsset(Asset asset, int id);
  
  //DELETE a asset
  void deleteAsset(int id);
}
