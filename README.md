# AOP-Based Payment Processing System

This project demonstrates the implementation of Aspect-Oriented Programming (AOP) in a payment processing system using Spring AOP. It includes logging and tracking functionality using `@Before` and `@After` advice.

## Features

- **Aspect-Oriented Programming (AOP):** Implements `@Before` and `@After` advice to log messages before and after the execution of payment methods.
- **Spring Dependency Injection:** Uses Spring framework to manage dependencies.
- **Service Layer Abstraction:** Defines a `PaymentService` interface with `PaymentServiceImpl` as the concrete implementation.
- **XML-Based Configuration:** Uses `spring-config.xml` to configure beans and enable AOP.

## Package Structure

```
org.example.aop.aspect
│── MyAspect.java          # Aspect class to log before and after payment method execution
org.example
│── PaymentService.java    # Interface defining payment methods
│── PaymentServiceImpl.java # Implementation of PaymentService
│── spring-config.xml       # Spring AOP configuration file
```

## Installation & Setup

1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd <project-folder>
   ```

2. Add Spring dependencies to your `pom.xml` (if using Maven):
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-context</artifactId>
           <version>5.3.20</version>
       </dependency>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-aop</artifactId>
           <version>5.3.20</version>
       </dependency>
   </dependencies>
   ```

3. Ensure the `spring-config.xml` file is correctly placed in the classpath.

## How It Works

1. **MyAspect Class**:
   - Uses `@Before` to log messages before payment execution.
   - Uses `@After` to log messages after payment execution.

2. **PaymentService Interface**:
   - Defines `makePayment()` and `accountBalance(int x)` methods.

3. **PaymentServiceImpl Class**:
   - Implements `PaymentService` methods to simulate debiting and crediting an amount.

4. **Spring XML Configuration**:
   - Enables AspectJ auto-proxying.
   - Declares beans for `PaymentServiceImpl` and `MyAspect`.

## Usage

1. Initialize Spring Context:
   ```java
   ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
   PaymentService paymentService = context.getBean("payment", PaymentService.class);
   paymentService.makePayment();
   ```

2. Expected Console Output:
   ```
   Payment Started (This message is from Aspect)
   Total Amount
   Amount Debited
   Amount Credited
   Amount Left
   After Payment
   ```

## Technologies Used

- **Java**
- **Spring Framework**
- **Aspect-Oriented Programming (AOP)**

## Author

Developed by **Rohit Sah**.

