package io.chrissalerno.demo.offer.domain;

import static java.util.Objects.requireNonNull;

import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public record StoreCode(String value) {

  public StoreCode {
    requireNonNull(value, "StoreCode cannot be null");
  }

  public static StoreCode of(String value) {
    return new StoreCode(value);
  }
}
