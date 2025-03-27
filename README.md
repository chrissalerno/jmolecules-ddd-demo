## Overview

This serves as a sample project showcasing the use of the Simplified Onion Architecture in a Spring Boot application.
This project follows Domain Driven Design and clean architecture principles to ensure a clear separation of concerns and
maintainability.

The project is split into four main bounded contexts within the domain of selling circular products:
- **`Offers`**: Responsible for managing the offers for circular products.
- **`Search`**: Responsible for allowing users to search for offers.
- **`Reservation`**: Responsible for managing the reservations of offers.
- **`Notification`**: Responsible for communicating with users about their reservations.

## Features

The project follows the Simplified Onion Architecture to structure the respective microservices. It borrows ideas from both the
Ports/Adapters architecture and Onion Architecture.
The layers we use are:

- **Domain Layer (Core):**
    - **`Entities`:** These are the core business objects, typically plain objects or data models, representing concepts in your
      domain.
    - **`Value Objects`:** Objects that describe aspects of the domain with equality based on attributes rather than identity.
    - **`Aggregates and Domain Services`:** Collections of related entities and the business logic that operates on them.

- **Application Layer:**
    - **`Application Services`:** These services orchestrate the use of domain objects to fulfill use cases. They are responsible
      for application logic but not the business rules.
    - **`DTOs (Data Transfer Objects)`:** Used to transfer data between layers without exposing the core domain objects.

- **Infrastructure Layer:**
    - **`Repositories`:** Interfaces defined in the domain layer are implemented here to provide data access.
    - **`Data Mappers`:** Convert domain objects to database schemas and vice versa.
    - **`External Services`:** Integration points for other systems, APIs, or third-party libraries.

## jMolecules

This project uses the jMolecules library to enforce the DDD principles and structure the domain layer. jMolecules provides a set
of annotations to define the building blocks of DDD, such as `@ValueObject`, `@Entity`, and `@AggregateRoot`.
