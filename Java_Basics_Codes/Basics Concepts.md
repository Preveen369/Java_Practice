# Java Basics

## Introduction to Java
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

## Purpose of Java
- To develop platform-independent applications.
- To create secure and robust applications.
- To provide high performance with the use of Just-In-Time compiler.

## Features of Java
- **Simple**: Easy to learn and use.
- **Object-Oriented**: Everything is an object.
- **Portable**: Write once, run anywhere.
- **Platform-Independent**: Can run on any operating system.
- **Secured**: Provides a secure environment.
- **Robust**: Strong memory management.
- **Multithreaded**: Can handle multiple tasks simultaneously.
- **High Performance**: Just-In-Time compiler enables high performance.
- **Distributed**: Facilitates distributed computing.
- **Dynamic**: Supports dynamic loading of classes.

## Sequence of Java Basic Concepts
1. Variables
2. Literals
3. Operators
4. Expressions
5. Decision Making Statements
6. Loops

## Syntaxes

### Variables
Variables are containers for storing data values.
```java
int number = 10;
String name = "John";
```

### Literals
Literals are constant values assigned to variables.
```java
int num = 100; // Integer literal
char letter = 'A'; // Character literal
String str = "Hello"; // String literal
```

### Operators
Operators are used to perform operations on variables and values.
```java
int sum = 10 + 20; // Addition
int diff = 20 - 10; // Subtraction
int product = 10 * 20; // Multiplication
int quotient = 20 / 10; // Division
int remainder = 20 % 10; // Modulus
```

### Expressions
Expressions are combinations of variables, literals, and operators.
```java
int result = (10 + 20) * 2; // Expression
```

### Decision Making Statements
Decision making statements allow you to make decisions based on conditions.
```java
if (number > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Non-positive number");
}

// Shorthand (ternary operator)
int max = (a > b) ? a : b;
```

### Loops
Loops are used to execute a block of code repeatedly.
```java
// For loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// While loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;}
    
// Do-while loop
int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 5);
```


### Switch Statements
Switch statements allow you to execute one block of code among many based on the value of a variable.

#### Old Version
In the old version of switch statements, you use `case` and `break` to define and terminate each case.

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    case 3:
        dayName = "Tuesday";
        break;
    case 4:
        dayName = "Wednesday";
        break;
    case 5:
        dayName = "Thursday";
        break;
    case 6:
        dayName = "Friday";
        break;
    case 7:
        dayName = "Saturday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println(dayName); // Output: Tuesday
```

#### New Version (Java 12+)
In the new version of switch statements, you can use the `->` syntax and `yield` to return values directly.

```java
int day = 3;
String dayName = switch (day) {
    case 1 -> "Sunday";
    case 2 -> "Monday";
    case 3 -> "Tuesday";
    case 4 -> "Wednesday";
    case 5 -> "Thursday";
    case 6 -> "Friday";
    case 7 -> "Saturday";
    default -> "Invalid day";
};

System.out.println(dayName); // Output: Tuesday
```

### Switch Case Fall-Through
In the old version of switch statements, if you don't include a `break` statement at the end of a case, the execution will continue to the next case. This is known as "fall-through."

#### Example of Fall-Through
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Sunday");
    case 2:
        System.out.println("Monday");
    case 3:
        System.out.println("Tuesday");
    default:
        System.out.println("Invalid day");
}

// Output:
// Monday
// Tuesday
// Invalid day
```

In this example, since there is no break statement after case 2, the execution falls through to case 3 and then to the default case.

### Preventing Fall-Through
To prevent fall-through, you should include a `break` statement at the end of each case.

```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}

// Output:
// Monday
```

In this example, the `break` statement after case 2 prevents the execution from falling through to the next cases.