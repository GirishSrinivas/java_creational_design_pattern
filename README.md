# java Creational Design Pattern

### 1. Singleton design pattern
       A. Concept
          * Only one instance is created
          * Guarantees control of resources
          * Lazily loaded
          
       B. Design
          * Non-static Class is responsible for lifecycle
          * instance variables are static in nature
          * Thread safe (static instance variables are volatile)
          * private instance
          * private constructor
          * No parameter required for constructor
          
       C. Pitfalls
          * Often overused
          * Difficult to unit test
          * if not careful during implementation, it cannot be thread-safe
          * Sometimes confused for *Factory Pattern*
          * NOTE: java.util.Calendar is NOT a Singleton
                . It is a Prototype pattern

### 2. Builder Pattern
       A. Concept
          * Handles complex constructors (Especially with large number of parameters)
          * the objects are built to be immutable
         
       B. Design
          * use of inner static class
          
### 3. Prototype Pattern
       A. Concept
          * used create a clone of an object (produce unique instance of the same object)
          * avoids costly creation
          * avoids subclassing
          * Typically does not use "new" (only First instance uses "new" keyword, and the rest of them are just cloned)
          * often utilizes an Interface
          * usually implemented with a registry
          
       B. Design
          * implements Clone / Clonable interface
          * avoids keyword "new"
          * even though instances are a clones, all of them are unique.
          * costly construction is not handled by the client
          * we can choose Shallow Vs Deep Copy
          
       C. Pitfalls
          * Not clear when to use
          * used with other patterns
            . Registry
          * Shallow Vs Deep copy
       