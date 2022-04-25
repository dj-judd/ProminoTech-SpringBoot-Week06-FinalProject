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
import com.promineo.PARM.entity.Asset;
import com.promineo.PARM.service.AssetService;

@RestController
@RequestMapping("/PARM_DB/assets")
public class AssetController {
  
  private AssetService assetService;

  public AssetController(AssetService assetService) {
    super();
    this.assetService = assetService;
  }

  
  //Build the CREATE asset REST API
  @PostMapping
  public ResponseEntity<Asset> saveAsset(@RequestBody Asset asset){
    return new ResponseEntity<Asset>(assetService.saveAsset(asset), HttpStatus.CREATED);
  }
  
  //Build the GET all Players
  @GetMapping
  public List<Asset> getAllAssets(){
    return assetService.getAllAssets();
  }
  
  //Build GET a asset by a single id
  @GetMapping("{asset_id}")
  public ResponseEntity<Asset> getAssetBy(@PathVariable("asset_id") int assetId){
    return new ResponseEntity<Asset>(assetService.getAssetByID(assetId), HttpStatus.OK);
  }
  
  //Update a asset
  @PutMapping("{asset_id}")
  public ResponseEntity<Asset> updateAsset(@PathVariable("asset_id") int assetId, @RequestBody Asset asset){
    return new ResponseEntity<Asset>(assetService.updateAsset(asset, assetId), HttpStatus.OK);
  }
  
  //Delete a asset
  @DeleteMapping("{asset_id}")
  public ResponseEntity<String> deleteAsset(@PathVariable("asset_id") int assetId){
    assetService.deleteAsset(assetId);
    
    return new ResponseEntity<String>("Asset has been deleted!", HttpStatus.OK);
  }
    
}
