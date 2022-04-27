package com.promineo.PARM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.PARM.entity.Reservation;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
