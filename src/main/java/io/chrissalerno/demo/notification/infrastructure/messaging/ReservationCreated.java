package io.chrissalerno.demo.notification.infrastructure.messaging;

import java.time.LocalDateTime;
import java.util.UUID;

public record ReservationCreated(
    UUID reservationId, LocalDateTime reminderAt, LocalDateTime expiresAt) {}
