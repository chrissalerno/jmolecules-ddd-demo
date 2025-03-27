package io.chrissalerno.demo.notification.infrastructure.messaging;

import io.chrissalerno.demo.notification.application.services.NotificationService;
import io.chrissalerno.demo.notification.domain.ReservationId;
import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationCancelledConsumer {

  private final NotificationService notificationService;

  @Bean
  public Consumer<ReservationCancelled> reservationCancelled() {
    return reservationCancelled ->
        notificationService.handleReservationCancelled(
            new ReservationId(reservationCancelled.reservationId()));
  }
}
