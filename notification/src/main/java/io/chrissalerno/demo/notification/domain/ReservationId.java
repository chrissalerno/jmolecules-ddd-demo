package io.chrissalerno.demo.notification.domain;

import static java.util.Objects.requireNonNull;

import java.util.UUID;

import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public record ReservationId(UUID id) {

  public ReservationId {
    requireNonNull(id, "ReservationId cannot be null");
  }
}
