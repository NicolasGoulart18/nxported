# Nxported learning roadmap

This roadmap keeps the project useful while introducing one group of concepts
at a time.

## Phase 1 — Java core

- Model the supported platforms with an enum.
- Validate URLs.
- Detect the platform from a URL.
- Create domain exceptions.
- Add unit tests with JUnit.

**Learning focus:** classes, methods, enums, exceptions, packages and tests.

## Phase 2 — Extraction boundary

- Define a common extractor contract.
- Implement one extractor per platform.
- Keep platform-specific rules isolated.
- Represent video metadata in the domain.

**Learning focus:** interfaces, polymorphism, cohesion and low coupling.

## Phase 3 — External processes and HTTP

- Make HTTP requests when authorized.
- Integrate the selected media tool.
- Use FFmpeg for supported conversions.
- Manage temporary files safely.

**Learning focus:** HTTP, JSON, processes, files and error handling.

## Phase 4 — REST API

- Add Spring Boot.
- Create controllers, DTOs and services.
- Return consistent errors.
- Document the API.

**Learning focus:** REST, dependency injection and application layers.

## Phase 5 — Web interface

- Create the URL form.
- Display validation and processing states.
- Show video metadata.
- Offer the authorized download.

**Learning focus:** front-end integration and user experience.

## Phase 6 — Production readiness

- Add rate limiting.
- Create a processing queue if necessary.
- Delete temporary files automatically.
- Add monitoring and deployment documentation.
