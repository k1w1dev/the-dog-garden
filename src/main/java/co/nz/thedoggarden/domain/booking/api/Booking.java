package co.nz.thedoggarden.domain.booking.api;

import co.nz.thedoggarden.domain.dog.api.Dog;

import java.time.LocalDateTime;

public interface Booking {

  public LocalDateTime startDateTime();

  public LocalDateTime endDateTime();

  public Dog dog();

}
