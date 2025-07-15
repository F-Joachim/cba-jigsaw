# Component based architecture with Java Jigsaw

**cba-jigsaw** is a demonstration and template project for building Java applications using a **Component-Based Architecture (CBA)**, leveraging the modularization features provided by **Java's Jigsaw module system**. This repository is intended as a starting point for developers who want to structure their codebase into reusable, decoupled components, each packaged as a Java module.

## What is Component-Based Architecture (CBA)?

Component-Based Architecture is a software design paradigm where the application is composed of loosely coupled, independently deployable components. Each component encapsulates a set of related functionality, exposing clear interfaces and hiding internal implementation details. This promotes reusability, maintainability, and testability.

## What is Jigsaw?

**Jigsaw** is the codename for the Java Platform Module System (JPMS), introduced in Java 9. It enables developers to organize their code into modules, define inter-module dependencies, and enforce strong encapsulation at the language level.

## Features

- Example of organizing Java code using modules (`module-info.java`)
- Clear separation of concerns between components
- Demonstrates how to declare dependencies between modules
- Encapsulates implementation details within modules
- Ready to extend for your own CBA projects

## Repository Structure

```
cba-jigsaw/
├── component-a/
│   ├── src/
│   │   └── main/java/
│   └── module-info.java
├── component-b/
│   ├── src/
│   │   └── main/java/
│   └── module-info.java
├── app/
│   ├── src/
│   │   └── main/java/
│   └── module-info.java
├── README.md
└── ...
```

- **component-a/**, **component-b/**: Example modules representing individual components.
- **app/**: The main application module that consumes the components.

## Getting Started

1. **Requirements**
   - Java 9 or newer (for JPMS support)
   - Maven or Gradle (recommended for building multi-module projects)

2. **Building the Project**

   If using Maven:
   ```sh
   mvn clean install
   ```

   If using Gradle:
   ```sh
   gradle build
   ```

3. **Running the Application**

   Navigate to the `app` module and run the main class as defined in its `module-info.java`.

## Example: Declaring a Module

Each component/module contains a `module-info.java` file, for example:

```java
module component.a {
    exports com.example.component.a;
    requires component.b;
}
```
