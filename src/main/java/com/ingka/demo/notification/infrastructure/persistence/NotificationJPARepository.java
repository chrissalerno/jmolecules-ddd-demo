package com.ingka.demo.notification.infrastructure.persistence;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationJPARepository extends JpaRepository<Notification, UUID> {}
