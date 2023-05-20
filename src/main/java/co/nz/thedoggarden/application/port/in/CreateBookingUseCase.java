package co.nz.thedoggarden.application.port.in;


public interface CreateBookingUseCase {

  boolean createBooking(BookingCommand bookingCommand);

}
