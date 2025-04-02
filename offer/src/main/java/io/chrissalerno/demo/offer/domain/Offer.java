package io.chrissalerno.demo.offer.domain;

import static io.chrissalerno.demo.offer.domain.Status.RESERVED;

import org.jmolecules.ddd.annotation.AggregateRoot;

@AggregateRoot
public record Offer(OfferId offerId, String title, Price price, StoreCode store, Status status) {

    public Offer reserveOffer() {
        return new Offer(offerId, title, price, store, RESERVED);
    }
}
