##Identifiers, Variables, Operators

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