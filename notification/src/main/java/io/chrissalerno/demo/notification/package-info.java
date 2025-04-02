/**
 * This module is intended to handle all interactions with Notifications, including the
 * creation/scheduling/cancellation of notifications originating through external services such as
 * the Reservation Service.
 *
 * <p>The module is designed to be scalable and maintainable, following the Onion Architecture:
 *
 * <ul>
 *   <li>Domain Ring: This package is the core of the application, focusing on business concepts.
 *   <li>Application Ring: This package orchestrates the flow of data to and from the domain model.
 *   <li>Infrastructure Ring: This package contains infrastructure-related components such as
 *       databases.
 * </ul>
 */
package io.chrissalerno.demo.notification;
