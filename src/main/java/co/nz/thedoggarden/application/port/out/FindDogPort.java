package co.nz.thedoggarden.application.port.out;

import co.nz.thedoggarden.domain.dog.Dog;

public interface FindDogPort {

  Dog findDog(String dogName);
}
