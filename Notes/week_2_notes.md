## Identifiers, Variables, Operators

Types-

- int (4 bytes)
- double (8 bytes)
- char (1 byte)
- boolean (1 bit)
- String (Variable length!) -collection of ordered char

Variables-
to declare variables you need to assign it a type and identifier

Declaring reserves memory for the variable but that memory does not have to be taked up immediately

you can declare multiple variables of the same type in a line:

int x, y, z;
double fraction1, fraction2

assignment of variables can be done at the time of declaration or later on:

at time of declaration:

int five = 5;

later on:

int five;

five = 5;

- Be very careful of type compression. This is when you attempt to assign a different data type than assigned to the variable before completing a type casting. 
- In later versions of Java type compression may be allowed by the compiler in ceertain circumstances

Type casting in Java-example: (int)

Type casting is switching the data type of the variable before the variable is assigned to a new value

widening casting:

int myInt = 9;
double myDouble = myInt; //Automatic casting: int to double

narrowing casting:
double myDouble = 9.78d;
int myInt = (int) myDouble; //Manual casting: double to int

-Scanner

Read something from the console/terminal:

initializing scanner-
Scanner in = new Scanner(System.in);

assigning user input values to variables:

-int val = in.nextInt();
-double valD = in.nextDobule();
-String str = in.nextLine();
-String strInt = in.next();

typically the lines are variable.nextDATATYPE();

-Operators for increasing or decreasing by 1:

before usage:
--value and ++value
note: preincrement is nano seconds slower

after usage:
value++ and value--

Method key words:

- public: access mode is public, can be called without restrictions
- static: method belongs to the class. Can be called within the class without mentioning the class beforehand. Without need to exist from a class. Do not need to have an instance of the class object to call a static method.

- <typeOfReturn>
  - void: no return
  - Any class or primitive type: String, int, double
- <listOfParameters> 
  - list of parameters separated by a comma
  - Each parameter needs to have it's type and name

- String [] args: array of Strings.

- new: keyword that creates an object from the stated class. Used with a 

- this: keyword. Means "this object/instance". Helps keep track of which variable. Common practice But not required. similar to self in Python

## Objects are building blocks

- Objects contain information in logical order. Allow us to create a standard template for doing things Use the new keyword:
  - MyCoolObject obj = new MyCoolObject();
- new Reserves memorty for that 'instance'/object

## Class Constructor

- Special method that has the name of the class, no return, not even void.
- Can be overloaded, meaning that we have more than one implementation for the method. Same name wiothdifferent parameters.
- Methods can be called inside of the constructor

## printf()
- Structure:
  - %(flags)(width)(.precision)specifier

- method for output formatting.
- Format specifier characher needs to be used - "%"
- is then followed by a format specifier charachter that indicates the data type 
- Examples: %c, %d, %o, %h, %f, %e, %s, %%, %n

- Instance Methods:
  - static methods: belong to the class/ self contained
  - instance methods: need to access instance variables, uses the data in the object and is unique to that instance

- Casting-
  - If you want to type cast you it's important to specify the type of value you want it to turn into. example: char what = (char)('A' + 2);