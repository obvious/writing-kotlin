# Writing Effective Kotlin

## 001 - Data Classes

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
- Change my phone number to 0987654321 


