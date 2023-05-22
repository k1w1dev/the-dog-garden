package co.nz.thedoggarden.adapter.out.persistence.dog;

import co.nz.thedoggarden.application.port.out.FindDogPort;
import co.nz.thedoggarden.domain.dog.Dog;
import co.nz.thedoggarden.domain.owner.Owner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DogPersistenceAdapter implements FindDogPort {

  private DogRepository dogRepository;

  @Override
  public Dog findDog(String dogName) {
    return new Dog(dogName, LocalDate.of(2021, 12, 3), true, new Owner("anuj", "address", "contact"));
  }
}
