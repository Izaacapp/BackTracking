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