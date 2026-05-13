# Changelog

All notable changes to the back-end project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial Spring Boot 3.3.5 / Java 17 scaffold (KAN-1).
- Gradle wrapper (8.10.2) — no local Gradle install required.
- Dependencies: `spring-boot-starter-web`, `spring-boot-starter-actuator`.
- Hexagonal package layout under `com.commercialguidance`: `domain`, `application`, `infrastructure`.
- `application.yml` exposing `health` and `info` actuator endpoints.
- README with run instructions.
- `.gitignore` for Gradle / Java / common IDEs.
