1. Procedural Programming
   Procedural programming is a programming approach where a program is divided into a sequence of functions or procedures, which are executed step by step.
   Start
   ↓
   Input
   ↓
   Process
   ↓
   Output
   ↓
   End
2. Object-Oriented Programming (OOP)

Object-oriented programming is a programming approach where the program is designed using objects and classes.

Simple understanding:

Focuses on objects.
Uses concepts like Class, Object, Inheritance, Polymorphism, Encapsulation, and Abstraction.
It makes large and real-world problems easier to organize and manage.

Example: Java, C++, Python

---

1. Class

Definition:

A class is a blueprint or template used to create objects. It defines the data (variables) and behavior (methods) of an object.

Think of a class like a design/template.

2. Object

Definition:

An object is a real instance of a class. It is created from the class and represents a particular entity.

Think of an object as the actual thing created using the blueprint.

Easy example to remember:

Class = Blueprint of a house
Object = Actual house built using that blueprint.

example :
class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class Main {
public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Kumar";.
        s1.age = 20;

        s1.display();
        // Output: Name: Kumar
        // Output: Age: 20
    }

}
