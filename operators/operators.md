Operators are special symbols used to perform operations on variables and values

Why do we use Operators?

Operators help us:

Perform calculations
Compare values
Make decisions
Assign values
Combine conditions
Increase or decrease values

| No. | Operator   | Purpose                    |
| --- | ---------- | -------------------------- |
| 1   | Arithmetic | Mathematical calculations  |
| 2   | Assignment | Assign values              |
| 3   | Relational | Compare values             |
| 4   | Logical    | Combine conditions         |
| 5   | Unary      | Increment, decrement, sign |
| 6   | Ternary    | Short form of if-else      |
| 7   | Bitwise    | Bit-level operations       |
| 8   | Shift      | Shift bits left or right   |

1. Arithmetic Operators
   Definition
   Arithmetic operators perform mathematical operations.

| Operator | Meaning             |
| -------- | ------------------- |
| `+`      | Addition            |
| `-`      | Subtraction         |
| `*`      | Multiplication      |
| `/`      | Division            |
| `%`      | Modulus (Remainder) |

2. Assignment Operators
   Definition
   Assignment operators assign values to variables.

| Operator | Meaning             |
| -------- | ------------------- |
| `+=`     | Add and assign      |
| `-=`     | Subtract and assign |
| `*=`     | Multiply and assign |
| `/=`     | Divide and assign   |
| `%=`     | Modulus and assign  |

3. Relational Operators
   Definition
   Relational operators compare two values.
   They always return a boolean (true or false).
   | Operator | Meaning |
   | -------- | --------------------- |
   | `==` | Equal to |
   | `!=` | Not equal |
   | `>` | Greater than |
   | `<` | Less than |
   | `>=` | Greater than or equal |
   | `<=` | Less than or equal |

4. Logical Operators
   Definition
   Logical operators combine two or more conditions.
   They also return true or false.

| Operator | Meaning |     
| -------- | ------- | 
| `&&`     | AND     |   
| ` ||`    | OR      | 
| `!`      | NOT     |     

5. unary operator
    A unary operator performs an operation on a single operand.
| Operator | Meaning     |
| -------- | ----------- |
| `+`      | Unary Plus  |
| `-`      | Unary Minus |
| `++`     | Increment   |
| `--`     | Decrement   |
| `!`      | Logical NOT |

6. Ternary Operator

    The Ternary Operator is a conditional operator used as a short form of if-else.
    condition ? expression1 : expression2

7. Shift Operator
    Shift operators are used to shift the bits of a number to the left or right.
Types of Shift Operators
There are 3 shift operators.
| Operator | Name                 |
| -------- | -------------------- |
| `<<`     | Left Shift           |
| `>>`     | Right Shift          |
| `>>>`    | Unsigned Right Shift |

| `>>`                                   | `>>>`                            |
| -------------------------------------- | -------------------------------- |
| Signed Right Shift                     | Unsigned Right Shift             |
| Preserves the sign bit                 | Always fills left with `0`       |
| Used for positive and negative numbers | Mainly used for negative numbers |

| Left Shift (`<<`)          | Right Shift (`>>`)                                           |
| -------------------------- | ------------------------------------------------------------ |
| Moves bits left            | Moves bits right                                             |
| Multiplies by powers of 2  | Divides by powers of 2                                       |
| Right side filled with `0` | Left side filled with sign bit (or `0` for positive numbers) |

8. Bitwise operators perform operations directly on the binary representation of numbers.
| Operator | Meaning              | Easy rule        |               |
| -------- | -------------------- | ---------------- | ------------- |
| `&`      | AND                  | Both `1` → `1`   |               |
| `        | `                    | OR               | Any `1` → `1` |
| `^`      | XOR                  | Different → `1`  |               |
| `~`      | NOT                  | Flip bits        |               |
| `<<`     | Left shift           | × 2              |               |
| `>>`     | Right shift          | ÷ 2              |               |
| `>>>`    | Unsigned right shift | Shift + fill `0` |               |
