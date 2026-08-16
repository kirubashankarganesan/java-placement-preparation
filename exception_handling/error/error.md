An Error represents a serious problem that usually occurs at the JVM or system level and is generally not meant to be handled by normal application code. Examples are StackOverflowError and OutOfMemoryError.

                Throwable
             /       \
      Exception       Error
       /      \

Checked    Unchecked

| Error                  | Meaning                                              |
| ---------------------- | ---------------------------------------------------- |
| `StackOverflowError`   | Stack memory gets exhausted                          |
| `OutOfMemoryError`     | JVM runs out of memory                               |
| `VirtualMachineError`  | Serious JVM-level problem                            |
| `NoClassDefFoundError` | Required class definition cannot be found at runtime |


class Main {

    public static void main(String[] args) {

        int[] arr = new int[Integer.MAX_VALUE];
    }
}

***OutOfMemoryError*** 

class Main {

    static void test() {
        test();
    }

    public static void main(String[] args) {
        test();
    }
}

***StackOverflowError***

Throwable in Java
Definition

Throwable is the parent class of both Exception and Error in Java.

Simple-ah sonna:

Throwable is the main parent class for anything that can be thrown using throw and caught using catch.

"Throwable is the superclass of both Exception and Error. It represents objects that can be thrown and caught in Java. Exceptions are generally problems that applications can handle, while Errors represent serious problems."

🧠 One-line memory

Throwable → Parent of Exception and Error.