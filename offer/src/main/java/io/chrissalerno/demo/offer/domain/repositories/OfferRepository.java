package io.chrissalerno.demo.offer.domain.repositories;

import java.util.List;
import java.util.Optional;

import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.domain.OfferId;
import io.chrissalerno.demo.offer.domain.Status;
import io.chrissalerno.demo.offer.domain.StoreCode;
import io.chrissalerno.demo.offer.infrastructure.persistence.OfferEntity;

public interface OfferRepository {

  void save(Offer offer);

  Optional<OfferEntity> findById(OfferId id);

  List<Offer> findByStatusAndStore(Status status, StoreCode storeCode);
}
