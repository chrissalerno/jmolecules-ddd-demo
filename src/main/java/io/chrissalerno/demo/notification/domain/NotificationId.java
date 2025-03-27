package io.chrissalerno.demo.notification.domain;

import static com.fasterxml.uuid.Generators.timeBasedEpochGenerator;
import static java.util.Objects.requireNonNull;

import java.util.UUID;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public record NotificationId(UUID id) {

  public NotificationId {
    requireNonNull(id, "NotificationId cannot be null");
  }

  public static NotificationId createNotificationId() {
    return new NotificationId(timeBasedEpochGenerator().generate());
  }
}
