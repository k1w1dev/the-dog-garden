package co.nz.thedoggarden.application.common;

public class DogNotFoundException extends RuntimeException {
  public DogNotFoundException(String message) {
    super(message);
  }
}
