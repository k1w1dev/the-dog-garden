package co.nz.thedoggarden.domain.booking;

import co.nz.thedoggarden.domain.dog.Dog;

import java.time.LocalDateTime;

public record Booking(LocalDateTime startDateTime, LocalDateTime endDateTime, Dog dog) { }
