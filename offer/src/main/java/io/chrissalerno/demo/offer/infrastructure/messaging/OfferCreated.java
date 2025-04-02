package io.chrissalerno.demo.offer.infrastructure.messaging;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;
import java.util.UUID;

public record OfferCreated(UUID offerId, String title, BigDecimal price, String storeCode) {

  public OfferCreated {
    requireNonNull(offerId, "OfferId cannot be null");
    requireNonNull(title, "Title cannot be null");
    requireNonNull(price, "Price cannot be null");
    requireNonNull(storeCode, "StoreCode cannot be null");
  }
}
