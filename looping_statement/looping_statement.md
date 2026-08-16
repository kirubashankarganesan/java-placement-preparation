looping statement

- A looping statement is used to execute a block of code repeatedly until a specified condition becomes false.
- "A looping statement is used to execute a block of code repeatedly based on a condition. It helps reduce code repetition and makes programs more efficient."

Types of Looping Statements

    1. for Loop
            A for loop is an entry-controlled loop used to execute a block of code repeatedly for a fixed number of times.

            for (initialization; condition; update) {
                // code
            }

    2. while Loop
            A while loop is an entry-controlled loop that executes a block of code repeatedly as long as the given condition is true.

            while (condition) {
                // code
            }

    3. do-while Loop
            A do-while loop is an exit-controlled loop in which the loop body executes at least once before checking the condition.

            do {
                // code
            } while (condition);

    4.  Enhanced for Loop (for-each)
            The enhanced for loop is used to access each element of an array or collection one by one in a simple and readable way.

            for (datatype variable : array) {
                // code
            }

| Feature            | Entry-Controlled | Exit-Controlled |
| ------------------ | ---------------- | --------------- |
| Loops              | `for`, `while`   | `do-while`      |
| Condition Check    | Before execution | After execution |
| Minimum Executions | 0                | 1               |

| Feature                | `for`                         | `while`                         | `do-while`                      |
| ---------------------- | ----------------------------- | ------------------------------- | ------------------------------- |
| Condition Check        | Before                        | Before                          | After                           |
| Executes At Least Once | ❌ No                         | ❌ No                           | ✅ Yes                          |
| Best Used When         | Number of iterations is known | Number of iterations is unknown | Code must execute at least once |
