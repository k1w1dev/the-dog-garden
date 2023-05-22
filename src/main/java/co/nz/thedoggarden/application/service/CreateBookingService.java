package co.nz.thedoggarden.application.service;

import co.nz.thedoggarden.application.common.DogNotFoundException;
import co.nz.thedoggarden.application.port.in.BookingCommand;
import co.nz.thedoggarden.application.port.in.CreateBookingUseCase;
import co.nz.thedoggarden.application.port.out.FindDogPort;
import org.springframework.stereotype.Service;


@Service
class CreateBookingService implements CreateBookingUseCase {

  private final FindDogPort findDogPort;

  public CreateBookingService(FindDogPort findDogPort) {
    this.findDogPort = findDogPort;
  }

  @Override
  public boolean createBooking(BookingCommand bookingCommand) {
    final var bookingRequest = bookingCommand.bookingRequest();
    final var dog = findDogPort.findDog(bookingRequest.dogName());

    if (null == dog) {
      throw new DogNotFoundException("Dog not found");
    }

    return false;
  }
}
