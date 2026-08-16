1. What is File Handling?
   Definition

File handling is the process of creating, reading, writing, updating, and deleting files using a Java program.

Thanglish

Simple-ah sonna:

Program-la data temporary-ah RAM-la mattum store pannama, permanent-ah file-la save panna file handling use pannuvom.

For example:

Java Program
↓
File Handling
↓
data.txt
↓
Data stored permanently


                 Java File Handling
                       |
          ┌────────────┴────────────┐
          ↓                         ↓
       File I/O                 NIO
          |
   ┌──────┼────────┐
   ↓      ↓        ↓
 File   Reader   Writer
          |
      ┌───┴────┐
      ↓        ↓
 FileReader  FileWriter
      ↓        ↓
BufferedReader BufferedWriter


| Class              | Purpose                                   |
| ------------------ | ----------------------------------------- |
| `File`             | Create/check/delete files and directories |
| `FileReader`       | Read character data                       |
| `FileWriter`       | Write character data                      |
| `BufferedReader`   | Read text efficiently                     |
| `BufferedWriter`   | Write text efficiently                    |
| `FileInputStream`  | Read bytes                                |
| `FileOutputStream` | Write bytes                               |
| `PrintWriter`      | Convenient text writing                   |
| `Scanner`          | Can also read text from a file            |
| `Files`            | Modern NIO file operations                |
| `Path`             | Represents a file/directory path          |
