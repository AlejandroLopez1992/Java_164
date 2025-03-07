### Scanner Functionality

#### I/O Streams

  - A stream is a sequaence of data
  - a program uses an input stream to read data from a source, one item at at time
  
  - Output Stream - System.out is a predifined OutputStream object reference that is associated with a systems standard output usually a computer screen. 
  
  - InputStream - System.in is an input byte stream
  - When using an InputStream, a programmer must append the clause  
    - throws IO exception when using the method read()
      - a thrown clause tells the Java virtual machine that the corresponding method may exit unexpectedly due to an exception, whic is an even that distrupts a programs execution

    - Instead of reading a byte stream, dealing with IOException, and after it converting the data to a String or other data types
    - Scanner can read from String 
      - Scanner scnr = new Scanner(System.in);
      - you can exchange System.in for any String
      - Scanner scnr = new Scanner("String");
      - has same method functionalities plus some
      - hasNext() - returns true if the scanner has another token in its input
      - useDelimiter("charachter_to_split_by")
        - parses the data based on charachter passed in
        - whitespace charachters are no longer ignored
        - therfore parsing will be different from standard


### More Loops

  - Changing loop order 
    - break - allows to break out of the loop completely (early exit)
    - continue - allows us to move back to the top of the code block
      - with for loops, the incrementor is still completed

### Inheritance

  - Is a relationship between a more general class (called superclass) and a more specialized class (called subclass)
  - The subclass inherits data and behavior from the superclass
  - Substitution priciple
    - states that you can always use a sublass object when a superclass object is expected
  - Overrides - Changin the implementation of a method that is defined in a parent class, to be redifined in the child class.
    - This is to appropriately edit the functionality of the method to the child classes needs.
    - Overriding method will need to take in same parameters and return same type 
    - Super class method can still be called by child class later on by using the 'super' keyword before calling the method 
    - super keyword can be called in the above constructor of child class to use the variables defined in the superclass, including private variables
      - must be written in the first line of the constructor
  - Extends keyword
    - Special keyword that is used after the class title to denotes inheritance from parent class
    - public class ChildClass extends ParentClass
  - @Override 
    - Tells the Java compiler that the following method will be overriding a parent method. This will provide better error response from Java
  
  - Object class - everything in Java is an object
    - This class includes common methods
      - toString() 
        - returns String of the object
        - by default memory location of object is Stringified
        - System.out.println() - calls toStrong()
        - String concatenation calls toString()
      - equals(Object)
        - compares memory locations meaning it's checking if instances compared are referencing the same location in memory
    
  - Inheritance is polymorphic
    - Substitution princible states that you can always use a subclass object when a superclass object is expected
    - Define a  data structure of the parent type and you can store parent and children objects
    - Calls correct class
  