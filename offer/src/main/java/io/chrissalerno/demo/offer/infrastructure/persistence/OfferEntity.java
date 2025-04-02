package io.chrissalerno.demo.offer.infrastructure.persistence;

import io.chrissalerno.demo.offer.domain.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "offer")
public class OfferEntity {

  @Id private UUID id;

  private String title;

  private BigDecimal price;

  private String store;

  @Enumerated(EnumType.STRING)
  private Status status;
}
