### More Recursion

- A way to repeat code without loops
- Methods that call themselves
- Recursive methods have 
  - A base case
  - recursive call
  - Return values


### The memory stack

- When calling methods
  - method is pushed on to the memory stack
  - Removed when done

- This causes the following to happen in memory
  - Any time you call a piece of code reliant on another method, each method goes on the stack 

- Stacks are first in last out data structures
  - FILO

- Multiple branching
  - Most of our cases, the tree only had one branch that continued to branch
  - The other branch was always the solution
  - What if the tree branched out on both sides?
    - Fibonacci problem
    - The sum is equal to the previous two numbers 
    - public int fibonnacci(int startingNumber) {
      if (startingNumber < 0) return 0;
      if (startingNumber < 2) return 1;
      return fibonacci(n-1) + fibonacci(n-2);
    }
    - introducting memoization or caching can make this more efficient
      - static int[] memo; 
        memo = new int[startingNumber]
        public int fibonnacci(int startingNumber) {
          if (startingNumber < 0) return 0;
          if (startingNumber < 2) return 1;
          if (memo[n-1] != 0) {
            return memo[n-1];
          }
          memo[n-1] = fib(n-1) + fib(n-2);
          return memo[n-1];
        }