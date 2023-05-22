package co.nz.thedoggarden.domain.dog;


import co.nz.thedoggarden.domain.owner.Owner;

import java.time.LocalDate;


public record Dog(String name, LocalDate dateOfBirth, boolean neutered, Owner owner) {
}
