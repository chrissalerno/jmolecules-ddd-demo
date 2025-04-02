package io.chrissalerno.demo.offer.infrastructure.mappers;

import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.infrastructure.messaging.ExternalOffer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface ExternalOfferCreatedMapper extends Converter<ExternalOffer, Offer> {

  @Mapping(target = "offerId.id", source = "offerId")
  @Mapping(target = "price.amount", source = "price")
  @Mapping(target = "store.value", source = "storeCode")
  @Mapping(target = "status", constant = "PUBLISHED")
  Offer convert(ExternalOffer externalOffer);
}
