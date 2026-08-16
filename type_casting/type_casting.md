Type Casting is the process of converting one data type into another data type.

It is used when we need to store a value of one type into a variable of another type.

| Data Type | Size    |
| --------- | ------- |
| byte      | 1 byte  |
| short     | 2 bytes |
| int       | 4 bytes |
| long      | 8 bytes |
| float     | 4 bytes |
| double    | 8 bytes |


Types of Type Casting

There are 2 types.

Implicit Type Casting (Widening)
    When a smaller data type is automatically converted into a larger data type, it is called Implicit Type Casting

Explicit Type Casting (Narrowing)
    When a larger data type is converted into a smaller data type manually, it is called Explicit Type Casting or Narrowing.

    datatype variable = (datatype)value;


Type Casting
      |
      +------------------------+
      |                        |
Implicit (Widening)     Explicit (Narrowing)
      |                        |
Automatic                Manual
Small → Large            Large → Small
No Data Loss             Data Loss Possible
No Casting               (datatype)value