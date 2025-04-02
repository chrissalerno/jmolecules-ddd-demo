package io.chrissalerno.demo.notification.infrastructure.messaging;

import io.chrissalerno.demo.notification.application.services.NotificationService;
import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationCreatedConsumer {

  private final NotificationService notificationService;

  @Bean
  public Consumer<ReservationCreated> reservationCreated() {
    return reservationCreated ->
        notificationService.handleReservationCreated(
            reservationCreated.reservationId(),
            reservationCreated.reminderAt(),
            reservationCreated.expiresAt());
  }
}
