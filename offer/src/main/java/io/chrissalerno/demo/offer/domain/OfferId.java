package io.chrissalerno.demo.offer.domain;

import static java.util.Objects.requireNonNull;

import java.util.UUID;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public record OfferId(UUID id) {

  public OfferId {
    requireNonNull(id, "OfferId cannot be null");
  }

  public static OfferId of(UUID id) {
    return new OfferId(id);
  }
}
