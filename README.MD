### Documentation
Swagger can be found in route /swagger-ui.html

### Configuration
Application properties:
```properties
spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/seller_center
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto = validate
```

As env variables
```env
spring_datasource_url=jdbc:postgresql://127.0.0.1:5432/seller_center
spring_datasource_driverClassName=org.postgresql.Driver
spring_datasource_username=postgres
spring_datasource_password=1234
spring_jpa_database-platform=org.hibernate.dialect.PostgreSQLDialect
spring_jpa_hibernate_ddl-auto=validate

```