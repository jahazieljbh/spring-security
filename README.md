# Getting Started

## Requeriments
- Java 8 (JDK 1.8)
- Spring Framework 2 (Spring Boot - 2.7.13)
- Json Web Token (io.jsonwebtoken - 0.11.5)
- MySQL 8 (8.0.33)

## Run & Check
Run Spring Boot application with command:
```mvn
mvn spring-boot:run
```

We also need to add some rows into roles table before assigning any role to User.
Run following SQL insert statements:
```sql
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

### API Resources

  - [POST /api/auth/signup](#post-api-auth-signup)
  - [POST /api/auth/signin](#post-api-auth-signin)
  - [POST /api/auth/signout](#post-api-auth-signout)
  
  - [GET /api/test/all](#get-api-test-all)
  - [GET /api/test/user](#get-api-test-user)
  - [GET /api/test/mod](#get-api-test-mod)
  - [GET /api/test/admin](#get-api-test-admin)
  

### POST /api/auth/signup

Example Register User: http://localhost:8080/api/auth/signup

Resquest body:

    {
        "username": "user",
        "email": "user@gmail.com",
        "password": "newPassw0rd!",
        "role": ["user"]
    }

Response body:

    {
      "message": "User registered successfully!"
    }

### POST /api/auth/signin

Example Login an account: http://localhost:8080/api/auth/signin

Resquest body:

    {
        "username": "user",
        "password": "newPassw0rd!"
    }

Response body:

    {
      "id": 1,
      "username": "user",
      "email": "user@gmail.com",
      "roles": [
        "ROLE_USER"
      ]
    }

Check cookies:

### POST /api/auth/signout

Example Logout the Account: http://localhost:8080/api/auth/signout

Response body:

    {
      "message": "You've been signed out!"
    }

### GET /api/test/all

Example Logout the Account: http://localhost:8080/api/test/all

Response body:

    Public Content.

### GET /api/test/user

Example Logout the Account: http://localhost:8080/api/test/user

Response body:

    User Content.

### GET /api/test/mod

Example Logout the Account: http://localhost:8080/api/test/mod

Response body:

    Moderator Board.

### GET /api/test/admin

Example Logout the Account: http://localhost:8080/api/test/admin

Response body:

    Admin Board.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.13/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.13/maven-plugin/reference/html/#build-image)

### Solve Problem with JDK 14
```xml
Maven dependency: jakarta.xml.bind:jakarta.xml.bind-api:2.3.2
```