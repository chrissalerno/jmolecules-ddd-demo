package io.chrissalerno.demo.offer.infrastructure.mappers;

import io.chrissalerno.demo.offer.domain.OfferId;
import java.util.UUID;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.extensions.spring.DelegatingConverter;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface OfferIdMapper extends Converter<UUID, OfferId> {

  @Override
  default OfferId convert(UUID value) {
    return OfferId.of(value);
  }

  @InheritInverseConfiguration
  @DelegatingConverter
  default UUID invertConvert(OfferId value) {
    return value.id();
  }
}
