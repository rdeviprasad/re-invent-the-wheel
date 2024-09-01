# Data Types
There are two major data types
* Primitive
* Non-primitive

## Primitive data types
Only java data types which are not classes or objects

These are:
* int
* long
* short
* byte
* double
* float
* char
* boolean

### int
These are used to store integers. It occupies 4 bytes (32 bits).

### long
These are used to store integers. It occupies 8 bytes (64 bits).

### short
These are used to store integers. It occupies 2 bytes (16 bits).

### byte
These are used to store integers. It occupies 1 byte (8 bits).

### double
These are used to store decimals. It occupies 8 bytes (64 bits).

### float
These are used to store decimals. It occupies 4 bytes (32 bits).

### char
These are used to store single character. It occupies 2 bytes (16 bits) and stores Unicode.

### boolean
These are used to store true or false.

## Non-primitive data types
* String
* Array
* Class
* Interface
* Enum
* Record

### String
A Sequence of characters. Its immutable.

### Array
A collection of similar data types. Items can be accessed via an index.

### Class
Has state and behaviour. Blueprint to create objects.

### Interface
A collection of abstract methods. Used mainly for ADTs

### Enum
Allows to create a set of named values. Like planets or Colors. Enums by definition should be finite.

### Record
A container of data. It mainly has state and very less behaviour


```Java
public class Main {

    public static void main() {
        int words = 2343;
        long population = 123987650L; // L is there for the compiler to know that the type is long
        short runs = 400;
        byte age = 34;
        double pi = 3.14;
        float half = 0.5f;
        char ch = 'x';
        boolean flag = false;

        String line = "I am sick, I must die";
        int[] daysInAMonthNormal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Person person = new Person("Raja", 30);
        Days today = Days.SUNDAY;

    }

    private static enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
```

# Wrapper Classes
Object oriented classes for all the primitives.
Integer - int, Double - double, etc.

In java collections primitives are not allowed. So wrapper classes are used.

```Java
Integer words = 2343; // Autoboxing
```

# Operators
Operators perform operations on operands.
* Arithmetic operators
* Relational operators
* Logical operators

## Arithmetic Operators
* Addition (+)
* Subtraction (-)
* Multiplication (*)
* Division (/)
* Modulo (%)

## Relational Operators
* Equals (==)
* Not equal to (!=)
* Greater than (>)
* Less than (<)
* Greater than or equals to (>=)
* Less than or equals to (<=)

## Logical Operators
* Logical AND (&&)
* Logical OR (||)
* Logical NOT (!)

## Ternary Operator
```Java
condition1 ? value1 : value2
```
# The static keyword
static is used to define members which belong to the class rather than to a class instance (object).

* A static field belongs to the class
* A static method belongs to the class
* A static block gets executed when the class is loaded into the memory
* A static class is a nested class that do not have access to the enclosing class's instance variables

# Nested Classes
A class defined inside another class

* Static nested class
* inner class

## Static Nested Class
Nested class which is static

```Java
public class Person {

    private final int age;
    private final String name;

    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Builder {

        // builder code
    }
}
```

## Inner Class
Nested class inside another class

```Java
public class Person {

    class Identity {
        String value;
        boolean valid;
        int type;
    }
}

Person person = new Person();
Person.Identity identity = person.new Identity();
```

Types of inner class
* Member inner class - defined in another class but outside a method
* Local inner class - defined inside a method
* Anonymous inner class - a class without a name inside a method
* Lambda expression - shortcut for anonymous inner class

