Access modifiers decide where a class, variable, method, or constructor can be accessed.

| Modifier    | Same Class | Same Package | Child Class | Other Package |
| ----------- | ---------- | ------------ | ----------- | ------------- |
| `private`   | ✅         | ❌           | ❌          | ❌            |
| `default`   | ✅         | ✅           | ❌\*        | ❌            |
| `protected` | ✅         | ✅           | ✅          | ❌\*          |
| `public`    | ✅         | ✅           | ✅          | ✅            |


1. public - Can be accessed from anywhere.

Same class        → ✅
Same package      → ✅
Child class       → ✅
Other package     → ✅

2. private - Accessible only inside the same class.
private = only inside the class

3. default - When you don't write any modifier, it is called default access.

Same class       → ✅
Same package     → ✅
Different package → ❌

4. protected
Accessible:
    Inside the same class
    Within the same package
    In a different package through inheritance

protected = package + child class

// setter function is used to pass the value (setValue)
// getter function is used to get the value (getValue)