# Calculator REST Service

A simple REST API built with Spring Boot that performs addition on a given list of comma-separated numbers and returns the sum as JSON.

---

## Features

- Endpoint: `/calculator/add?operands=7,-7`
- Returns: `{ "sum": 0 }`
- Supports any number of operands
- Handles invalid inputs gracefully by ignoring them
- Unit tests to verify functionality

---

## Prerequisites

Make sure you have the following installed on your system:

- **Java JDK 17** or higher  
  Download and install from: https://adoptium.net/

- **Apache Maven** (for building the project)  
  Download and install from: https://maven.apache.org/install.html

- An IDE like **IntelliJ IDEA**, **Eclipse**, or you can use any text editor and run from command line

---

## How to Build and Run

1. Clone or download the repository.

2. Open a terminal and navigate to the project root directory (where `pom.xml` is located).

3. Build the project (this will also run the tests):

```bash
mvn clean install
```

4. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will start on port 8080.

---

## Usage

Make GET requests to the endpoint with the `operands` query parameter:

Example with curl:

```bash
curl "http://localhost:8080/calculator/add?operands=7,-7"
# Response: {"sum":0}

curl "http://localhost:8080/calculator/add?operands=42"
# Response: {"sum":42}

curl "http://localhost:8080/calculator/add?operands=1,2,3,abc,4"
# Response: {"sum":10}  (ignores "abc")
```

---

## Running Unit Tests

To run the unit tests independently:

```bash
mvn test
```

All tests are located under `src/test/java/com/example/calculator/controller/CalculatorControllerTest.java`.

---

## Notes

- Invalid or non-numeric operands are ignored.
- If no operands or empty string is provided, the sum defaults to 0.
- Designed with simplicity and extensibility in mind.
```
