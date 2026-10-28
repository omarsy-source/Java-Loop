# Java Loop Exercises

Three small Java console exercises about loops, conditions, and numeric conversion. Classes and variables use English names; source comments explain the steps in simple German.

## Exercises

| Class | Behavior | Example |
| --- | --- | --- |
| [DescendingRange](LoopExercises/src/exercises/DescendingRange.java) | Reads two integers, swaps the bounds if needed, and prints the inclusive range in descending order. | `2` and `5` print `5`, `4`, `3`, `2` on separate lines. |
| [CandyPurchase](LoopExercises/src/exercises/CandyPurchase.java) | Buys up to ten candies, increasing the charged price by 10 cents each iteration, then prints the count and remaining money. | `100` cents produces 4 candies and 0 cents left. |
| [DecimalToBinary](LoopExercises/src/exercises/DecimalToBinary.java) | Builds a binary string from a positive integer using remainder and integer division. | `13` produces `1101`. |

All classes belong to the `exercises` package and run independently.

## Compile and run

Install a Java JDK. No additional libraries are required. Run from the repository root:

```bash
javac -encoding UTF-8 -d out LoopExercises/src/exercises/DescendingRange.java LoopExercises/src/exercises/CandyPurchase.java LoopExercises/src/exercises/DecimalToBinary.java
java -cp out exercises.DescendingRange
java -cp out exercises.CandyPurchase
java -cp out exercises.DecimalToBinary
```

Run one of the three `java` commands for the exercise you want. Eclipse users can import the `LoopExercises` project and run the chosen class.

## Existing limitations

- `CandyPurchase` checks the money against the previous price before increasing the price. As a result, some inputs can produce a negative remainder; input `0` still buys one candy and leaves `-10` cents.
- `DecimalToBinary` prints an empty result for zero or negative input because its loop only processes positive numbers.
- Input must be numeric; invalid input is not handled.

The naming and documentation update preserves these behaviors and the existing calculations.
