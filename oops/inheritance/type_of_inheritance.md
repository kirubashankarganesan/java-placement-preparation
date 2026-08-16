Definition

Inheritance is a mechanism where a child class acquires the properties and methods of a parent class.

In simple Thanglish:

Oru child class, parent class-oda properties and methods-ah reuse pannuradhu inheritance.

In Java, there are 5 common types of inheritance:

    Single Inheritance
    Multilevel Inheritance
    Hierarchical Inheritance
    Multiple Inheritance
    Hybrid Inheritance

Important: Java supports Single, Multilevel, and Hierarchical inheritance using classes. Multiple and Hybrid inheritance are not supported using classes because of ambiguity, but they can be achieved using interfaces.

Single       → Class ✅
Multilevel   → Class ✅
Hierarchical → Class ✅
Multiple     → Class ❌
Hybrid       → Class ❌ (when multiple inheritance is involved)
              → Interface ✅

1. Single Inheritance - One child class inherits from one parent class.

Animal
↓
Dog

2. Multilevel Inheritance - A class inherits from another child class, creating a chain of inheritance.

Animal
↓
Dog
↓
Puppy

3.  Hierarchical Inheritance - Multiple child classes inherit from the same parent class.

            Animal
           /      \
         Dog      Cat

4. Multiple Inheritance - One child class inherits from multiple parent classes.

Java does not support multiple inheritance using classes because it can cause ambiguity. However, Java supports multiple inheritance through interfaces.

   father       mother
      \         /
       \       /
         child

Diamond Problem = Two parent paths → Same method → Confusion about which method to use.

5. Hybrid Inheritance - Hybrid inheritance is a combination of two or more types of inheritance.


        Animal
       /      \
     Dog      Cat
       \      /
        ??? 