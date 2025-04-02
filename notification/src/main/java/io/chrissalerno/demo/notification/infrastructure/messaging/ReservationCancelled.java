package io.chrissalerno.demo.notification.infrastructure.messaging;

import static java.util.Objects.requireNonNull;

import java.util.UUID;

public record ReservationCancelled(UUID reservationId) {

  public ReservationCancelled {
    requireNonNull(reservationId, "ReservationId cannot be null");
  }
}
