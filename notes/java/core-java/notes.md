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
