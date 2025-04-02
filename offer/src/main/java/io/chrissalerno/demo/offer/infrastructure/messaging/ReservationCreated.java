package io.chrissalerno.demo.offer.infrastructure.messaging;

import static java.util.Objects.requireNonNull;

import java.util.UUID;

public record ReservationCreated(UUID offerId, UUID reservationId) {

    public ReservationCreated {
        requireNonNull(offerId, "OfferId cannot be null");
        requireNonNull(reservationId, "ReservationId cannot be null");
    }
}
