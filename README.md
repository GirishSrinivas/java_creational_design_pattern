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