### Collections

  - A collection represents a group of objects, known as its elements
  - Some collections allow duplicate elements and others do not. Some are ordered and others unordered.
  - It is an interface
    - an interface specefies a set of behavious that other classes needs to implement

    - List
      - an ordered collection ( also known as a sequence)
      - The user of this interface has precise control over where in the list each element is inserted
      - The user can access elements by their integer index (position in the list) and search for elements in the list
      - Elements have to be of the same size and pre-defined
      
      - ArrayList
        - Rezizable-array implementation of the List interface
        - Each ArrayList instrance has a capacity
        - Capoacity is the size of the array used to store the elements
        - Whan an instance of an ArrayList reaches its capacity,. tihe instance grows automatically (resize), by doubling (1.5) its size
        - Can only store objects, so wrapper classes must be used to store primitives
        - Does not exist by default. Needs to be imported from the java.util.ArrayList; package location

        - Defining ArrayLists
          - ArrayList<Box> boxList = ArrayList<>();
            - object of type 'Box' is being defined, so only box objects are allowed in this ArrayList instance
            - boxList.add(new Box(10,3,4)); will add an object
            - boxList.add(int, value) - inserts an item at a set location
            - boxList.remove(2); will remove an object at the specified index
            - For (Box box : boxList) {  } ## this will iterate over every object in this ArrayList
            - boxList.size(); will provide the amount of elements in the list
            - boxList.get(1); will return object at index 1
            - boxList.set(int, value) - replaces an item at an alreqady existing index
            - boxList.capacity() - how many elements can be stored before a re-allocation can be done

### Method overloading and objects as parameters of methods

  - You can have the same method name, different parameters
  - Java will match the parameters on which method is called
  - Best practice:
    - Methods with less parameters call the most detailed version
    - This lets you have default values for methods
    - Makes it so you only have one place to update
    

### String manipulation

  - a string is a colection of ordered charachters
    - it has data
    - it has functionality
    - it is also immutable
      - every method that builds a String, returns a copy
      - Java does this for memory efficiency
      
            