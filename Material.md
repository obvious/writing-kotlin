# Writing Effective Kotlin

## Data Classes

There are typically two types of classes, divided by how they are used

1. Value types: These are classes that represent the _what_. They track information.
2. Transformer types: These are classes that represent business logic. They act upon value types and transform them according to business rules.

[//]: # (Code sample - dataclasses - Person)

There are situations where we want to have default values for some properties in a value type.

[//]: # (Code sample - data classes - Network request)

### Builders
The "Builder" pattern was designed to handle scenarios where you might want to configure small portions of a class.

Reference: [Java Builder](https://dzone.com/articles/design-patterns-the-builder-pattern)

[//]: # (Code sample - Add builder to Network Request)

Builders are also used to make copies of existing classes with minor changes.

[//]: # (Code sample - Make a copy of existing request and change the method and body)

Kotlin has two features on data classes which make this obsolete.

1. Default parameters: The ability to declare a default value for a constructor/function parameter
2. Copy methods: The ability to make a copy of an existing object while changing only desired properties

[//]: # (Code sample - Make a copy of existing request and change the method and body in Kotlin)

#### Exercises
Reference: [Data Classes](https://kotlinlang.org/docs/data-classes.html)

- Define a `PhoneNumber` type, which should track a given phone number and the country ISD code.
- Define an `EmailAddress` type, which should track the username, the email provider host.
- Define a `User` type, which should have an integer user ID, a name, a `PhoneNumber` and an `EmailAddress`
- Create an instance of the following user
    Name: Vinay Shenoy
    Phone Number: +91-1234567890
    Email Address: vinay@obvious.in
- Change my phone number to +91-0987654321

# DONE

### Lambdas

Interfaces let you do two things:

1. Provide configuration behaviour
2. Support event driven programming

[//]: # (Code sample: lambdas)

Note: Lambdas can be *BOTH* class properties as well as parameters to methods.

#### Exercises
References: [Lambdas](https://kotlinlang.org/docs/lambdas.html)

- Add a `removeAccount` method to the `Bank` Kotlin class
- Add a lambda method that will get invoked whenever an account is removed that gets invoked with the removed account
- Configure `firstBank` to log the removed accounts using the Android logcat
- Configure `secondBank` to log the removed account, but only if the account balance is over 5000 rupees

# DONE

### Null-safety
Reference: [Null safety](https://kotlinlang.org/docs/null-safety.html)

- Kotlin's type system variations are mainly to remove null references from code. We'll see elvis operator, not-null assertion operator and safe calls as well.

1. Nullable type variables
2. Non-nullable types
 
[//]: # (Code sample - null safety - NullSafety.kt)

### Exercises

- Create a data class `Dessert` that has your favorite pastries with the `amountOfCalories` being a nullable type
- Create an instance and add a `setCalories` function that takes `amountOfCalories` as a parameter and use a safe call to have an integer value or a -1.

# DONE

### Collection operations

Common operations typically done on collections (`List`):

1. Iteration: Do something on every item
2. Transformation: Convert each item into some other item
3. Filtering: Select some items out of the list
4. Grouping: Group information based on some criteria

[//]: # (Code sample - collections)

#### Exercises
Reference: [Collections](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/)

1. Find all mutants with 10 or more years of experience
2. Find the real names of all the good mutants
3. Concatenate the code names of all the senior mutants with a ", " (Hint: look at `joinToString``)
4. Concatenate the code names of all the good and evil mutants separately with a ", " and then concatenate these two strings together with a " VS. "

# DONE

### Sealed classes
Reference: [Sealed classes](https://kotlinlang.org/docs/sealed-classes.html)

- Better state handling with restricted types.

[//]: # (Code sample - sealed classes - Network Request)

### Exercises

- Create a `Failure` sealed class and add types of errors. Every error must be a data class that takes a string as a parameter.
Eg:  `ServerError`,`AuthenticationError` and `Exceptions` where exceptions would be unknown errors.
- Create a function that takes `Failure` as a parameter. Implement all the failures in it using a `when` condition.
Print "something went wrong` for unknown exceptions and the error names for the rest of them.

# DONE

### Utitity classes
Reference: [Extension functions](https://kotlinlang.org/docs/extensions.html)

- Syntax <className>.<functionName>
- Ability to extend the class without having to inherit from a class.
- Utility classes are generally made when we don't have access to the original source code.
- Example : if we want to add an email validation method to a string.
In Java, we would create a StringUtil class, and add a method like isEmail(String) , so we can call StringUtil.isEmail(value).
This can be replaced with extension methods in Kotlin, so we can call something like value.isEmail

### Exercises

- Create a class Shape that has `Circle` and `Triangle` as its functions which will print "this is a circle" or "triangle" in it.
Add extension function `getRadius` that takes a integer and call this in the main function.

# Additional information
- Class properties: https://kotlinlang.org/docs/properties.html

