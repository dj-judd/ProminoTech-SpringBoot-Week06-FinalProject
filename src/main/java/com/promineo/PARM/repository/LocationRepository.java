package com.promineo.PARM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.PARM.entity.Location;


@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
