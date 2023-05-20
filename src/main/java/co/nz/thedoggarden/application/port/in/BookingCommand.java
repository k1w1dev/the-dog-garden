package co.nz.thedoggarden.application.port.in;

import io.micrometer.common.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record BookingCommand(BookingRequest bookingRequest) {

  public record BookingRequest(String dogName, String ownerName, LocalDateTime startDateTime, LocalDateTime endDateTime){}

  public BookingCommand(String dogName, String ownerName, String startDateTime, String endDateTime) {
    this(validate(dogName, ownerName, startDateTime, endDateTime));
  }

  private static BookingRequest validate(String dogName, String ownerName, String startDateTime, String endDatetime) {
    if (StringUtils.isBlank(dogName)) {
      throw new IllegalArgumentException("Dog name cannot be empty");
    }

    if (StringUtils.isBlank(ownerName)) {
      throw new IllegalArgumentException("Owner name cannot be empty");
    }

    if (StringUtils.isBlank(startDateTime)) {
      throw new IllegalArgumentException("Start date time cannot be blank");
    }

    if (StringUtils.isBlank(endDatetime)) {
      throw new IllegalArgumentException("End date time cannot be blank");
    }

    var startDT = LocalDateTime.parse(startDateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    var endDT = LocalDateTime.parse(endDatetime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

    if (startDT.isAfter(endDT)) {
      throw new IllegalArgumentException("Start date cannot be after end date");
    }

    return new BookingRequest(dogName, ownerName, startDT, endDT);
  }
}
