package io.chrissalerno.demo.offer.infrastructure.persistence.repositories.impl;

import static java.util.Optional.ofNullable;

import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.domain.OfferId;
import io.chrissalerno.demo.offer.domain.Status;
import io.chrissalerno.demo.offer.domain.StoreCode;
import io.chrissalerno.demo.offer.domain.repositories.OfferRepository;
import io.chrissalerno.demo.offer.infrastructure.persistence.OfferEntity;
import io.chrissalerno.demo.offer.infrastructure.persistence.OfferJPARepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class OfferRepositoryImpl implements OfferRepository {

  private final OfferJPARepository offerJPARepository;
  private final ConversionService conversionService;

  @Override
  public void save(Offer offer) {
    offerJPARepository.save(conversionService.convert(offer, OfferEntity.class));
  }

  @Override
  public Optional<Offer> findById(OfferId id) {
    UUID uuid = conversionService.convert(id, UUID.class);
    return offerJPARepository
        .findById(uuid)
        .map(entity -> conversionService.convert(entity, Offer.class));
  }

  @Override
  public List<Offer> findByStatusAndStore(Status status, StoreCode storeCode) {
    return offerJPARepository.findByStatusAndStore(status, storeCode.value()).stream()
        .map(offerEntity -> conversionService.convert(offerEntity, Offer.class))
        .toList();
  }
}
