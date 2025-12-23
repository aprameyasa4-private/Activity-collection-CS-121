![CS121 Banner](images/CS121-BANNER.svg)

**NOTE: Before beginning the lab, please remember to [open the workspace](images/open-lab-workspace.png) after cloning this repository in VSCode.**

# Module 3 Week 3 Activity - AdGenerator

## Purpose & Concepts 
The purpose of this activity is to practice using prior concepts and the following new concepts: String class, String substring method, String charAt method, String concatenation, NumberFormat class, Dot Operator, Constructor

## Problem Description
In this activity you will write a program that gets input from the user, stores the data in appropriate variables, and creates an advertisement based on the data given by the user.

Here is a sample session where the user input is entered after the colon. Note that the program will prompt the user for the first piece of information and wait for the user to input the value and press enter before prompting the user for the next piece of information.

```
Welcome to AdGenerator!
Please enter your profile information.
======================================
First name: Ernie 
Middle name: Chip
Last name: Douglas
Job title: Cable Guy
Phone number (10 digit): 5558233765
Hourly rate: 16.50
```
You will use what the user inputs to produce the following service advertisement.

```
============================
Need a Cable Guy?
CALL NOW! (555) 823-3765
Ask for Ernie C. Douglas
(Rates start at $16.50/hr)
============================
```

## Requirements
1. Create a class named AdGenerator
2. For each of these items: first name, middle name, last name, job title, 10 digit phone number, hourly rate
    - Prompt the user for the desired input
    - Use a Scanner to read the value from System.in
    - Store the input in an appropriately named variable
    - NOTE: Your program should use a single Scanner
3. Use the input to display the service advertisement.

## HINTS (**READ THESE**)
1. Use string concatenation and the substring method from the String class to transform the phone number to the format (###) ### - ####.
2. Use the charAt method from the String class to retrieve the first letter of the middle name and concatenate first, middle initial, and last names.
3. Use the currency format instance from the NumberFormat class to format the hourly rate.


## To Do
1. Expand the folder named a3.3-AdGenerator and create a file called AdGenerator.java
2. Outline your algorithm in main using line comments.  Be sure to make note of what variables you need and what data types they are at each step. 
3. Implement the AdGenerator class to satisfy the requirements given above.

## Review & Reflect
1. Terminology Identification: Identify examples of at least 4 different concepts listed in the "Concepts" list above. These should be identified with an @keyterm tag within the comment.
2. Code Review: When you are finished with this activity, pair up with a classmate and review each other’s code to make sure it meets all the requirements. 
3. Reflection: At the end of REFLECTION.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

## Finally
1. Commit the changes to your local repository with a message stating that Activity 3.3 is complete.
2. Push the changes from your local repository to the GitHub classroom repository.
