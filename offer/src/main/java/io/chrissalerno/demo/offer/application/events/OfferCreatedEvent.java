package io.chrissalerno.demo.offer.application.events;

import io.chrissalerno.demo.offer.domain.Offer;

public record OfferCreatedEvent(Offer offer) {}
