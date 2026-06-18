# domain-middletier

Maven multi-module project with a Spring Modulith module.

Defaults:
- Java: 21
- Spring Boot: 4.1.0

Modules:
- modulith: Spring Modulith based module with a sample greeting endpoint (/hello)

To build:

    mvn -T 1C clean package

To run modulith module:

    mvn -pl domain-mt-modulith-service spring-boot:run

Developer setup:

- Project requires Java 21.
- If using VSCode, workspace settings file (.vscode/settings.json) sets Java home to detected JDK and configures runtime.
- Use Maven wrapper: ./mvnw
