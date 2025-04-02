package io.chrissalerno.demo.notification.infrastructure.persistence.repositories.impl;

import io.chrissalerno.demo.notification.domain.Notification;
import io.chrissalerno.demo.notification.domain.ReservationId;
import io.chrissalerno.demo.notification.domain.repositories.NotificationRepository;
import io.chrissalerno.demo.notification.infrastructure.persistence.NotificationJPARepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class NotificationRepositoryImpl implements NotificationRepository {

  private final NotificationJPARepository notificationJPARepository;

  @Override
  public void save(Notification notification) {
    // convert from domain to persistence entity
    // save the entity
  }

  @Override
  public void saveAll(List<Notification> notifications) {
    // convert from domain to persistence entities
    // save the entities
  }

  @Override
  public List<Notification> findPendingNotificationsToSend() {
    // find pending notifications to send
    return List.of();
  }

  @Override
  public void cancelByReservationId(ReservationId reservationId) {
    // convert from domain value object to persistence UUID
    // cancel notification by reservation id
  }
}
