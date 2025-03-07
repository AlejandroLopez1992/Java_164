## New methods for Wrapper class conversions

### Converting to primitive types
  - intValue() - Returns the value of the wrapper class object as a primitive int value, type casting if necessery
    - object.intValue()
  - doubleValue() - Returns the value of the wrapper class oject as a primitive double value, type casting if necessary
    - object.doubleValue()
  - longValue() - returns the value of the wrapper class object as a primitive long value, type casting if necessary

### Converstions to and from strings

- Several of these methods are static which means that they can be called without the creation of an object. In these cases they must be called on an innate class such as Integer, Double
  - toString()- Returns a String containing the decimal representation of the value of someINteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the other wrapper classes
    - Double.toString(someDouble)
    - Integer.toString(someInteger)
  - parseInt() - Parses someString and returns an int representing the value endoed by someString. This static methos is also vailable for the other wrapper classes, returning the corresponding primitive type.
    - Integer.parseInt(str1)
    - Integer.parseInt("2001") returns int 2001
  - valueOf() - Parses someString and returns a new Integer object with the value endoded by someString. This static method is also available for the other wrapper classes, returning a new object of the corresponding type. 
    - Integer.valueOf(str1) 
    - integer.valueOf("2001") returns Integer 2001
  - toBinaryString() - returns a String containing the binary representation of someINteger. someInteger may be an Integer object, a int variable, or an integer literal. This static method is also available for the Long classes
    - Integer.toBinaryString(10) returns "1010"
    

#### Review


  - When we want to compare two objects .equals() is avaialble. == will compare memory location of objects so it may not always have intended use
    - a default version of .equals() is created by Java for every object type created. Needs to be defined by the developer to have intended functionality
  - Logical operators
    - && is AND- All must be true
    - || is OR - Any statement can be true, continues checking even if false 

### Composition

  - Allows us to have one class be used inside of another.
  - toString() can be defined within it's class to be functional. Can be defined to set rules for how you want your object printed out or tranformed into strings
    - public String toString() {} - is how you can define this behavior for the given class.


### Classes

 - Describe a set of objects with the same behavior
  - String class describes the behavior of all strings
  - Genereally have a public interface
    - Collection of methods through which the objects of the class can be manipulated
  - Stores it's data in instance variables (attributes)
    - Data required for executing the methods
    - Instance variables should almost always be private
    - private instance variables can only be accessed by the methods of its own class
  - Overloaded constructors
    - Same name of method with different parameters
    - Each method has a different implementation

  - Variables in the class code block
    - May be static, variable value is shared across the whole class/every instance of the class/the program
      - in order to access static variables you need to use a class name. className.variableName
    - May be instance, varible value is only set for every instance /object uniquely
      - length of String only makes sense for unique Strings!
    - final - defines a constanct value - can't be changed. naming convention is ALL_CAPS

###  Wrapper Classes

 - Wrapper classes allow us to interact with primitives in an object like manner
 - A primitive type variable directly stores the data for that variable type, such as int, double or char
 - A reference type variable can refer to an instance of a class, also known as an object
 - Wrapper classes that are built-in reference types that augment the primitive types

#### Common and useful methods
  - Charachter.isDigit(chDigit);
  - Charachter.isWhitespece(char);
  - Charachter.isLetter(char);
  - These can be paired with charAt, and loops