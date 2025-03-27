package io.chrissalerno.demo.notification.domain.repositories;

import java.util.List;

import io.chrissalerno.demo.notification.domain.Notification;
import io.chrissalerno.demo.notification.domain.ReservationId;

public interface NotificationRepository {

  void save(Notification notification);

  void saveAll(List<Notification> notifications);

  List<Notification> findPendingNotificationsToSend();

  void cancelByReservationId(ReservationId reservationId);
}
