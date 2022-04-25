package com.promineo.PARM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.PARM.entity.Asset;


@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer>{

}
