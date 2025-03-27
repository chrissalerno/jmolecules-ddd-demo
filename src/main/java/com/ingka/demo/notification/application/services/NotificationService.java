package com.ingka.demo.notification.application.services;

import com.ingka.demo.notification.domain.Notification;
import com.ingka.demo.notification.domain.ReservationId;
import com.ingka.demo.notification.domain.repositories.NotificationRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

  private final NotificationRepository notificationRepository;

  public void handleReservationCreated(
      UUID reservationId, LocalDateTime reminderAt, LocalDateTime expiresAt) {

    // create reminder notification
    Notification reminderNotification =
        Notification.reminderNotification(reservationId, reminderAt);

    // create expiration notification
    Notification expirationNotification =
        Notification.reminderNotification(reservationId, expiresAt);

    // save notifications
    notificationRepository.saveAll(List.of(reminderNotification, expirationNotification));
  }

  public void handleReservationCancelled(ReservationId reservationId) {
    notificationRepository.cancelByReservationId(reservationId);
  }
}
