Definition - Exception handling is a mechanism used to handle runtime errors and prevent the program from terminating unexpectedly.

Thanglish Concept - Program run aagumbodhu unexpected error vandha, program crash aagama adha handle pannuradhu Exception Handling.

For example, user 10 / 0 panna:

int result = 10 / 0;
This causes:

ArithmeticException

Without exception handling, program stops.

try
↓
Risky code
↓
Exception occurs
↓
catch
↓
Handle the exception
↓
Program continues

Real-world Example 🏧

ATM-la:

Account Balance = ₹1,000

User tries to withdraw = ₹5,000

The operation cannot be completed.

Instead of the expected operation, an unexpected situation occurs:

"Insufficient balance"

Similarly, in a program, unexpected situations can produce exceptions.
10 / 0 → ArithmeticException
null.length() → NullPointerException
arr[5] → ArrayIndexOutOfBoundsException
"abc" → int → NumberFormatException
wrong Scanner input → InputMismatchException

1. try block-la exception occur aagura chance irukkura code write pannuvom.
2. catch block exception-ah handle pannum.
3. finally block exception vandhaalum varalainaalum execute aagum.
4. throw explicity ah /manually ah error ah throw pannanumna use pannuvom
5. throws

---

1. Checked Exception

Definition:
A checked exception is an exception that is checked by the compiler at compile time.

Thanglish:

Program compile pannumbodhe Java check pannum. Handle pannala na compiler error kudukkum.

2. Unchecked Exception

Definition:
An unchecked exception is an exception that is not checked by the compiler. It usually occurs during runtime.

Thanglish:

Compile time-la compiler force pannaadhu. Program run pannumbodhu problem vandha exception varum.

| Checked                                      | Unchecked                       |
| -------------------------------------------- | ------------------------------- |
| Checked at **compile time**                  | Occurs mainly at **runtime**    |
| Compiler forces us to handle/declare it      | Compiler doesn't force handling |
| Usually external/resource-related situations | Usually programming mistakes    |
| `IOException`                                | `ArithmeticException`           |
| `FileNotFoundException`                      | `NullPointerException`          |

| `throw`                        | `throws`                         |
| ------------------------------ | -------------------------------- |
| Used to **throw an exception** | Used to **declare an exception** |
| Used inside method/block       | Used in method declaration       |
| Throws one exception at a time | Can declare multiple exceptions  |
| `throw new Exception()`        | `method() throws Exception`      |

3. custom exception - A custom exception is a user-defined exception created by extending the Exception class.

Java-la already irukkura exceptions (IOException, ArithmeticException) mattum use pannaama, namma own requirement-ku own exception create pannuradhu Custom Exception.
