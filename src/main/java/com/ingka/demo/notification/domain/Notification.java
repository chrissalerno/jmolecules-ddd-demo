package com.ingka.demo.notification.domain;

import static com.fasterxml.uuid.Generators.timeBasedEpochGenerator;
import static java.util.Objects.requireNonNull;

import java.time.LocalDateTime;
import java.util.UUID;
import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;

@AggregateRoot
public record Notification(
    @Identity NotificationId notificationId,
    ReservationId reservationId,
    LocalDateTime dateToSend) {

  public Notification {
    requireNonNull(notificationId, "NotificationId cannot be null");
    requireNonNull(reservationId, "ReservationId cannot be null");
    requireNonNull(dateToSend, "DateToSend cannot be null");
  }

  public static Notification reminderNotification(UUID reservationId, LocalDateTime dateToSend) {
    return new Notification(
        new NotificationId(timeBasedEpochGenerator().generate()),
        new ReservationId(reservationId),
        dateToSend);
  }

  public static Notification customerConfirmationNotification(
      UUID reservationId, LocalDateTime dateToSend) {
    return new Notification(
        new NotificationId(timeBasedEpochGenerator().generate()),
        new ReservationId(reservationId),
        dateToSend);
  }

  public static Notification storeConfirmationNotification(
      UUID reservationId, LocalDateTime dateToSend) {
    return new Notification(
        new NotificationId(timeBasedEpochGenerator().generate()),
        new ReservationId(reservationId),
        dateToSend);
  }
}
