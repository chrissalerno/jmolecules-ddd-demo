package io.chrissalerno.demo.offer.infrastructure.messaging;

import java.util.function.Consumer;

import io.chrissalerno.demo.offer.application.services.OfferService;
import io.chrissalerno.demo.offer.domain.Offer;

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
public class ExternalOfferCreatedConsumer {

  private final ConversionService conversionService;
  private final OfferService offerService;

  @Bean
  public Consumer<ExternalOffer> externalOfferCreated() {
    return offerCreated -> {
      if (offerCreated != null) {
        Offer offer = conversionService.convert(offerCreated, Offer.class);
        offerService.handleOfferCreated(offer);
      }
    };
  }
}
