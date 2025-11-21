JAVA GRID HIGHLIGHTER :

This repository contains my solution for the numeric grid generation and analysis assignment.
The program is written in Java, runs fully in the terminal, and follows all the instructions provided in the task.

🔹 About the Program

The goal of the program is to:
   Generate an N × N grid of random even numbers (2–20).
   Display the grid in a neatly formatted table.
   Ask the user for an even number (2–20).
   Highlight all occurrences of that number inside the grid.
   Show how many times it appears.
   Handle invalid inputs safely.

To make the output predictable and consistent, the program uses a fixed random seed.
This ensures that the grid looks the same every time the code runs.

🔹 How the Program Works (My Approach)


1️⃣ Reading and Validating the Grid Size

I start by taking the grid size (N) as input.
The program validates the input to ensure:
        It is a number
        It is positive
        It is not an empty/invalid string
        If the input is wrong, the user is asked again.

2️⃣ Generating Random Even Numbers

I used a single Random object with a fixed seed (12345) so the values repeat exactly.
To generate even numbers from 2 to 20:
          Generate a number from 1 to 10
          Multiply by 2
          This guarantees only even values.

3️⃣ Creating the Grid

An N × N 2D array is filled with these random even values.
This keeps the implementation clean and efficient.

4️⃣ Printing the Grid (Formatted Output)

This was the most important part of the project.
I created a custom table-style format that matches the expected output:
          Column headers
          Row headers
          Grid borders
          Proper spacing
          Two-digit alignment

The formatting is designed to look the same on all terminals.

5️⃣ Highlighting the Selected Number

After the user chooses an even number:
              Every matching value in the grid is printed as [xx]
              Others stay in normal xx format
              A counter keeps track of how many times it appears

This helps visually identify where the selected number is located.

6️⃣ Final Output

After highlighting the grid, the program prints:
            Number X appeared Y time(s)

This is simple, clear, and exactly matches the instructions.


🔹 How to Run the Program

COMPILE :
javac GridHighlighter.java

RUN :
java GridHighlighter

SAMPLE INPUT AND OUTPUT :

<img width="705" height="626" alt="image" src="https://github.com/user-attachments/assets/4311c941-ea4e-4a90-bc6c-acdaf0613804" />

<img width="443" height="481" alt="image" src="https://github.com/user-attachments/assets/750b57a1-6397-4bd8-9a20-6c90b10b3a27" />



