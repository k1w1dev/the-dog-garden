package co.nz.thedoggarden.application.service;

import co.nz.thedoggarden.application.common.DogNotFoundException;
import co.nz.thedoggarden.application.port.in.BookingCommand;
import co.nz.thedoggarden.application.port.out.FindDogPort;
import co.nz.thedoggarden.domain.dog.Dog;
import co.nz.thedoggarden.domain.owner.Owner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(SpringExtension.class)
class CreateBookingServiceTest {

  @Mock
  private FindDogPort findDogPort;

  @InjectMocks
  private CreateBookingService underTest;


  @Test

  void whenBookingRequestIsValid_itCanSearchForDog() {
    var command = new BookingCommand("groot", "owner", "2023-05-22T08:00:00", "2023-05-22T17:00:00" );
    Mockito.when(findDogPort.findDog("groot")).thenReturn(new Dog("groot", LocalDate.of(2021, 12, 3), true, new Owner("anuj", "address", "contact")));
    underTest.createBooking(command);

    Mockito.verify(findDogPort).findDog("groot");

  }

  @Test
  void whenNoDogFound_thenItReturnsAnError() {
    var command = new BookingCommand("groot", "owner", "2023-05-22T08:00:00", "2023-05-22T17:00:00" );
    Mockito.when(findDogPort.findDog("groot")).thenReturn(null);

    assertThrows(DogNotFoundException.class, () -> underTest.createBooking(command));

  }

  @Test
  void whenMultipleDogsFound_thenItReturnsAnError() {

  }

  @Test
  void whenDogIsFound_itCanMatchOwners() {

  }

  @Test
  void whenOwnersDoNotMatch_thenItReturnsAnError() {

  }



}