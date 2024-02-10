---
layout: default
title: Recursion & Arrays
type: Lab
number: 04
active_tab: lab
release_date: 2023-09-28

---

<!-- Check whether the assignment is ready to release -->
{% capture today %}{{'now' | date: '%s'}}{% endcapture %}
{% capture release_date %}{{page.release_date | date: '%s'}}{% endcapture %}
{% if release_date > today %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}
<!-- End of check whether the assignment is up to date -->


<!-- Check whether the assignment is up to date -->
<!--{% capture this_year %}{{'now' | date: '%Y'}}{% endcapture %}
{% capture due_year %}{{page.due_date | date: '%Y'}}{% endcapture %}
{% if this_year != due_year %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}-->
<!-- End of check whether the assignment is up to date -->



{% if page.materials %}
<div class="alert alert-info">
You can download the materials for this assignment here:
<ul>
{% for item in page.materials %}
<li><a href="{{item.url}}">{{ item.name }}</a></li>
{% endfor %}
</ul>

</div>
{% endif %}





{{page.type}} {{page.number}}: {{page.title}}
=============================================================

## Objectives:

The main goals for this lab are for you to get more comfortable with 
recursion and arrays.


## 1. Recursion

As discussed in class, recursion is the process of a method invoking itself over and over again. There are two components to a recursive method: 

1. A base case that determines when to stop recursively invoking the method
2. a step to perform some computation and make a recursive call to the method. The computation usually involves the results of the recursive call

> Note, make sure to have gone through Chapter 6 before completing the next part of the lab. Chapter 7.3 is helpful too.

### 1.2 Sum of numbers
Given a String of numbers, write a method called `sum` that returns the sum of all the numbers in the String. `sum` should have one parameter, the string of numbers 

For example `sum(1234)` should return 10. 

Below we are going to implement this together. The following questions will help guide you. 

#### Overview of approach

<br>
<br>
**Question 1:** Look at our class code for `ContainsLetter` to find if a char exists in a string. How does this relate to finding the sum of all the numbers in a string?

<br><br><br>

#### Base case 

**Question 2:** Let's now think about our base case, i.e. when we no longer want to make a recursive call. What would be special about the value assigned to this parameter (the String that is passed in to the method) to tell us to stop making a recursive call?

<br><br>

Now implement that base case in the method.

<br><br>

#### Recursive step

**Question 3:** During each recursive step, what do we want to keep track off, and what do we want to punt down the line?

<details><summary><b style="color:DodgerBlue;">HINT</b></summary>
What is the result of `1 + sum(234)`
</details>
<br><br>

We are almost there but there are a few things we still need to do.
**Question 4:** Given the string `1234`, how can we extract the `1`?

<details><summary><b style="color:DodgerBlue;">HINT</b></summary>
Look at the example on page 105 of the textbook.
</details>
<br><br>

**Question 5:** Given the character `1`, how can we get the integer value `1`


**Question 6:** Given the String `1234`, how can we get the substring `234`?

<details><summary><b style="color:DodgerBlue;">HINT</b></summary>
Checkout the substring methods on the java docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html </details>
<br><br>


Now we are ready to combine these answers to implement our recursive step right after our base case.

#### Testing

In your main method, test `sum()` by invoking the method with the following arugments:

- `sum(234)` should return 9
- `sum(2222)` should return 8
- `sum(19802)` should return 20
- `sum(00020)` should return 2

### 1.3 Product of numbers
Given a String of numbers, write a method called `product` that returns the sum of all the numbers in the String. `product` should have one parameter, the string of numbers

For example `product(1234)` should return 12.

## 2. Arrays

Each row in the table below represents an expression. Please fill in the **value** and **types** for each expression. If the value is an array, write out what the array would look like (i.e. the values in each index of the array). If the expression will result in an error, please specify that and the error will be.

```
int[] x = new int[5];
int[] y = {4, 2, 5};
String[] messages = new String[2];
String message = "cat!";
boolean Done = false;
```

| **Expression** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| **value**    &nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**data type**     |
|---    |---    |---    |
|   x  <br> <br> |    |     |
|   y  <br> <br> |    |     |
|   messages  <br> <br> |    |     |
| x[0] < y[0] <br> <br>|        |       |
| x[3] > y[3] <br> <br>|        |       |
| messages[0] <br> <br>|        |       |
| x.length <= y.length <br> <br> | | |
| messages[1] = message <br> <br>|      |       |       |
| messages <br> <br>|   |       |       |

## 3. Distances

In this question we will implement a method called `distances` based on the following specification.

```
/**
  Determines how far away each letter in a string is from `A` or `a` depending on if the letter is capitalized or not.
  @param word - an input string of 5 characters
  @return an array of integers. The value at each index determines how far away the corresponding character in `word` is from either `a` or `A`.
*/

public static int[] distances(String word);

```

