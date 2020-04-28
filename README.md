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
          
### 4. Factory Pattern
       A. Concept
          * Does not expose instantiation logic
          * Defer to subclasses
          * specified by architecture, implemented by user
          
       B. Design
          * Factory is responsible for lifecycle
          * common interfaces provides the rules
          * concrete classes implements the rules of the interfaces
          
       C. Pitfalls
          * it is complex
          * creation of object instance takes place in the subclass
          * if needs implementation, it has to designed from ground-up
          
### 5. Abstract Factory Pattern
       A. Concept
          * It is a Factory of factories
            . Factory of related objects
          * It has common interfaces
          * Deffers the instantiations to Subclasses
       B. Design
          * Factory is responsible for lifecycle
          * Common Interface is used in the design
          * concrete classes is used to instantiate instances
          * built using composition
       C. Pitfalls     
          * complexity in design
          * It contains patterns within a pattern
            . It starts as a Factory and can be refactors as Abstract Factory
       