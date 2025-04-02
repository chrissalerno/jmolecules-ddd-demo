package io.chrissalerno.demo.notification.application.services;

import io.chrissalerno.demo.notification.domain.Notification;
import io.chrissalerno.demo.notification.domain.ReservationId;
import io.chrissalerno.demo.notification.domain.repositories.NotificationRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {

  private final NotificationRepository notificationRepository;

  public void handleReservationCreated(
      UUID reservationId, LocalDateTime reminderAt, LocalDateTime expiresAt) {

    // create reminder notification
    Notification reminderNotification =
        Notification.reminderNotification(reservationId, reminderAt);
    log.info("Notification reminder notification: {}", reminderNotification);

    // create expiration notification
    Notification expirationNotification =
        Notification.reminderNotification(reservationId, expiresAt);
    log.info("Notification expiration notification: {}", expirationNotification);

    // save notifications
    notificationRepository.saveAll(List.of(reminderNotification, expirationNotification));
  }

  public void handleReservationCancelled(ReservationId reservationId) {
    notificationRepository.cancelByReservationId(reservationId);
  }
}
