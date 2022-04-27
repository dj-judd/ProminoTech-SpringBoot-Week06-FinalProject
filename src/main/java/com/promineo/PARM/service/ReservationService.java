package com.promineo.PARM.service;

import java.util.List;
import com.promineo.PARM.entity.Reservation;

public interface ReservationService {
  
  //CREATE
  Reservation saveReservation(Reservation reservation);
  
  //READ
  List<Reservation> getAllReservations();
  
  
  //READ by ID, handles reservations by ID, READ by ID
  Reservation getReservationByID(int id);
  
  //UPDATE a reservation
  Reservation updateReservation(Reservation reservation, int id);
  
  //DELETE a reservation
  void deleteReservation(int id);
}
