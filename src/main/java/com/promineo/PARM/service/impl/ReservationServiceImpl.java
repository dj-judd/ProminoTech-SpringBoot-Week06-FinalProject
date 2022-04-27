package com.promineo.PARM.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineo.PARM.entity.Reservation;
import com.promineo.PARM.exception.ResourceNotFoundException;
import com.promineo.PARM.repository.ReservationRepository;
import com.promineo.PARM.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
  //this is the dummy repository that will store our CRUD methods
  private ReservationRepository reservationRepository;
  
  public ReservationServiceImpl(ReservationRepository reservationRepository) {
    super();
    this.reservationRepository = reservationRepository;
  }

  //CREATE
  @Override
  public Reservation saveReservation(Reservation reservation) {    
    return reservationRepository.save(reservation);
  }

  @Override
  public List<Reservation> getAllReservations() {
    
    return reservationRepository.findAll();
  }

  @Override
  public Reservation getReservationByID(int id) {
    //using a lambda!
    return reservationRepository.findById(id).orElseThrow(
        () -> new ResourceNotFoundException("Reservation", "Id", id));
  }

  @Override
  public Reservation updateReservation(Reservation reservation, int id) {
    Reservation existingReservation = reservationRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Reservation", "Id", id));
    
    existingReservation.setPlanned_checkout_date(reservation.getPlanned_checkout_date());
    existingReservation.setPlanned_checkin_date(reservation.getPlanned_checkin_date());
    existingReservation.setCheckout_date(reservation.getCheckout_date());
    existingReservation.setCheckin_date(reservation.getCheckin_date());
    
    reservationRepository.save(existingReservation);
    
    return existingReservation;
  }

  @Override
  public void deleteReservation(int id) {
    Reservation existingReservation = reservationRepository.findById(id).orElseThrow(
                        () -> new ResourceNotFoundException("Reservation", "Id", id));
    
    reservationRepository.deleteById(id);
    
  }

}
