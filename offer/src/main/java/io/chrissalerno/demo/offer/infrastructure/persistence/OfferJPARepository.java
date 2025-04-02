package io.chrissalerno.demo.offer.infrastructure.persistence;

import io.chrissalerno.demo.offer.domain.Status;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferJPARepository extends JpaRepository<OfferEntity, UUID> {

  List<OfferEntity> findByStatusAndStore(Status status, String store);
}
