package co.nz.thedoggarden.application.port.in;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingCommandTest {

  private BookingCommand underTest;

  @Test
  void whenValidArgumentsAreProvided_thenCommandCanBeCreated() {
    underTest = new BookingCommand("Groot", "Anuj Sharma", "2023-05-12T08:00:00", "2023-05-12T17:00:00");

    assertNotNull(underTest.bookingRequest());

    assertEquals("Groot", underTest.bookingRequest().dogName());
    assertEquals("Anuj Sharma", underTest.bookingRequest().ownerName());
    assertEquals(LocalDateTime.of(2023, 05, 12, 8, 00, 00), underTest.bookingRequest().startDateTime());
    assertEquals(LocalDateTime.of(2023, 05, 12, 17, 00, 00), underTest.bookingRequest().endDateTime());

  }

  @Test
  void whenStartDateIsAfterEndDate_thenItThrowsAnException() {
    assertThrows(IllegalArgumentException.class, () -> {
      new BookingCommand("Groot", "Anuj Sharma", "2023-05-12T08:00:00", "2023-04-12T17:00:00");
    });
  }
  @Test
  void whenDogIsBlank_thenItThrowsAnException() {
    assertThrows(IllegalArgumentException.class, () -> {
      new BookingCommand("", "Anuj Sharma", "2023-05-12T08:00:00", "2023-05-12T17:00:00");
    });
  }

  @Test
  void whenOwnerIsBlank_thenItThrowsAnException() {
    assertThrows(IllegalArgumentException.class, () -> {
      new BookingCommand("Groot", "", "2023-05-12T08:00:00", "2023-05-12T17:00:00");
    });
  }

}