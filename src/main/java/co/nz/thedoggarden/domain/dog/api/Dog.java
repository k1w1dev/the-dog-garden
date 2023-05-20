package co.nz.thedoggarden.domain.dog.api;

import co.nz.thedoggarden.domain.owner.api.Owner;

import java.time.LocalDate;

public interface Dog {

  public String name();

  public LocalDate dateOfBirth();

  public boolean neutered();

  public Owner owner();
}
