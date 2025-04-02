package io.chrissalerno.demo.offer.infrastructure.messaging;

import io.chrissalerno.demo.offer.application.services.OfferService;
import io.chrissalerno.demo.offer.domain.OfferId;
import java.util.function.Consumer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Getter
@RequiredArgsConstructor
public class ReservationCreatedConsumer {

  private final ConversionService conversionService;
  private final OfferService offerService;

  @Bean
  public Consumer<ReservationCreated> reservationCreated() {
    return reservation -> {
      if (reservation != null) {
        offerService.reserveOffer(OfferId.of(reservation.offerId()));
      }
    };
  }
}