For the sake of this problem, we can assume that `word` will only contain English letters `a-z` or `A-Z`. Later in the lab we will get rid of this assumption.

### 3.1 Method stub

Lets begin by first writing the method signature in a program called `WordDistances.java`.

**Question:** To ensure the program compiles, what do we need to add to the method?

<details><summary><b style="color:DodgerBlue;">Answer</b></summary>
We need a return statement. We can either return `null` or just a new empty array of integers.
</details>
<br><br>


### 3.2 Testing our method

Before we even begin to implement our method, its a good idea to write test cases.
In the main method, lets invokes this method multiple times. Each time we will pass in a different string. In the table below, fill in the return value that the method should return if we pass in the following strings:

| **Argument** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| **Return value**       &nbsp;&nbsp;|
|---    |---    |
|   "aaaaa"  <br> <br> |    |
|   "AAAAA"  <br> <br> |    |
|   "abcde"  <br> <br> |    |
|   "AbCdE"  <br> <br> |    |
|   "zyxvw"  <br> <br> |    |

Check with the TAs that you correctly understand the specification.

### 3.3 Algorithm

Before implementing any method, it is important to come up with an algorithm. You should write out what steps are necessary in order to solve this problem.

#### 3.3.1 Subdiving the problem - distanceFromA

Instead of tackling the entire problem at once, lets first tackle one part of the problem. For a given lowercase character, we need to determine how far away the character is from `a`.

Which of the following statements below will do that for us?

 In the table below, fill in the value for each expression. You might want to look up the ASCII value of the letters `a` or `s`.

| **Expression** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| **Value**    &nbsp;&nbsp;|
|---    |---    |
|   `s` - `a`  <br> <br> |    |
|   `s` + `a` <br> <br> |    |
|   `s` * `a`  <br> <br> |    |
|   `s` \ `a`  <br> <br> |    |
|   `s` % `a`  <br> <br> |    |

**Question:** So, which operator should we use to determine how far a lowercase character is from `a`.

<details><summary><b style="color:DodgerBlue;">Answer</b></summary>
subtraction.
</details>
<br><br>

**Question:** When we apply that operator, does the order of the operands matter? Why or why not?

<details><summary><b style="color:DodgerBlue;">Answer</b></summary>
Yes! What is `s - a` compared to `a - s`?
</details>
<br><br>

#### 3.3.2 Implementing distanceFromA

Now that we know we will need to compute the distance of a lower case character from `a`, lets implement a method to do this.

**Question:** Implement the following method

```
/**
  Determines how far a characer is from a

  @param letter - the character we are considering
  @return the distance from character to a as an integer

*/
public static int distanceFromA(char letter)
```
#### 3.3.3 Testing distanceFromA

In your main method, make sure to test that this method works as desired. I'd recommend invoking the method with the following arugments: `a`, `z`, `b`, `c`.


**Question** What should the return value of the function be when we use each of these characters as arguments?

<details><summary><b style="color:DodgerBlue;">Answer</b></summary>
`a`: 0, `z`: 25, `b`: 1, `c`: 2.
</details>
<br><br>

#### 3.3.4 Improving distanceFromA
We'd like this method to work for upper case letters as well.

**Question:** How can we modify this method so that it works with lowercase and uppercase English letters? We do not want to change the method signature, that is we want to still be able to pass in a single character and return the distance between that character and `a` or `A`.

**Write out your algorithm here in simple steps. Then update the body in `distanceFromA`. Finally, add tests to your main method to make sure `distanceFrom` works correctly for uppercase and lower case characters.**

<br><br><br><br>

#### 3.3.5 Continuing the algorithm

Now that we've figured out how to compute the distance between a single character and either `A` or `a`, let's write out or algorithm for solving the larger problem.
The following steps are out of order, put them in the correct order.

1. Update the value of the 4th index of the array
2. Determine the distance between the 3rd character and `a` or `A`
3. return the array of integers
3. Determine the distance between the 2rd character and `a` or `A`
4. Determine the distance between the 4rd character and `a` or `A`
5. Update the value of the 5th index of the array
5.  Update the value of the 3rd index of the array
5.  Determine the distance between the 5th character and `a` or `A`
6. Initialize an emtpy integer array of length 5
6. Determine the distance between the 1st character and `a` or `A`
7.  Update the value of the 2nd index of the array
8. Update the value of the 1st index of the array

### 3.4 Implementing the method

Now that you correctly ordered the steps of the algorithm, its time to implement our method.

**QUESTION::** Implement the method and then run the tests you wrote earlier in the main method to test your implementation.


### Signing out
Before leaving, make sure your TA/instructor have signed you out of the lab. If you finish the lab early, you are free to go.
