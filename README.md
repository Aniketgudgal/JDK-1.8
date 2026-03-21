# JDK 1.8 Features Practice Repository

This repository contains implementations and practice examples of key features introduced in Java Development Kit (JDK) 1.8, also known as Java 8. The code demonstrates various concepts to help build logical thinking and understanding of functional programming paradigms in Java.

## Overview

JDK 1.8 was a revolutionary release for Java, introducing significant enhancements that transformed how developers write code. This repository serves as a learning resource and practice ground for these features.

## Key Features Implemented

### 1. Lambda Expressions
Lambda expressions enable functional programming by allowing the treatment of functions as first-class citizens. They provide a concise way to represent anonymous functions.

**Examples:**
- `LamApplication.java`: Basic lambda expression replacing anonymous inner class
- Consumer implementations using lambda syntax

### 2. Functional Interfaces
Functional interfaces are interfaces with exactly one abstract method. JDK 1.8 introduced several built-in functional interfaces in the `java.util.function` package.

**Implemented Interfaces:**
- **Consumer**: Accepts a single input and performs an operation without returning a value
  - `ConsumerApplication.java`: Basic Consumer usage with ArrayList
  - `CusumApplication.java`: Consumer with user input
  - `FetchDataFromArrayList.java`: Consumer for fetching data from collections
  - `UserdefineObjConsumer.java`: Consumer with custom objects (Vehicle class)

- **Predicate**: Represents a boolean-valued function of one argument
  - `Predicate/CheckVal.java`: Predicate for filtering values greater than 40
  - `Predicate/PredicateApplication.java`: Predicate for checking even numbers
  - `Predicate/PredicateApplicationApp.java`: Combining Predicate with Consumer

### 3. Streams API
The Streams API provides a functional approach to processing collections of objects. It supports operations like filtering, mapping, and reducing.

**Stream Operations Demonstrated:**
- `Steam-API/src/steam/CountElements.java`: Counting elements in an array using `Arrays.stream().count()`
- `Steam-API/src/steam/demo_example.java`: Using `distinct()` to remove duplicates and `forEach()` for iteration
- `Steam-API/src/steam/SortArray.java`: Sorting arrays using `sorted()` and `forEach()`

### 4. Module System (Preview)
While the full module system was introduced in Java 9, this repository includes a basic module declaration in `Steam-API/src/module-info.java` for organizational purposes.

## Project Structure

```
JDK-1.8/
├── ConsumerApplication.java          # Basic Consumer interface usage
├── CusumApplication.java             # Consumer with user input
├── FetchDataFromArrayList.java       # Consumer with ArrayList
├── LamApplication.java               # Lambda expressions basics
├── UserdefineObjConsumer.java        # Consumer with custom objects
├── Predicate/                        # Predicate interface examples
│   ├── CheckVal.java
│   ├── PredicateApplication.java
│   └── PredicateApplicationApp.java
├── Steam-API/                        # Streams API 
└── README.md   
```

## Learning Objectives

This repository is designed to:
- Practice implementing JDK 1.8 features
- Understand functional programming concepts in Java
- Build logical thinking through hands-on coding
- Demonstrate the transition from imperative to functional programming styles

## Importance of JDK 1.8 in Advanced Projects

JDK 1.8 marked a paradigm shift in Java development and remains crucial for modern Java applications:

### 1. **Functional Programming Foundation**
- Enables writing more concise and readable code
- Supports parallel processing with streams
- Facilitates better code reusability through functional interfaces

### 2. **Performance Improvements**
- Streams API allows for efficient parallel processing
- Lazy evaluation in streams optimizes resource usage
- Improved collection processing performance

### 3. **Backward Compatibility**
- Maintains compatibility with existing Java code
- Gradual adoption of functional features
- Essential for maintaining legacy systems

### 4. **Modern Java Ecosystem**
- Base for subsequent Java versions (9, 10, 11, etc.)
- Required for frameworks like Spring Boot, Hibernate
- Standard in enterprise applications

### 5. **Developer Productivity**
- Reduces boilerplate code
- Enables declarative programming styles
- Simplifies complex data processing tasks

### 6. **Big Data and Parallel Processing**
- Streams support parallel operations out-of-the-box
- Essential for data-intensive applications
- Foundation for reactive programming

## Running the Examples

1. Ensure you have JDK 1.8 or higher installed
2. Compile the Java files:
   ```bash
   javac *.java
   ```
3. For the Steam-API module:
   ```bash
   cd Steam-API/src
   javac -d ../bin steam/*.java
   ```
4. Run individual classes:
   ```bash
   java ClassName
   ```

## Contributing

This is a personal practice repository for learning JDK 1.8 features. Feel free to explore and modify the code for your own learning purposes.

## Resources

- [Oracle JDK 1.8 Documentation](https://docs.oracle.com/javase/8/docs/)
- [Java 8 Streams API Tutorial](https://docs.oracle.com/javase/tutorial/collections/streams/)
- [Functional Interfaces in Java](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)