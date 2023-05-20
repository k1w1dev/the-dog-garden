package co.nz.thedoggarden.adapter.in.web;

import co.nz.thedoggarden.application.port.in.CreateBookingUseCase;

public class BookingController {

  private final CreateBookingUseCase createBookingUseCase;

  public BookingController(CreateBookingUseCase createBookingUseCase) {
    this.createBookingUseCase = createBookingUseCase;
  }
}
