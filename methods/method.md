method is a block of code that performs a particular task. Instead of writing the same code again and again, we create a method once and call it whenever needed. In Java, methods are members of a class and are used to define the behavior of that class.

1. syntax
   accessModifier static returnType methodName(parameters) {

   // statements

   return value;

}

2. Types of methods based on arguments and return value

This is very important for understanding methods.

There are mainly 4 combinations.

Type 1: No argument + No return value
static void greet() {
System.out.println("Hello");
}
greet();

Type 2: Argument + No return value
static void display(int n) {
System.out.println(n);
}
display(10);

Type 3: No argument + Return value
static int getNumber() {
return 10;
}
int x = getNumber();
System.out.println(x);

Type 4: Argument + Return value
This is very commonly used.
static int add(int a, int b) {
return a + b;
}
int result = add(10, 20);
System.out.println(result);

3. use

Code reusability
Less repetition
Better readability
Easy maintenance
Breaking a large program into smaller tasks

4.  method definition
    Method definition means creating/writing the method and telling Java what the method should do.

        static void greet() {
        System.out.println("Hello");

    }

5.  Method Calling
    Method calling means using the method to execute its code.
    greet();

Method Definition
↓
greet()
↓
Method Calling
↓
greet()
↓
Code inside method executes
↓
Hello 


6. Static vs non-static method

        1. static - A static method belongs to the class, so it can be called directly from a static context.

            class Demo {

            static void display() {
                System.out.println("Hello");
            }

            public static void main(String[] args) {

                display();
            }

        }

        2. Non-static - Here we create an object and call the method using the object.

        class Demo {

        void display() {
            System.out.println("Hello");
        }

        public static void main(String[] args) {

            Demo obj = new Demo();

            obj.display();
        }

    }

Demo obj = new Demo();
↓
object created
↓
obj.display();

5. method vs constructor
