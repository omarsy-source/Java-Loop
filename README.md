# Java Fundamentals

A growing collection of small Java exercises from my programming studies. The exercises are grouped by topic and run independently.

**Focus:** loops, conditions, console input, and numeric conversion. Class and variable names are in English; simple German comments explain the code.

## Exercises

| Topic | Exercise | What it does |
| --- | --- | --- |
| Loops | [NumberSequence](src/fundamentals/loops/NumberSequence.java) | Prints the integers from 1 to a user-provided upper limit. |
| Loops | [DescendingRange](src/fundamentals/loops/DescendingRange.java) | Reads two bounds and prints their inclusive range in descending order. |
| Loops | [CandyPurchase](src/fundamentals/loops/CandyPurchase.java) | Simulates up to ten candy purchases with a price that increases by 10 cents each iteration. |
| Conversion | [DecimalToBinary](src/fundamentals/conversion/DecimalToBinary.java) | Converts a positive integer into a binary string using remainder and integer division. |

## Requirements

A Java JDK with `javac`. No external libraries, Maven, or Gradle are required. The consolidated sources were compiled and checked with JDK 17.

## Compile and run

From the repository root, compile all four exercises:

```bash
javac -encoding UTF-8 -d out src/fundamentals/loops/NumberSequence.java src/fundamentals/loops/DescendingRange.java src/fundamentals/loops/CandyPurchase.java src/fundamentals/conversion/DecimalToBinary.java
```

Then run the exercise you want:

```bash
java -cp out fundamentals.loops.NumberSequence
java -cp out fundamentals.loops.DescendingRange
java -cp out fundamentals.loops.CandyPurchase
java -cp out fundamentals.conversion.DecimalToBinary
```

Eclipse users can import the project from the repository root. Other Java IDEs can use `src` as the source folder.

## Examples

| Exercise | Input | Result |
| --- | --- | --- |
| NumberSequence | `5` | `1 2 3 4 5` |
| DescendingRange | `2`, then `5` | `5`, `4`, `3`, `2` on separate lines |
| CandyPurchase | `100` cents | 4 candies and 0 cents remaining |
| DecimalToBinary | `13` | `1101` |

## Existing behavior and limitations

- NumberSequence prints numbers rather than calculating their sum. An upper limit below 1 prints no numbers.
- CandyPurchase checks the money against the previous price before increasing it. Some inputs therefore produce a negative remainder; `0` buys one candy and leaves `-10` cents.
- DecimalToBinary prints an empty result for zero and negative values.
- The programs expect integer input; nonnumeric input is not handled.

This consolidation changes project structure and package names while preserving the existing calculations and output.

## Origins

The exercises were brought together from these earlier repositories:

- [Java-Loop source snapshot](https://github.com/omarsy-source/Java-Loop/tree/7e18cb9c9f1427752efd462e02521be302423675): DescendingRange, CandyPurchase, and DecimalToBinary.
- [Number sequence source snapshot](https://github.com/omarsy-source/for-sum-of-numbers-from-1-to-n/tree/57347de6be5b78eaa543099390f4184c4de68c24): NumberSequence.

The earlier `if-switch` repository had no Java source files at the time of consolidation.
