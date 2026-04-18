# Battle Arena Game (Java)

This is a simple console-based battle game I built while learning Object-Oriented Programming in Java.

The idea is straightforward: the player chooses a character and fights against a randomly selected enemy until one of them loses all health.

## What the program does

* Lets the user choose a character (Warrior, Mage, or Archer)
* Assigns a random enemy
* Runs a turn-based battle system
* Calculates damage using random values
* Displays health updates after each round
* Ends when one character is defeated

## Concepts I practiced

While building this, I focused on understanding how different OOP concepts work together:

* **Interfaces** – used `Attackable` to define attack behavior
* **Abstract Classes** – `Character` holds common properties like name and health
* **Inheritance** – Warrior, Mage, and Archer extend the base class
* **Polymorphism** – handling different character types using a common reference
* **Random class** – for dynamic attack damage
* **User input (Scanner)** – to make the game interactive

## How to run the program

1. Compile the files:
   javac *.java

2. Run the program:
   java Main

Make sure all `.java` files are in the same folder.

## What I learned

This project helped me move from writing simple programs to thinking in terms of objects interacting with each other. I understood how to structure code better instead of putting everything in one place.

## Possible improvements

There are still a lot of things I can improve:

* Add defend option
* Add special abilities for each character
* Improve the game flow and UI
* Remove type casting and improve design

## Author

Vanshika Sharma
