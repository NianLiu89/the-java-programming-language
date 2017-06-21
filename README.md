#   THE Java™ Programming Language, Fourth Edition
This is the place where I took notes and practices while learning this book.

##  Chapter 1. A Quick Tour

### Unicode Chars
Java supports **unicode** characters, which means that you can define variable with name like 兀 or 念.

### String Objects
* String objects are read-only, or immutable. The classes StringBuilder and StringBuffer provide for mutable strings.
* Use `%n` instead `\n`, it gives correct line separator based on the platform.

### Generic Types
* `?` means unbounded wildcard, can represent any type
* `? extends X` means bounded wildcard, only represent the type X or any type that extends or implements X (depending on whether X is a class or interface)

### Exceptions
* **Checked exceptions** represent conditions that, although exceptional, can reasonably be expected to occur, and if they do occur must be dealt with in some way—such as the IOException that may occur reading a file.
* **Unchecked exceptions** represent conditions that, generally speaking, reflect errors in your program's logic and cannot be reasonably recovered from at run time.

##  Chapter 2. Classes and Objects
### Classes
#### Class Members
A class can have three kinds of members:
* **Fields** are the data variables associated with a class and its objects and hold the state of the class or object.
* **Methods** contain the executable code of a class and define the behavior of objects.
* **Nested classes** and **nested interfaces** are declarations of classes or interfaces that occur nested within the declaration of another class or interface.

#### Class Modifiers
* `final` - a final class cannot be subclassed.
* A class cannot be both `final` and `abstract`.

### Fields
* `transient` — This relates to object serialization
* `volatile` - This relates to synchronization and memory model issues
* A field cannot be both `final` and `volatile`.

When you decide whether a field should be final, consider three things:
* Does the field represent an immutable property of the object?
* Is the value of the field always known at the time the object is created?
* Is it always practical and appropriate to set the value of the field when the object is created?

### Access Control
* `private` - only in the class itself
* no access modifier a.k.a default access - same package and itself
* `protected` - subclasses, same package and itself
* `public` - anywhere the class is accessible
The private and protected access modifiers apply only to members not to the classes or interfaces themselves (unless nested).

### Constructors
* The default constructor—is provided automatically only if no other constructors exist. If you want both a no-arg constructor and one or more constructors with arguments, you must explicitly provide a no-arg constructor.

### Initialization Blocks
* executed as if it were placed at the beginning of every constructor in the class—with multiple blocks being executed in the order they appear in the class
* can throw a checked exception only if all constructors throw that exception

### Static Initialization Blocks
* cannot throw any checked exceptions
* executed after the class is loaded, before it is actually used

### Methods
* `final` modifier - cannot be overridden in subclass

##  Chapter 3. Extending Classes
### Accessing Inherited Members
* When you invoke a method through an object reference, the actual class of the object governs which implementation is used.
* When you access a field, the declared type of the reference is used.
### Marking Methods and Classes final
* `final` method is more efficient than non-final ones, it takes fewer steps to invoke the method. Same optimizations can be applied to private and static method, because they cannot be overridden.
* With a non-final reference, some checks can happen only at run time.



