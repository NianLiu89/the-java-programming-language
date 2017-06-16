#   THE Java™ Programming Language, Fourth Edition
This is the place where I took notes and practices while learning this book.

##  1. A Quick Tour

### Unicode Chars
Java supports unicode characters, which means that you can define variable with name like 兀 or 念.

### String Objects
* String objects are read-only, or immutable. The classes StringBuilder and StringBuffer provide for mutable strings.
* Use %n instead \n, it gives correct line separator based on the platform.

### Generic Types
* **?** means unbounded wildcard, can represent any type
* **? extends X** means bounded wildcard, only represent the type X or any type that extends or implements X (depending on whether X is a class or interface)

### Exceptions
* Checked exceptions represent conditions that, although exceptional, can reasonably be expected to occur, and if they do occur must be dealt with in some way—such as the IOException that may occur reading a file.
* Unchecked exceptions represent conditions that, generally speaking, reflect errors in your program's logic and cannot be reasonably recovered from at run time.