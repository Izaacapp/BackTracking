
# Backtracking Word Finder

This repository contains a backtracking algorithm to search for words in an MxN matrix of characters. The goal is to locate specific words within the matrix, allowing for various directional paths including horizontal, vertical, and diagonal movements.

## Problem Description

Given an MxN matrix of characters and a list of words, the objective is to find each word in the matrix. The words can be formed in any direction:
- Left to right
- Right to left
- Top to bottom
- Bottom to top
- Diagonally (both ways)

A word must follow a continuous path, and the same letter cannot be reused.

## Files in the Repository

- `Main.java`: The Java program implementing the backtracking solution.
- `Plambeck_analysis.txt`: A brief analysis of the time complexity of the solution.
- `in1.txt`, `in2.txt`, `out1.txt`, `out2.txt`: Sample input and expected output files for testing.

## How to Run the Program

1. **Compile the Java Program:**
   ```sh
   javac Main.java
   ```

2. **Run the Program with Input Files:**
   ```sh
   java Main < in1.txt
   java Main < in2.txt
   ```

3. **Compare the Output:**

   After running the program, compare the actual output with the expected output provided in the `out1.txt` and `out2.txt` files:
   ```sh
   java Main < in1.txt > actual_out1.txt
   diff actual_out1.txt out1.txt
   java Main < in2.txt > actual_out2.txt
   diff actual_out2.txt out2.txt
   ```

## Example

### Sample Input
```
3 4 6
C B A B
B N O D
M D E E
ABC
BAOED
CNE
NEC
NEED
NEEDON
```

### Sample Output
```
Looking for ABC
[C, B, A,  ]
[ ,  ,  ,  ]
[ ,  ,  ,  ]

Looking for BAOED
[ , B, A,  ]
[ ,  , O,  ]
[ , D, E,  ]

Looking for CNE
[C,  ,  ,  ]
[ , N,  ,  ]
[ ,  , E,  ]

Looking for NEC
NEC not found!

Looking for NEED
[ ,  ,  ,  ]
[ , N,  , D]
[ ,  , E, E]

Looking for NEEDON
NEEDON not found!
```

## Author

This program is written by Izaac Plambeck.

