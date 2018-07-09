# Explantion

An object is immutable if its state cannot change after construction. Immutable objects don’t expose any way for other objects to modify their state; the object’s fields are initialized only once inside the constructor and never change again.

In this article, we'll define the typical steps for creating an immutable class in Java and also common mistakes which are made by developers while creating immutable classes.

## How Do We Create an Immutable Class
In order to create an immutable class, you should follow the below steps:

1. Make your class final, so that no other classes can extend it.

2. Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
3. Don’t expose setter methods.
4. When exposing methods which modify the state of the class, you must always return a new instance of the class.
If the class holds a mutable object:
* Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
* Make sure to always return a clone copy of the field and never return the real object instance.
