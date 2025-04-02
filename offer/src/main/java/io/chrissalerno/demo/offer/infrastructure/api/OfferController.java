package io.chrissalerno.demo.offer.infrastructure.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import io.chrissalerno.demo.offer.application.services.OfferService;
import io.chrissalerno.demo.offer.domain.StoreCode;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class OfferController {

  private final OfferService offerService;
  private final ConversionService conversionService;

  @GetMapping(value = "/{storeCode}", produces = APPLICATION_JSON_VALUE)
  public List<OfferDto> findPublishedOffersByStoreCode(@PathVariable String storeCode) {
    return offerService.searchByStoreCode(StoreCode.of(storeCode)).stream()
        .map(offer -> conversionService.convert(offer, OfferDto.class))
        .toList();
  }
}
