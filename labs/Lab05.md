---
layout: default
title: Recursive Array Methods
type: Lab
number: 05
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

<br><br>

We are going to implement methods in a class called `RecursiveArray.java`.
Start by making that file with an empty `main` method.

## 1. Sum of Numbers

We are going to create a method called `sumArray` that takes in an array of integers and returns the sum of the numbers
in the array.

### 1.2 Testing

Start by creating the method stub.
Then in the main method, write out some tests.
You can do this writing `System.out.printf("sumArray() returns %d, should be %d\n" sumArray(...), <CorrectAnswer>))`.
Here, `...` is the argument to the method and `<CorrectAnswer>` is what we expect the result of
the method to be. For example, if we pass in the array `{1, 2, 3}`, the correct answer should be `6`.

Write at least 5 tests. At least one of the tests should be an array of length `0`. 


### 1.2 Recursive method signature

Imagine we want to compute the sum of integers in an array using a recursive solution. Unlike `.substring(...)` for strings, there is no simple/straight forward method for extracting a subarray. Therefore, the signature for the recursive method might look like `public static int sumArray(int[] numbers, int index)`.

When we call this method recursively, we will pass in the same array but will update the `index`.

Now, write the method stub for this method signature.
Then, call this method from the `sumArray()` that has just one parameter.

**Question:**, when we call `sumArray(int[] numbers, int index)`, what should the initial `index` be?

### 1.3 Base Case

**Question:** What do you think is the base case where we will stop making recursive calls? Explain your answer.

<details><summary><b style="color:DodgerBlue;">ANSWER</b></summary>
When `index` is the length of the array - 1. <br>Alternatively when `index` is 0.
 </details> 
<br><br>

**Question:** Now implement the base case.


### 1.4 Recursive step

**QUESTION** During each recursive step, what do we want to keep track off, and what do we want to punt down the line?
<br><br><br>

**QUESTION** We gave two possible answers to the quesiton in 5.3.1. How would we update `index` in each recursive call for the first answer and for the second answer above?

<br><br>

**Question:** Now implement the recursive step.

### 1.5 Run the tests

Now that you implemented tests, make sure to run them.
Do your tests pass, i.e does the method return the value you expect each time? 

If so, add the following `4` tests to your main.
- `sum([2,3,4)` should return 9
- `sum([2,2,2,2])` should return 8
- `sum([1,9,8,0,2])` should return 20
- `sum([0,0,0,2,0])` should return 2

After these tests pass, you should be confident that your implementation is correct!

## 2 Product of numbers
Given an array of integers, write a method called `product` that returns the product of all the numbers in the array. `product` should have one parameter, the string of numbers. Your solution should be recursive.

For example `product([1,2,3,4])` should return 24 (good catch!). 

Use the same procedure we outlined in the previous question to complete this problem.

## 3 Keep letters
Given an array of characters, write a method called `keepLetters` 
that returns a string where the non-English alphabet letters are removed.
You must use a recursive solution. Additionally, you cannot use any `Character` or `String` methods, meaning no `getNumericalValue()` or similar methods.

For example `keepLetters(['1','2','A','3','a',4])` should return `"Aa"`.

Use the same procedure we outlined in the first question to complete this problem.


### Signing out
Before leaving, make sure your TA/instructor have signed you out of the lab. If you finish the lab early, you are free to go.
