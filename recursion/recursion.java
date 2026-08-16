package recursion;

public class recursion {
    static void printNumber(int n) {

        if (n > 5) {
            return;
        }

        System.out.println(n);
        printNumber(n + 1);
    }

    public static void main(String[] args) {

        printNumber(1);
    }
}

// 1
// 2
// 3
// 4
// 5

// printNumber(1)
//      ↓
// printNumber(2)
//      ↓
// printNumber(3)
//      ↓
// printNumber(4)
//      ↓
// printNumber(5)
//      ↓
// printNumber(6)
//      ↓
// n > 5 → true
//      ↓
// return