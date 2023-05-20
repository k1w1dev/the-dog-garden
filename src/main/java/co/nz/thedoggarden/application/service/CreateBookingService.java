package co.nz.thedoggarden.application.service;

import co.nz.thedoggarden.application.port.in.BookingCommand;
import co.nz.thedoggarden.application.port.in.CreateBookingUseCase;
import org.springframework.stereotype.Service;


@Service
class CreateBookingService implements CreateBookingUseCase {

  @Override
  public boolean createBooking(BookingCommand bookingCommand) {
    return false;
  }
}
