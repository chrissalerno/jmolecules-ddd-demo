package io.chrissalerno.demo.offer.infrastructure.api;

import static java.util.Objects.requireNonNull;

import java.math.BigDecimal;
import java.util.UUID;

public record OfferDto(UUID offerId, String title, BigDecimal price, String storeCode) {

    public OfferDto {
        requireNonNull(offerId, "Offer ID cannot be null");
        requireNonNull(title, "Title cannot be null");
        requireNonNull(price, "Price cannot be null");
        requireNonNull(storeCode, "Store code cannot be null");
    }
}
