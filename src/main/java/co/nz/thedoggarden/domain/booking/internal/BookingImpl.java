package co.nz.thedoggarden.domain.booking.internal;

import co.nz.thedoggarden.domain.booking.api.Booking;
import co.nz.thedoggarden.domain.dog.api.Dog;

import java.time.LocalDateTime;

record BookingImpl(LocalDateTime startDateTime, LocalDateTime endDateTime, Dog dog) implements Booking { }
