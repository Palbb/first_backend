package com.nevermind.ReservationController;

import com.nevermind.Reservation.Reservation;
import com.nevermind.ReservationService.ReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(
            @PathVariable("id") Long id
    ) {
        return reservationService.getReservationById(id);
    }

    @GetMapping()
    public List<Reservation> getAllReservations(
    ) {
        return reservationService.findAllReservations();
    }
}
