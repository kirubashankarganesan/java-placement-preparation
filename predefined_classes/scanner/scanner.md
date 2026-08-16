Definition - Scanner is a predefined class in Java's java.util package that is used to read input from the user.

Thanglish Concept

Simple-ah sonna:

Scanner class na user kitta irundhu input vaanguradhukku use panra class.

For example, user:

Enter your age: 21

nu enter pannumbodhu, Scanner use panni andha 21 value-ah program-kulla receive pannalam.

to use that class

1. import java.util.Scanner;
   Because Scanner belongs to: java.util

2. Create Scanner object
   Scanner sc = new Scanner(System.in);
   Here:

Scanner → class
sc → Scanner object
new Scanner(System.in) → creates Scanner object
System.in → keyboard input

3. Take input

Different data types-ku different methods irukku.

int age = sc.nextInt();
String name = sc.nextLine();
double mark = sc.nextDouble();

| Method          | Used for             |
| --------------- | -------------------- |
| `nextInt()`     | Integer              |
| `nextDouble()`  | Double               |
| `nextFloat()`   | Float                |
| `nextLong()`    | Long                 |
| `next()`        | One word             |
| `nextLine()`    | Complete line/string |
| `nextBoolean()` | Boolean              |

we can use like this also ***next().charAt(0);***

Scanner
↓
java.util
↓
User Input
↓
Scanner sc = new Scanner(System.in);
↓
sc.nextInt()
sc.next()
sc.nextLine()
