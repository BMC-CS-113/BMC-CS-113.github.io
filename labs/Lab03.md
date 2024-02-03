---
layout: default
title: Conditionals & Strings
type: Lab
number: 03
active_tab: lab
release_date: 2023-09-21

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

The main goals for this lab are for you to get more comfortable with conditionals and string methods.


### Paired Programming rules

This lab is a **paired programming assignment.** What exactly does that mean? You will be working in pairs on the CS lab computers. Each pair will be working on one computer. One person will be the **driver** and the other person will be the **navigator**. Here is the rule: the **driver** controlls the lab computer, but the **driver** can only type what the **navigator** tells them to type. For this to work well, each pair should be constantly talking among themselves. After each problem, you will switch roles, the navigator will become the driver and the driver will become the navigator.

> **Switching Partners Next Week**
> This is your last week working with your current partner. Next week you will working with a new partner for the next 3 weeks. Enjoy the last lab with this partner!

### Finishing the lab

Before leaving the lab, make sure you fill out the attendance sheet and go through your answers with a TA or instructor.

## 1. Expressions 

Each row in the table below represents an expression. Please fill in the **value** and **types** for each expression.

```
int x = 5;
int y = 13;
int z = 15;
String message = "cat!";
boolean Done = false;
```

| **Expression** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| **value** 	&nbsp;&nbsp;| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**data type** 	|
|---	|---	|---	|
| x < 10 && y < 10 <br> <br>|  	|  	|
| x < 10 \|\| y < 10 <br> <br>|	|  	|  	|
| x < 10 && x > 0<br> <br>|	|  	|  	|
|x > 10 \|\| x < 0 <br> <br>|	|  	|  	|
| (5/x) > 7.0 <br> <br>|	|  	|  	|
| (z/2) > 7.0 <br> <br>|	|  	|  	|
| message.compareTo("cats") == 0 <br> <br>|	|  	|  	|
| !Done <br> <br>|	|  	|  	|
| Done \|\| (x < 6 && y > 10) <br> <br>|	|  	|  	|

# 2. Colors

Consider the following code:

```
String colorName = "purple";

if (colorName.compareTo("red") != 0) {
  System.out.println(colorName + " is not primary");
}
else if (colorName.compareTo("blue") != 0 {
  System.out.println(colorName + " is not primary");
}
else if (colorName.compareTo("yellow") != 0) {
  System.out.println(colorName + " is not primary");
}
else {
  System.out.println(colorName + " is primary");
}
```

### 2.1 Decision Diagram
**Exercise 2.1:** Draw a decision diagram corresponding to this if statement.

<br><br><br><br><br>

### 2.2 Result of code

**Exercise 2.2.1:** 
What does the above code print out when `colorName = "purple"`
<br><br><br>

**Exercise 2.2.2:** 
What does the above code print out when `colorName = "red"`
<br><br><br>

**Exercise 2.2.3:** 
What does the above code print out when `colorName = "yellow"`
<br><br><br>


# 3. Calendar

## 3.1 Month Number to Name

Write a program that inputs a month as an integer and returns a string name for that month. For example, if we call the function with the number 1, the program should print "January".

```
$ java Month
Enter an integer: 1
January

$ java Month
Enter an integer: 10
October
```

If the user inputs a number that is not between 1 and 12 (inclusive), then make sure to print out a message.

## 3.2 Month Name to Quarter

Write a program that inputs a month as a string and returns the quarter number that the month is in. For example, if we call the function with the month "January", the program should print 1. If the number is not between 1 and 12, print an error message.

> Requirement: Make sure you use a `switch/case` statement here rather than an if/else.
> Make sure to read section 5.4 of the textbook first.


# 4. Strings

Write the following methods in a file named `StringExamples.java`. Test the methods in the `main` method.

## 4.1 Even Length

Write a method, `isEvenLength`, which returns true if the given String has an even number of characters and false otherwise. Use the ternary operator. Implement tests in main to check your answer. For example,

- `isEvenLength("cat")` returns false

- `isEvenLength("")` returns true

- `isEvenLength("a")` returns false


## 4.2 Substrings

> Make sure to read section section `7.5: Substring` before completing this section.

Write a method called `subStringN` with 2 paramaters, a string and an integer `n`.

The method should print 2 substrings: 1) the first `n` characters of the string and 2) the last `n` characters of the string. For example,

- `subStringN("hello", 2)` should print `he` on one line and then `lo` on another
- `subStringN("Antidisestablishmentarianism", 4)` should print `Anti` on one line and then `nism` on another.

If the length of the string is shorter than `N`, print an message telling the user.


## Wrap up

In todays lab we covered conditionals and string methods (including comparisons).

### Signing out
Before leaving, make sure your TA/instructor have signed you out of the lab. If you finish the lab early, you are free to go.
