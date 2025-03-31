## Polymorphism

- Has-a realationships are not inheritance. They represent when one class uses or is composed of other classes. Composition based. THis is polymorphic

- Is-a relationships are inheritance based. Everything in Java is implicitly inheriting from the Object class

- Refers to determining which program behavior to execute depending on the data types

- Polymorphism of methods - Methods overloading
  - Compile-time polymorphism
  - Compiler determiines which of several identically-nbamed methods to call based on the methods arguments

- Polymorphism of variables - involves derived classes (inheritance)
  - runtime polymorphism
  - compiler cannot make the determination but instead the determination is made while the program is runnning
  - Substitution principle - you can always use a subclass object when a superclass object is expected
  - Super class variable can store super class types and sub class types as well
  - Sub class variable can only store sub class types

- ArrayList of Objects
  - Store a collection of objects of vaious class types

- instanceof method - Can be used to determine if an object is an instanceof a particular object
  - usage: if (obj instanceof String) {}
  - will return True if obj is an instance of class being compared to or any of it's children/sub classes or interfaces