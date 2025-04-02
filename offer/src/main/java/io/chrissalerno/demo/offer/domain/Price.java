package io.chrissalerno.demo.offer.domain;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public record Price(BigDecimal amount) {

  public Price {
    requireNonNull(amount, "Price cannot be null");
  }
}
