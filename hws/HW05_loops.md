---
layout: default
title: Loops
type: Homework
number: 05
active_tab: homework
release_date: 2023-10-09
due_date: 2023-10-21 23:59:00EDT

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
{% capture this_year %}{{'now' | date: '%Y'}}{% endcapture %}
{% capture due_year %}{{page.due_date | date: '%Y'}}{% endcapture %}
{% if this_year != due_year %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}
<!-- End of check whether the assignment is up to date -->



{% if page.materials %}
<div class="alert alert-info">
You can download the materials for this assignment here:
<ul>
{% for item in page.materials %}
<li><a href="{{item.url}}">{{ item.name }}</a></li>
{% endfor %}
</ul>


<i>Remember to make a copy of the notebook into your own Drive by choosing “Save a Copy in Drive” from Colab’s “File” menu.</i>

</div>
{% endif %}





{{page.type}} {{page.number}}: {{page.title}}
=============================================================

In this assignment you will be working with loops. You will be implementing the following methods using loops. 

> Requirements:
> 
> - Every method you created should be tested in the class's main method.
> - Every java file should have a header. However, ***DO NOT PUT YOUR NAME IN YOUR HEADERS***. On gradescope we grade your assignments anonymously so including your name in your Java file will defeat that purpose. However, please include your name in your README.txt
> - Dont forget to add `public static` to every method signature. If a method does not have these, the autograder will fail and you wont receive any points for that method.


> Note, in the examples, `*` indicates user input.


> **WARNING:** In this assignment you are **NOT ALLOWED** to import any packages. For example, you cannot use the builtin `Arrays` java class to reverse an array. Doing so will result in earning **ZERO POINTS** for a method that uses it.

> **IF YOUR CODE DOES NOT COMPILE ON GRADESCOPE, YOU WILL NOT RECEIVE ANY POINTS FROM THE AUTOGRADER**. When you submit, make sure to check if the autograder compiles and if you test some of the public test cases.


## 1. Numbers


Write a program called `NumbersLoops.java` that implements the following methods. Make sure to test the methods in the file's main method.

### 1.1 Previous even

Write a method called `previousEven` that takes in an integer and prints out all the previous even numbers.  Implement this method using a **for loop**.

For example, `previousEven(6)` should print out `6 4 2`, `previousEven(9)` should print out `8 6 4 2 `. Make sure to put a space between the numbers and print all the numbers on one line. 

It is ok if there is a space after the `2`.

### 1.2 Previous odd

Write a method called `previousOdd` that takes in an integer and prints out all the previous odd numbers.
Implement this method using a **while loop**.

For example, `previousOdd(6)` should print out `5 3 1`, `previousOdd(9)` should print out `9 7 5 3 1`. Make sure to put a space between the numbers and print all the numbers on one line. 

It is ok if there is a space after the `2`.


## 2. Playing with Words!

Write a program called `WordsLoops.java` that implements the following methods. Make sure to test the methods in the file's main method.

 
> **Hint**: You will want to use some of the `String` methods covered in Lab02 and Lab03.

### 2.1 removeLetter

Write a method called `removeLetter` that takes in a String and a letter and returns the String but will all instances of that letter removed. Implement this method using a **for loop**.

For example, `removeLetter("asdfghsassaaaae", 'a')` should return `sdfghssse`.

### 2.2 removeLetters

Write a method called `removeLetters` that takes in a String and an array of letters and returns the String but will all instances of the letters removed. Implement this method using a **while loop**.

For example, `removeLetter("asdfghsassaaaae", ['a','s'])` should return `dfghe`.

Your method can called `removeLetters` from 2.1


### 2.3 generateRandWord

Write a method called `generateRandWord` that takes in an integer and returns a word of that length of random letters from `a-z`. 
Each character should be chosen at random.
You can choose to use either a **while loop** or a **for loop**



## 3. Arrays

In a file called `ArraysLoops.java`, write the following methods.

### 3.1 isPalindrome

A palindrome is a word (or an ordered collection) that is the same backwords. For example, `madam` and `"a man, a plan, a canal – Panama` are both palindromes.

Write a method called `isPalindrome` that takes in an array of characters and returns true if the array is a palindrome. If the array is empty, the method should return `true` since that technically is a palindrome.


### 3.2 locationOf
Write a method called `locationOf` that takes in an array of integers, a specific integer, and returns the last index of where that integer appears in the array. If the integer is not in the array, return `-1.`
You can choose to use a **for loop** or a **while loop**.

For example `locationOf({2,4,5,1,5}, 5)` would return `4` and `locationOf({2,4,5,1,5}, 9)` would return `-1`.



## README.txt

In a text file called `README.txt` answer the following questions:

1. How much time did you spend on the homework
2. What did you learn from this homework
3. optional: What did you struggle with during this homework
4. optional: any other feedback you would like to share

**Dont forget:** make sure to fill in the header in all of your java files.

## Submitting

Submit the following files to the assignment called `HW06` on Gradescope:

1. `NumbersLoopsjava`
1. `WordsLoops.java`
2. `ArraysLoops.java`
4. `README.txt`

Make sure to name these files exactly what we specify here and name the methods exactly what we specify too. Otherwise,
our autograders might not work and we might have to take points off.
