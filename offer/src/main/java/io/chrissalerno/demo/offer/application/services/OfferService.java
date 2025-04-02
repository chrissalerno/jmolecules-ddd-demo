package io.chrissalerno.demo.offer.application.services;

import static io.chrissalerno.demo.offer.domain.Status.PUBLISHED;

import io.chrissalerno.demo.offer.application.events.OfferCreatedEvent;
import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.domain.OfferId;
import io.chrissalerno.demo.offer.domain.StoreCode;
import io.chrissalerno.demo.offer.domain.repositories.OfferRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OfferService {

  private final OfferRepository offerRepository;
  private final ApplicationEventPublisher eventPublisher;
  private final ConversionService conversionService;

  public void handleOfferCreated(Offer offer) {
    offerRepository.save(offer);
    eventPublisher.publishEvent(new OfferCreatedEvent(offer));
  }

  public List<Offer> searchByStoreCode(StoreCode storeCode) {
    return offerRepository.findByStatusAndStore(PUBLISHED, storeCode);
  }

  public void reserveOffer(OfferId offerId) {
    offerRepository
        .findById(offerId)
        .ifPresent(offer -> {
          Offer reservedOffer = conversionService.convert(offer, Offer.class).reserveOffer();
          offerRepository.save(reservedOffer);
        });
  }
}
