# Nxported

Nxported is a learning project for downloading authorized public videos from
multiple social platforms in one place.

The first version will recognize public TikTok and Instagram links, validate
the input and prepare the media for download. Private content and authentication
bypass are outside the project scope.

## Current status

The project currently contains only its Java foundation. The download logic will
be implemented incrementally so that each concept can be studied and tested.

## Technologies

- Java 21
- Maven
- JUnit 5
- Spring Boot in a later phase
- FFmpeg in a later phase

## Project structure

```text
src/
├── main/java/br/com/nicolas/nxported/
│   ├── Main.java
│   ├── exception/  Domain errors
│   ├── extractor/  Extraction contracts and platform integrations
│   ├── model/      Application objects and enums
│   └── service/    Validation and application rules
└── test/java/br/com/nicolas/nxported/
    └── service/    Service tests
```

## First milestone

1. Receive a URL.
2. Validate its format.
3. Identify TikTok or Instagram.
4. Reject unsupported platforms with a clear error.
5. Cover the behavior with automated tests.

See the complete learning path in [`docs/roadmap.md`](docs/roadmap.md).

## Running the project

Requirements:

- JDK 21
- Maven 3.9 or newer

```bash
mvn clean test
mvn package
java -cp target/classes br.com.nicolas.nxported.Main
```

## Responsible use

Use Nxported only with your own content or when you have permission from the
content owner. Users remain responsible for respecting copyright and each
platform's terms.
