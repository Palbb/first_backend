package com.nevermind.Reservation;

import java.time.LocalDate;

public record Reservation(Long id,
                          Long userId,
                          Long roomId,
                          LocalDate startdate,
                          LocalDate endDate,
                          ReservationStatus status
) {

}
