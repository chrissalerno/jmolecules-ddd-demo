package io.chrissalerno.demo.offer.infrastructure.messaging;

import java.math.BigDecimal;
import java.util.UUID;

public record ExternalOffer(UUID offerId, String title, BigDecimal price, String storeCode) {}
