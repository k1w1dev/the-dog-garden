package co.nz.thedoggarden.domain.dog.internal;

import co.nz.thedoggarden.domain.dog.api.Dog;
import co.nz.thedoggarden.domain.owner.api.Owner;

import java.time.LocalDate;

record DogImpl(String name, LocalDate dateOfBirth, boolean neutered, Owner owner) implements Dog {
}
