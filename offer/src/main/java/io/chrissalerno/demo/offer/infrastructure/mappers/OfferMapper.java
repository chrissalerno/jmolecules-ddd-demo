package io.chrissalerno.demo.offer.infrastructure.mappers;

import io.chrissalerno.demo.offer.domain.Offer;
import io.chrissalerno.demo.offer.infrastructure.persistence.OfferEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.extensions.spring.DelegatingConverter;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface OfferMapper extends Converter<Offer, OfferEntity> {

  @Mapping(source = "offerId.id", target = "id")
  @Mapping(source = "price.amount", target = "price")
  @Mapping(source = "store.value", target = "store")
  OfferEntity convert(Offer offer);

  @InheritInverseConfiguration
  @DelegatingConverter
  Offer invertConvert(OfferEntity value);
}
