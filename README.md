# BD ACS Setup

## Option 1: CodeSignal (Preferred)
Load the starter code for each problem into CodeSignal environment and build out test cases as needed within CodeSignal.

## Option 2: Local environment

#### Project Setup

1. Clone this project to your machine using `git clone <github url>`
2. Open the project in IntelliJ
3. In IntelliJ, complete the solution for each problem and run the tests present in the test directory. Make sure that all the edge cases pass.
4. Enhance the test cases by adding more scenarios that you can think of.
#### Running Your Tests

Hit the play button next to each test case or type the following command into your terminal:

```text
./gradlew clean -q :test --tests "org.bloomtech.bd.codealong*"
```

### Problem 1 : Two Dimensional Identity Matrix

#### Description

Create a square 2D array of size size x size. Fill the array with 0's.
Then draw a line of 1's down the main diagonal.
This is called an identity matrix.


#### Example

Input:

```
size = 4
```

Output:

```
solution(4) =
[
    [1, 0, 0, 0],
    [0, 1, 0, 0],
    [0, 0, 1, 0],
    [0, 0, 0, 1]
]
```

### Problem 2 : Higher Dimensional Array

#### Description

Given a 3D array `arr` of integers, your task is to find the sum of the elements at row i and column j (and any depth k).

#### Example

Input:

```
arr = 
[
    [
        [1,3,5],
        [3,4,6]
    ],
    [
        [2,5,6],
        [5,3,1]
    ]
]
row = 1
col = 1
```

Output:

```
9
```


### Problem 3 : Array Sum

#### Description

A window of size 3 moving across an array of length 9 might look like this for the first 3 moves (window is the bar over the values)

```js
  _____
  6 2 8 3 7 9 1 0 5    Window over 6,2,8

```
```js
    _____
  6 2 8 3 7 9 1 0 5    Window over 2,8,3

```
```js
      _____
  6 2 8 3 7 9 1 0 5    Window over 8,3,7
```
Your goal is to return an array of averages of the values under the window as it moves.


Input:

```
arr: [1, 2, 3, 4]
window_size: 2
```

Output:

```
[1.5, 2.5, 3.5]
```
