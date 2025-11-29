# Java Serialization and Custom Serialization

## Java Serialization

Serialization in Java is a mechanism of writing the state of an object into a byte stream. This is useful for saving the state of an object to a file or sending it over a network.

### Example of Serialization

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
```

## Custom Serialization

Custom serialization allows you to control the serialization process by defining your own `writeObject` and `readObject` methods.

### Example of Custom Serialization

```java
import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    transient int age; // 'transient' keyword prevents this field from being serialized

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(age); // Manually serialize the 'age' field
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        age = ois.readInt(); // Manually deserialize the 'age' field
    }
}

public class CustomSerializationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Jane Doe", 25);
        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee);
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
```

# Java Date API Concepts

Java provides a comprehensive Date and Time API in the `java.time` package, introduced in Java 8.

## Example of Using `LocalDate`, `LocalTime`, and `LocalDateTime`

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateApiDemo {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Specific date
        LocalDate specificDate = LocalDate.of(2023, 10, 1);
        System.out.println("Specific Date: " + specificDate);

        // Specific time
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("Specific Time: " + specificTime);

        // Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 10, 1, 14, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);
    }
}
```

## Example of Using `DateTimeFormatter`

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
```