# Commercial Guidance — Back-end

Spring Boot 3.x service for the Commercial Guidance application.

## Tech stack

- Java 17
- Spring Boot 3.3.5
- Spring Web MVC
- Spring Boot Actuator
- Gradle (Groovy DSL) with wrapper

## Architecture

The codebase follows a hexagonal layout under `com.commercialguidance`:

- `domain` — entities and core business rules (no framework dependencies).
- `application` — use cases (interfaces + implementations) orchestrating the domain.
- `infrastructure` — adapters: REST controllers, persistence implementations, exception handlers, external integrations.

## Prerequisites

- JDK 17 (`java --version` must report 17.x).
- No local Gradle install required — use the included wrapper (`gradlew` / `gradlew.bat`).

## How to run

From the `back-end` folder:

### Windows (PowerShell or cmd)

```powershell
.\gradlew.bat bootRun
```

### macOS / Linux

```bash
./gradlew bootRun
```

The service starts on `http://localhost:8080`.

### Build a jar

```powershell
.\gradlew.bat clean build
java -jar build\libs\commercial-guidance-0.1.0-SNAPSHOT.jar
```

### Run tests

```powershell
.\gradlew.bat test
```

## Health check

With the app running:

```
GET http://localhost:8080/actuator/health
```

Expected response: `{"status":"UP"}`.

## Project layout

```
back-end/
├── build.gradle
├── settings.gradle
├── gradlew / gradlew.bat
├── gradle/wrapper/
└── src/
    ├── main/
    │   ├── java/com/commercialguidance/
    │   │   ├── CommercialGuidanceApplication.java
    │   │   ├── domain/
    │   │   ├── application/
    │   │   └── infrastructure/
    │   └── resources/application.yml
    └── test/java/com/commercialguidance/
```
