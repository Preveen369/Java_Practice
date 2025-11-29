# OOPS Concepts in Java

## Purpose
Object-Oriented Programming (OOP) is a programming paradigm that uses objects and classes to structure software programs. It aims to increase code reusability, scalability, and maintainability.

## Types and Definitions

### 1. Classes and Objects
- **Class**: A blueprint for creating objects.
- **Object**: An instance of a class.

### 2. Inheritance
- Mechanism where one class inherits the properties and behaviors of another class.

### 3. Polymorphism
- Ability of a variable, function, or object to take multiple forms.
    - **Runtime Polymorphism**: Achieved through method overriding.
    - **Compile-time Polymorphism**: Achieved through method overloading.

### 4. Abstraction
- Hiding the complex implementation details and showing only the necessary features.

### 5. Encapsulation
- Wrapping data and code together into a single unit (class).

## Detailed Concepts

### Abstract Class
- A class that cannot be instantiated and is meant to be subclassed.

### Annotations
- Metadata that provides data about a program but is not part of the program itself.

### Anonymous Inner Class
- A class without a name defined inside another class.

### Arrays
- **Primitive Types**: Arrays that store primitive data types.
- **Objects**: Arrays that store objects.

### Cloneable Interface
- Interface that allows cloning of objects.

### Collection Sorting
- Sorting mechanisms provided by Java Collections Framework.

### Constructors
- Special methods used to initialize objects.

### Exception Handling
- Mechanisms to handle runtime errors using `try`, `catch`, `finally`, `throw`, and `throws`.

### Functional Interface
- An interface with a single abstract method, used in lambda expressions.

### Inner Classes
- Classes defined within other classes.

### Methods
- Blocks of code that perform a specific task.

### Jagged Arrays
- Arrays of arrays with different lengths.

### 2D and 3D Arrays
- Arrays with two or three dimensions.

### Interfaces
- Abstract types used to specify a set of methods that a class must implement.

### Lambda Expressions
- Short blocks of code which take parameters and return a value.

### Maps
- Objects that map keys to values.

### Method Overloading and Overriding
- **Overloading**: Multiple methods with the same name but different parameters.
- **Overriding**: A subclass provides a specific implementation of a method already defined in its superclass.

### Naming Conventions
- Standardized ways to name variables, methods, classes, etc.

### Race Conditions
- Situations where the behavior of software depends on the sequence or timing of uncontrollable events.

### Runnable vs Thread
- **Runnable**: Interface representing a task to be executed.
- **Thread**: Class representing a thread of execution.

### Multithreading Concepts
- Techniques to run multiple threads simultaneously.

### Strings
- Immutable sequences of characters.

### String Immutability and Mutability
- **Immutable**: Strings cannot be changed once created.
- **Mutable**: Strings can be changed after creation (e.g., `StringBuilder`).

### Static Blocks
- Blocks of code that are executed when the class is loaded.

### Shallow and Deep Copy
- **Shallow Copy**: Copies the object's reference.
- **Deep Copy**: Copies the object and the objects it references.

### Static Variables and Methods
- Belong to the class rather than instances of the class.

### Synchronization
- Mechanism to control the access of multiple threads to shared resources.

### `this` Keyword
- Refers to the current object.

### `this` and `super`
- **`this`**: Refers to the current class instance.
- **`super`**: Refers to the superclass instance.

### Thread Communication
- Mechanisms for threads to communicate with each other.

### Upcasting and Downcasting
- **Upcasting**: Casting a subclass object to a superclass type.
- **Downcasting**: Casting a superclass object to a subclass type.

### User Inputs
- Mechanisms to take input from the user.

### Wrapper Classes
- Classes that provide a way to use primitive data types as objects.
## Examples

### Abstract Class
```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

### Annotations
```java
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value = "example")
public class MyClass {
}
```

### Anonymous Inner Class
```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Anonymous Inner Class");
    }
};
new Thread(r).start();
```

### Arrays
```java
// Primitive Types
int[] numbers = {1, 2, 3, 4, 5};

// Objects
String[] names = {"Alice", "Bob", "Charlie"};
```

### Cloneable Interface
```java
class Person implements Cloneable {
    String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

### Collection Sorting
```java
List<String> list = new ArrayList<>();
list.add("Banana");
list.add("Apple");
list.add("Cherry");
Collections.sort(list);
```

### Constructors
```java
class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}
```

### Exception Handling
```java
try {
    int division = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Finally block executed");
}
```

### Functional Interface
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

MyFunctionalInterface fi = () -> System.out.println("Lambda Expression");
fi.myMethod();
```

### Inner Classes
```java
class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inner Class");
        }
    }
}
```

### Methods
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
}
```

### Jagged Arrays
```java
int[][] jaggedArray = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

### 2D and 3D Arrays
```java
// 2D Array
int[][] array2D = {
    {1, 2},
    {3, 4}
};

// 3D Array
int[][][] array3D = {
    {
        {1, 2},
        {3, 4}
    },
    {
        {5, 6},
        {7, 8}
    }
};
```

### Interfaces
```java
interface Animal {
    void eat();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats");
    }
}
```

### Lambda Expressions
```java
List<String> list = Arrays.asList("a", "b", "c");
list.forEach(element -> System.out.println(element));
```

### Maps
```java
Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
```

### Method Overloading and Overriding
```java
// Overloading
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Overriding
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

### Naming Conventions
```java
// Class name
class MyClass {
}

// Variable name
int myVariable;
```

### Race Conditions
```java
class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

### Runnable vs Thread
```java
// Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

// Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```

### Multithreading Concepts
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
```

### Strings
```java
String str = "Hello, World!";
```

### String Immutability and Mutability
```java
// Immutable
String str = "Hello";
str.concat(" World"); // str is still "Hello"

// Mutable
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // sb is now "Hello World"
```

### Static Blocks
```java
class MyClass {
    static {
        System.out.println("Static block executed");
    }
}
```

### Shallow and Deep Copy
```java
// Shallow Copy
class Person implements Cloneable {
    String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Deep Copy
class Address implements Cloneable {
    String city;

    public Object clone() throws CloneNotSupportedException {
        Address cloned = (Address) super.clone();
        cloned.city = new String(city);
        return cloned;
    }
}
```

### Static Variables and Methods
```java
class MyClass {
    static int staticVariable;

    static void staticMethod() {
        System.out.println("Static method");
    }
}
```

### Synchronization
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

### `this` Keyword
```java
class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}
```

### `this` and `super`
```java
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child class");
    }
}
```

### Thread Communication
```java
class SharedResource {
    synchronized void waitMethod() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyMethod() {
        notify();
    }
}
```

### Upcasting and Downcasting
```java
// Upcasting
Animal a = new Dog();

// Downcasting
Dog d = (Dog) a;
```

### User Inputs
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
```

### Wrapper Classes
```java
int primitive = 5;
Integer wrapper = Integer.valueOf(primitive);
```