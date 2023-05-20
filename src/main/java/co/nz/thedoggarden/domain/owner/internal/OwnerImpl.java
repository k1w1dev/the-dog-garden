package co.nz.thedoggarden.domain.owner.internal;

import co.nz.thedoggarden.domain.owner.api.Owner;

record OwnerImpl(String name, String address, String contact) implements Owner {
}
