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
import com.promineo.PARM.entity.Reservation;
import com.promineo.PARM.service.ReservationService;

@RestController
@RequestMapping("/PARM_DB/reservations")
public class ReservationController {
  
  private ReservationService reservationService;

  public ReservationController(ReservationService reservationService) {
    super();
    this.reservationService = reservationService;
  }

  
  //Build the CREATE reservation REST API
  @PostMapping
  public ResponseEntity<Reservation> saveReservation(@RequestBody Reservation reservation){
    return new ResponseEntity<Reservation>(reservationService.saveReservation(reservation), HttpStatus.CREATED);
  }
  
  //Build the GET all Players
  @GetMapping
  public List<Reservation> getAllReservations(){
    return reservationService.getAllReservations();
  }
  
  //Build GET a reservation by a single id
  @GetMapping("{reservation_id}")
  public ResponseEntity<Reservation> getReservationBy(@PathVariable("reservation_id") int reservationId){
    return new ResponseEntity<Reservation>(reservationService.getReservationByID(reservationId), HttpStatus.OK);
  }
  
  //Update a reservation
  @PutMapping("{reservation_id}")
  public ResponseEntity<Reservation> updateReservation(@PathVariable("reservation_id") int reservationId, @RequestBody Reservation reservation){
    return new ResponseEntity<Reservation>(reservationService.updateReservation(reservation, reservationId), HttpStatus.OK);
  }
  
  //Delete a reservation
  @DeleteMapping("{reservation_id}")
  public ResponseEntity<String> deleteReservation(@PathVariable("reservation_id") int reservationId){
    reservationService.deleteReservation(reservationId);
    
    return new ResponseEntity<String>("Reservation has been deleted!", HttpStatus.OK);
  }
    
}
