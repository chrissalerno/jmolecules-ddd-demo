package io.chrissalerno.demo.notification.infrastructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
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
public class Notification {

  @Id private UUID id;

  private UUID reservationId;

  private LocalDateTime dateToSend;

  private String messageData;

  private int retries;

  private UUID messageRequestId;
}
