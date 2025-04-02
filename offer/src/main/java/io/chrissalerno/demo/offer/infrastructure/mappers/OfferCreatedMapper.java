package io.chrissalerno.demo.offer.infrastructure.mappers;

import io.chrissalerno.demo.offer.application.events.OfferCreatedEvent;
import io.chrissalerno.demo.offer.infrastructure.messaging.OfferCreated;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface OfferCreatedMapper extends Converter<OfferCreatedEvent, OfferCreated> {

    @Mapping(target = "offerId", source = "offer.offerId.id")
    @Mapping(target = "title", source = "offer.title")
    @Mapping(target = "price", source = "offer.price.amount")
    @Mapping(target = "storeCode", source = "offer.store.value")
    OfferCreated convert(OfferCreatedEvent offerCreatedEvent);
}
