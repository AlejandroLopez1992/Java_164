## Introduction to Recursion

- Simple recusion is a loop
  - A method that calls itself

- How to write it?
  - Write a base case(condition)
  - Write a method that calls itself

## Abstract Classes and Interfaces

- Inheritance
  - Creates an is-a realationship between classes
  - Allows fully implemented 'more generalized' classes as the super classes
    - specialized subclasses as the seublasses inherits intance varaiables and methods from the super class
    - Uses the key word extends
      - Can only extend from one immediate parent ( but can have a chain of parents)
- Polymorphism 
  - Allows the sublass to be declased as the super
    - actually a subclass can 'substitute' in for the super

- Abstract class
  - Class that does not have instances
  - Not complete by themselves
  - Contain partial implementations of a class
    - With other methods that are required to be completed by children
  - Class is abstract, some methods are abstract
  - Can have constructors the children can inherit

- Interfaces
  - Inheritance limitation: Can only inherit one class directly
    - meaning, there can be chain of classes
  - Contracts that define what methods will be implemented
  - contains no implementation- just definitions
  - uses implements in the class to say class is following the contract
  - Common Interface
    - Comparable
      - Implementing it - allows objects to be sorted in ArrayList
      - compareTo() method within it needs to be defined 