# Groovy eachWithIndex Return Behavior

This example demonstrates a common pitfall in Groovy when using the `eachWithIndex` method.  A `return` statement inside the closure does *not* return from the enclosing method; it only returns from the closure itself.  This can lead to bugs if the programmer incorrectly assumes that the method will exit prematurely.

The `bug.groovy` file shows the problematic code, while `bugSolution.groovy` provides the correct solution.