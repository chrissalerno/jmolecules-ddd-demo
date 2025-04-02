package io.chrissalerno.demo.offer.infrastructure.mappers;

import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.infrastructure.api.OfferDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface OfferDtoMapper extends Converter<Offer, OfferDto> {

  @Mapping(source = "offerId.id", target = "offerId")
  @Mapping(source = "price.amount", target = "price")
  @Mapping(source = "store.value", target = "storeCode")
  OfferDto convert(Offer offer);
}
