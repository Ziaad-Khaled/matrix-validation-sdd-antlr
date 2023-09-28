# Matrix Validation SDD

## Description

This project involves the development of a Syntax-Directed Definition (SDD) for a context-free grammar capable of generating strings over the alphabet {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, #}. The central element of this grammar is the start variable, which possesses an attribute known as `check`. This attribute's value is set to 1 if the generated string represents a matrix of decimal digits where the sum of the first row equals the sum of the first column. If this condition is not met, the value of `check` is set to 0.

A string from the alphabet {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, #} signifies a matrix of digits if it conforms to the pattern `r1#r2#...#rn`, where each `ri` is a positive decimal digit (ranging from 0 to 9). Crucially, the number of digits in each row, denoted as `|ri|`, must be identical for all rows. This means that, for all 1 ≤ i, j ≤ n, it is mandatory that `|ri| = |rj|`.

In the development of the SDD, adherence to specific principles is maintained:

- Only a limited set of operations on attributes is allowed, including assignments, additions, subtractions, multiplications, and equality checks.
- Equality checks are expressed using the `x == y` format, resulting in a value of 1 when `x` equals `y`, and 0 otherwise. Inequality checks are not permitted.

## Implementation Details

The implementation of this project relies on ANTLR (ANother Tool for Language Recognition). The grammar that defines the language is specified in the file `grammars/MatrixValidation.g4`.

To test the grammar and perform matrix validation, a `MatrixValidationRunner` class is provided. This class demonstrates how to create a lexer and parser, input a string, parse it, and obtain the value of the `check` attribute.

For further details and to explore the project, refer to the source code.

**Note:** Ensure that you have ANTLR correctly set up and installed in your development environment to utilize this project effectively.

Enjoy exploring and validating matrices using this SDD-based grammar!
