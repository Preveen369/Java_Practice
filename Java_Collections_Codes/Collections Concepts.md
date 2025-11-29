# Java Collections Framework

## Vectors
Vectors are synchronized, dynamic arrays that can grow as needed. They are part of the Java Collections Framework.

### Example:
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector: " + vector);
    }
}
```

## Generics
Generics provide a way to parameterize types, allowing for type-safe collections.

### Example:
```java
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
```

## Java Collections Framework

The Java Collections Framework provides a set of classes and interfaces that make it easier to work with groups of objects. It includes various data structures like lists, sets, and maps, which are used to store and manipulate collections of objects.

### Key Interfaces:
1. **List**: An ordered collection that allows duplicate elements. Examples: `ArrayList`, `LinkedList`.
2. **Set**: A collection that does not allow duplicate elements. Examples: `HashSet`, `TreeSet`.
3. **Map**: A collection that maps keys to values, with no duplicate keys allowed. Examples: `HashMap`, `TreeMap`.

## List Interface
The `List` interface provides a way to store ordered collections. It allows duplicate elements and provides positional access.

### Example:
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);
    }
}
```

## Set Interface
The `Set` interface represents a collection that does not allow duplicate elements.

### Example:
```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element

        System.out.println("Set: " + set);
    }
}
```

## Map Interface
The `Map` interface represents a collection of key-value pairs. It does not allow duplicate keys.

### Example:
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        System.out.println("Map: " + map);
    }
}
```

## Queue Interface
The `Queue` interface represents a collection designed for holding elements prior to processing. It follows the FIFO (First-In-First-Out) principle.

### Example:
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
    }
}
```

## Deque Interface
The `Deque` interface represents a double-ended queue that allows insertion and removal of elements from both ends.

### Example:
```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");

        System.out.println("Deque: " + deque);
        System.out.println("Removed from first: " + deque.removeFirst());
        System.out.println("Deque after removal: " + deque);
    }
}
```

## Stack Class
The `Stack` class represents a last-in-first-out (LIFO) stack of objects.

### Example:
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
```

## Collection Sort
The `Collections` class provides static methods for sorting collections.

### Example:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
```

## Custom Serialization
Custom serialization allows control over the serialization process.

### Example:
```java
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(age);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        age = ois.readInt();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class CustomSerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## Files
Java provides the `java.nio.file` package for file operations.

### Example:
```java
import java.nio.file.*;

public class FileExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try {
            Files.writeString(path, "Hello, World!");
            String content = Files.readString(path);
            System.out.println("File Content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Stream API
The Stream API provides a functional approach to processing collections.

### Example:
```java
import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        list.stream()
            .filter(s -> s.startsWith("a"))
            .forEach(System.out::println);
    }
}
```

## Records
Records provide a compact syntax for declaring classes that are transparent holders for shallowly immutable data.

### Example:
```java
public record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println(person.name() + " is " + person.age() + " years old.");
    }
}
```

## Sealed Classes
Sealed classes restrict which other classes or interfaces may extend or implement them.

### Example:
```java
public sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}
final class Rectangle extends Shape {}

public class SealedClassesExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        System.out.println("Shapes created.");
    }
}
```

## Local Variable Type Inference (LVTI)
LVTI allows the compiler to infer the type of a local variable.

### Example:
```java
import java.util.List;

public class LVTIExample {
    public static void main(String[] args) {
        var list = List.of("one", "two", "three");
        for (var item : list) {
            System.out.println(item);
        }
    }
}
```

