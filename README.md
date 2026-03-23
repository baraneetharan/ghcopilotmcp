# Demo Spring Boot App

Lightweight Spring Boot skeleton with Web, Spring Data JPA and PostgreSQL.

Build and run

1. Set up environment variables (example):

```bash
export DB_HOST=localhost
export DB_PORT=5432
export DB_NAME=demo
export DB_USER=postgres
export DB_PASSWORD=postgres
```

2. Build and run with Maven:

```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Development notes
- Database connection is configured via `src/main/resources/application.yml` and environment variables.
- Example REST endpoints: `GET /api/users`, `POST /api/users` (accepts JSON with `name` and `email`).
