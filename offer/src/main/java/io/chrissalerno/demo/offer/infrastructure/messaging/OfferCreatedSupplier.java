package io.chrissalerno.demo.offer.infrastructure.messaging;

import io.chrissalerno.demo.offer.application.events.OfferCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.event.EventListener;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OfferCreatedSupplier {

  protected static final String OFFER_CREATED_EVENT_BINDING = "offerCreated-out-0";

  private final StreamBridge streamBridge;
  private final ConversionService conversionService;

  @EventListener
  public void publishOfferCreated(OfferCreatedEvent event) {
    OfferCreated offerCreated = conversionService.convert(event, OfferCreated.class);
    streamBridge.send(OFFER_CREATED_EVENT_BINDING, offerCreated);
  }
}
