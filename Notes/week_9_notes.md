## Operating Systems and File Output

### Operating Systems

- Base layer of software
- Controls
  - Resources
  - Hardware Interaction
  - Devices
  - Running applications, memory, ect
  - Files


### File Systems

- Program that helps manage filesand other programs
- Directory Structure
  - Relative
    - Based on current location
  - Absolute
    - Based on Root, the top of the higherarchy


### Files and Streams

- To read we can use 
  - Scanner in = new Scanner(new File("input.txt"));

- To write we will use:
  - PrintWriter writer = new PrintWriter(new File("notes.txt"));
  or
  - PrintWriter writer = new PrintWriter(new FileOutputStream("notes.txt"));

- File Object in Java
  - has a number of useful methods when dealing with files and directories
  - File myFile = new File("filename");
    - Creates a file in the same directory as that you are executing the java file from - so relative to your progrtam
      - You can create a file based on the absolute path but it is not recommended
    - Creates or reads a file based on the path+filename given
    - Actually connects to the location which is a 'stream of bytes'
    
- FileOutputStream Object in Java
  - unlike File Objects it only has write access, not read access
  - Has a number of useful methods when dealing with writing binary data to a file
  - FileOutputStream myFile = new FileOutputStream("output.txt");
    - Creates a file in the same directory as that you are executing, so relative to your program 

- Print Writer
  - object designed to write text to a file stream
  - uses the same interface as System.out but directs the stream. i.e. print(), println()
  - MAKE SURE TO use .close() to close the stream after the writing in the file!


### Exceptions and Errors

- What are exceptions?
  - Classes / Objects!
    - They contain information about the error that is happenening

  - What about try/ catch and throws?
    - Those are commands that use those objects

  - Try/Catch  
    - Try {} says try this block of code
    - catch(Exception x) {} run this block of code if there is an error
    - finally {} always run this block of code error or not (often can be ommitted, won't be used much in this class)

#### Java Exception Hierarchy

- Two major subdivisions below Throwable class
  - Error
  - Exception

- Error class is used to indicate a more serious problem in the architechture and should not be handled in the application code

- Exception class is used for exception conditions that the application may need to handle

- Exceptions are further subdivided into checked(compile time) and unchecked (run time ) exceptions

- Exceptions that occur at compile time are called checked exceptions since they need to be explicitly checked and handled in code
  - All classes with the exception of Error and RuntimeException are checked

- Unchecked exceptions can be thron "at any time" (i.e  runtime) therfore, methods dont have to 

#### Controlling Exceptions

- We can't control every possible error situation
- try 
  - try a block of code
  - if it runs properly, great!
- catch
  - an exception happened!
  - run the catch block of code
- throws
  - allows you to throw the exception
  - requires someone else to handle it
- Exception
  - an object class we use for errors
  - You can write your own
    - or use built in cases
  - Checked (compile time) or Unchecked (run time) 
    - checked required try/catch
  - IO exception - Input/Output exception - checked
  - FileNotRoundException - Subset of IOException, but allows you to specify exactly that it is file not found - checked
  - ArrayIndexOutOfBoundsException - you don't usually try/catch this, but you can - unchecked
  - NullPointerException - you don't usually try/catch this, - unchecked
  - NumberFormatException - Shows up when you take a string that doesnt look like a number, and try to make it a number - unchecked


- Multiple Handlers
  - Multiple exceptions can happen
  - Multiple throw statements can be defined in the try statement
  - catch statement is then defined for each throw object type
  - This paridigmn need to handle the more specific errors first then the more generic ones

- Finnally Block 
  - Block of commands that executes after the program exits the corresponding try or catch blocks. It is always excecuted!
  - does not run if a return statement is in the try or catch blocks
  

#### Packages

- A grouping of related types, classes, interfaces, and subpackages
- use the import key word to add those packages to your program
- java.lang is automatically imported in all Java programs
- import java.io.File, versus java.io.* 
  - the former imports File method only, the latter imports all methods and classes from io

  