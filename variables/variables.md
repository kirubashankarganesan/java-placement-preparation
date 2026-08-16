A variable is a named memory location used to store data. The value of a variable can change during program execution.

syntax
datatype variableName = value;

example
int age = 20;
String name = "Kirubashankar";
double salary = 50000.50;

Types of Variables in Java

    There are 3 types of variables:
            Local Variable
            Instance Variable
            Static Variable (Class Variable)
    
1. local variable
    A local variable is declared inside a method or block and can be accessed only within that method or block.

    Real-Life Example
        The marks you write on an exam paper are used only for that exam. They cannot be used in another exam.

2. Instance variable
    An instance variable is declared inside a class but outside any method. Every object has its own separate copy of the variable.

    Real-Life Example
        Each student has their own name and roll number. These values are different for every student.      

3. static variable
    A static variable is declared using the static keyword and is shared by all objects of the class.

    Real-Life Example
        All students in the same college share the same college name.

| Feature         | Local Variable         | Instance Variable       | Static Variable       |
| --------------- | ---------------------- | ----------------------- | --------------------- |
| Declared Inside | Method/Block           | Class (outside methods) | Class (with `static`) |
| Scope           | Only inside the method | Whole object            | Whole class           |
| Memory Created  | When method is called  | When object is created  | When class is loaded  |
| Shared          | No                     | No                      | Yes                   |


Static → Class → ClassName.variable
Instance → Object → objectName.variable

4. final

A final variable is a variable whose value cannot be changed once it is initialized. It becomes a constant.
    
    syntax: final datatype variableName = value;